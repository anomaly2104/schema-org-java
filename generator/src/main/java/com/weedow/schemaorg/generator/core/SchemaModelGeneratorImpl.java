package com.weedow.schemaorg.generator.core;

import com.weedow.schemaorg.generator.core.filter.SchemaDefinitionFilter;
import com.weedow.schemaorg.generator.model.Type;
import com.weedow.schemaorg.generator.model.handler.ModelHandlerUtils;
import com.weedow.schemaorg.generator.template.TemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class SchemaModelGeneratorImpl implements SchemaModelGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(SchemaModelGeneratorImpl.class);

    private static final String JAVA_EXTENSION = ".java";

    private final GeneratorOptions options;
    private final TemplateService templateService;
    private final SchemaDefinitionFilter schemaDefinitionFilter;
    private final Map<String, Type> schemaDefinitions;

    public SchemaModelGeneratorImpl(GeneratorOptions options, TemplateService templateService, SchemaDefinitionFilter schemaDefinitionFilter, Map<String, Type> schemaDefinitions) {
        this.options = options;
        this.templateService = templateService;
        this.schemaDefinitionFilter = schemaDefinitionFilter;
        this.schemaDefinitions = schemaDefinitions;
    }

    @Override
    public void generate() {
        final Path modelFolder = options.getModelFolder();
        final Path modelImplFolder = options.getModelImplFolder();
        final Path dataTypeFolder = options.getDataTypeFolder();

        if (!createFolderIfNotExists(modelFolder)) {
            LOG.error("Model directory does not exist and could not be created: {}", modelFolder);
            return;
        }
        if (!createFolderIfNotExists(modelImplFolder)) {
            LOG.error("Model Implementation directory does not exist and could not be created: {}", modelFolder);
            return;
        }
        if (!createFolderIfNotExists(dataTypeFolder)) {
            LOG.error("DataType directory does not exist and could not be created: {}", modelFolder);
            return;
        }

        LOG.info("Generating models...");

        final String modelPackage = options.getModelPackage();
        final String modelImplPackage = options.getModelImplPackage();
        final String dataTypePackage = options.getDataTypePackage();
        final List<String> models = options.getModels();

        applyTemplate(
                "templates/jsonld_typename",
                modelFolder.resolve("JsonLdTypeName.java"),
                new Context(null, modelPackage, Collections.emptySet())
        );

        applyTemplate(
                "templates/jsonld_node",
                modelFolder.resolve("JsonLdNode.java"),
                new Context(null, modelPackage, Collections.emptySet())
        );

        applyTemplate(
                "templates/jsonld_node_impl",
                modelImplFolder.resolve("JsonLdNodeImpl.java"),
                new Context(null, modelImplPackage, new LinkedHashSet<>(Arrays.asList(
                        SchemaGeneratorUtils.resolveClassName(modelPackage, dataTypePackage, SchemaGeneratorUtils.JSON_LD_NODE),
                        SchemaGeneratorUtils.resolveClassName(modelPackage, dataTypePackage, SchemaGeneratorUtils.JSON_LD_TYPE_NAME)
                )))
        );

        Map<String, Type> filteredSchemaDefinitions = schemaDefinitionFilter.filter(schemaDefinitions, models);
        if (filteredSchemaDefinitions.isEmpty()) {
            LOG.info("No schema model found to generate");
            return;
        }

        Stream<Type> stream;
        if (LOG.isDebugEnabled()/*options.isVerboseMode()*/) { // verbose mode
            stream = filteredSchemaDefinitions.values().stream();
        } else {
            stream = filteredSchemaDefinitions.values().parallelStream();
        }

        stream.forEach(type -> {
            if (type.getId().equals("schema:DataType")) {
                generateAbstractDataType(dataTypeFolder, dataTypePackage, type);
            } else if (ModelHandlerUtils.isDataType(type.getId())) {
                generateDataType(dataTypeFolder, dataTypePackage, modelPackage, type);
            } else if (ModelHandlerUtils.isSubDataType(type)) {
                generateDataType(dataTypeFolder, dataTypePackage, modelPackage, type);
            } else if (ModelHandlerUtils.isEnumeration(type)) {
                generateEnumerationType(modelFolder, modelImplFolder, modelPackage, modelImplPackage, dataTypePackage, type);
            } else {
                generateType(modelFolder, modelImplFolder, modelPackage, modelImplPackage, dataTypePackage, type);
            }
        });
        LOG.info("Model generation completed.");
    }

    private void generateAbstractDataType(Path dataTypeFolder, String dataTypePackage, Type type) {
        applyTemplate(
                "templates/abstract_data_type",
                dataTypeFolder.resolve(type.getName() + JAVA_EXTENSION),
                new Context(type, dataTypePackage, Collections.emptySet())
        );
    }

    private void generateDataType(Path dataTypeFolder, String dataTypePackage, String modelPackage, Type type) {
        final List<String> additionalImports = Collections.singletonList(SchemaGeneratorUtils.resolveClassName(modelPackage, dataTypePackage, SchemaGeneratorUtils.JSON_LD_TYPE_NAME));
        applyTemplate(
                "templates/data_type",
                dataTypeFolder.resolve(type.getName() + JAVA_EXTENSION),
                new Context(type, dataTypePackage, SchemaGeneratorUtils.getImports(modelPackage, dataTypePackage, type, additionalImports))
        );
    }

    private void generateEnumerationType(Path modelFolder, Path modelImplFolder, String modelPackage, String modelImplPackage, String dataTypePackage, Type type) {
        applyTemplate(
                "templates/type_interface",
                modelFolder.resolve(type.getName() + JAVA_EXTENSION),
                new Context(type, modelPackage, SchemaGeneratorUtils.getImports(modelPackage, dataTypePackage, type, Collections.emptyList()))
        );

        applyTemplate(
                "templates/type_enumeration",
                modelImplFolder.resolve(type.getName() + "Enum" + JAVA_EXTENSION),
                new Context(type, modelImplPackage, SchemaGeneratorUtils.getAllImports(modelPackage, dataTypePackage, type))
        );
    }

    private void generateType(Path modelFolder, Path modelImplFolder, String modelPackage, String modelImplPackage, String dataTypePackage, Type type) {
        applyTemplate(
                "templates/type_interface",
                modelFolder.resolve(type.getName() + JAVA_EXTENSION),
                new Context(type, modelPackage, SchemaGeneratorUtils.getImports(modelPackage, dataTypePackage, type, Collections.emptyList()))
        );

        applyTemplate(
                "templates/type_implementation",
                modelImplFolder.resolve(type.getName() + "Impl" + JAVA_EXTENSION),
                new Context(type, modelImplPackage, SchemaGeneratorUtils.getAllImports(modelPackage, dataTypePackage, type))
        );
    }

    private void applyTemplate(String templateLocation, Path outputFile, Context context) {
        try {
            templateService.apply(templateLocation, outputFile, context);
            options.getSuccessHandlers().forEach(successHandler -> successHandler.onSuccess(templateLocation, outputFile, context));
        } catch (IOException e) {
            LOG.warn("Could not write output file {} from template '{}': {}", outputFile, templateLocation, e.getMessage());
            options.getErrorHandlers().forEach(errorHandler -> errorHandler.onError(templateLocation, outputFile, context, e));
        }
    }

    private static boolean createFolderIfNotExists(Path folder) {
        try {
            return Files.exists(Files.createDirectories(folder));
        } catch (IOException e) {
            LOG.warn("Could not create directory {}: {}", folder, e.getMessage());
            return false;
        }
    }
}
