/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Enumeration;
import org.schema.model.DefinedTerm;
import org.schema.model.datatype.Text;
import org.schema.model.MeasurementTypeEnumeration;
import org.schema.model.QualitativeValue;
import org.schema.model.StructuredValue;
import org.schema.model.PropertyValue;
import org.schema.model.QuantitativeValue;
import org.schema.model.Class;
import org.schema.model.Property;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import java.util.List;
import org.schema.model.Intangible;
import com.weedow.schemaorg.commons.model.JsonLdSubTypes;

/**
 * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/QualitativeValue">https://schema.org/QualitativeValue</a>
 */
@JsonLdTypeName("QualitativeValue")
@JsonLdSubTypes({ "SizeSpecificationEnum", "SteeringPositionValueEnum", "DriveWheelConfigurationValueEnum", "BedTypeEnum" })
public enum QualitativeValueEnum implements QualitativeValue {
    ;

    private final String enumValue;

    QualitativeValueEnum(String enumValue) {
        this.enumValue = enumValue;
    }

    public static QualitativeValueEnum from(String value) {
        for (QualitativeValueEnum item : values()) {
            if (item.enumValue.equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return enumValue;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getContext() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getId() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setContext(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setContext' not allowed for enum QualitativeValueEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setId(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setId' not allowed for enum QualitativeValueEnum");
    }


    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> List<T> getValueReferenceList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getValueReference() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(Enumeration valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(DefinedTerm valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(Text valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(MeasurementTypeEnumeration valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(QualitativeValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(StructuredValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(PropertyValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addValueReference(QuantitativeValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<QualitativeValue> getGreaterOrEqualList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getGreaterOrEqual() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addGreaterOrEqual(QualitativeValue greaterOrEqual) {
        throw new java.lang.IllegalAccessError("Unable to set property 'greaterOrEqual': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<QualitativeValue> getNonEqualList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getNonEqual() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addNonEqual(QualitativeValue nonEqual) {
        throw new java.lang.IllegalAccessError("Unable to set property 'nonEqual': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<QualitativeValue> getEqualList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getEqual() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addEqual(QualitativeValue equal) {
        throw new java.lang.IllegalAccessError("Unable to set property 'equal': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<QualitativeValue> getLesserList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getLesser() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addLesser(QualitativeValue lesser) {
        throw new java.lang.IllegalAccessError("Unable to set property 'lesser': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<QualitativeValue> getGreaterList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getGreater() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addGreater(QualitativeValue greater) {
        throw new java.lang.IllegalAccessError("Unable to set property 'greater': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<PropertyValue> getAdditionalPropertyList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public PropertyValue getAdditionalProperty() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addAdditionalProperty(PropertyValue additionalProperty) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalProperty': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<QualitativeValue> getLesserOrEqualList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getLesserOrEqual() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addLesserOrEqual(QualitativeValue lesserOrEqual) {
        throw new java.lang.IllegalAccessError("Unable to set property 'lesserOrEqual': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> List<T> getSupersededByList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSupersededBy() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addSupersededBy(Enumeration supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addSupersededBy(Class supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addSupersededBy(Property supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> List<T> getMainEntityOfPageList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getMainEntityOfPage() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addMainEntityOfPage(CreativeWork mainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addMainEntityOfPage(URL mainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<Text> getAlternateNameList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getAlternateName() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addAlternateName(Text alternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<Text> getNameList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getName() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addName(Text name) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<Action> getPotentialActionList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Action getPotentialAction() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addPotentialAction(Action potentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> List<T> getImageList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getImage() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addImage(URL image) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addImage(ImageObject image) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<URL> getUrlList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getUrl() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addUrl(URL url) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<Text> getDescriptionList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDescription() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addDescription(Text description) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> List<T> getSubjectOfList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSubjectOf() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addSubjectOf(Event subjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addSubjectOf(CreativeWork subjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<URL> getAdditionalTypeList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getAdditionalType() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addAdditionalType(URL additionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<Text> getDisambiguatingDescriptionList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDisambiguatingDescription() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addDisambiguatingDescription(Text disambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public List<URL> getSameAsList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getSameAs() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addSameAs(URL sameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> List<T> getIdentifierList() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getIdentifier() { return null; }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addIdentifier(URL identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addIdentifier(Text identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum QualitativeValueEnum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void addIdentifier(PropertyValue identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum QualitativeValueEnum");
    }
}
