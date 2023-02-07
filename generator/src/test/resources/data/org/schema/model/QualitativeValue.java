/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Enumeration;
import org.schema.model.DefinedTerm;
import org.schema.model.datatype.Text;
import org.schema.model.MeasurementTypeEnumeration;
import org.schema.model.QualitativeValue;
import org.schema.model.StructuredValue;
import org.schema.model.PropertyValue;
import org.schema.model.QuantitativeValue;

/**
 * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/QualitativeValue">https://schema.org/QualitativeValue</a>
 */
public interface QualitativeValue extends Enumeration {

    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @return {@link Enumeration} or {@link DefinedTerm} or {@link Text} or {@link MeasurementTypeEnumeration} or {@link QualitativeValue} or {@link StructuredValue} or {@link PropertyValue} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> List<T> getValueReferenceList();

    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @return {@link Enumeration} or {@link DefinedTerm} or {@link Text} or {@link MeasurementTypeEnumeration} or {@link QualitativeValue} or {@link StructuredValue} or {@link PropertyValue} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getValueReference();

    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference Enumeration value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(Enumeration valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference DefinedTerm value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(DefinedTerm valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(Text valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference MeasurementTypeEnumeration value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(MeasurementTypeEnumeration valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(QualitativeValue valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference StructuredValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(StructuredValue valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference PropertyValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(PropertyValue valueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param valueReference QuantitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addValueReference(QuantitativeValue valueReference);

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<QualitativeValue> getGreaterOrEqualList();

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    QualitativeValue getGreaterOrEqual();

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     *
     * @param greaterOrEqual QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addGreaterOrEqual(QualitativeValue greaterOrEqual);

    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<QualitativeValue> getNonEqualList();

    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    QualitativeValue getNonEqual();

    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     *
     * @param nonEqual QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addNonEqual(QualitativeValue nonEqual);

    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<QualitativeValue> getEqualList();

    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    QualitativeValue getEqual();

    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     *
     * @param equal QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addEqual(QualitativeValue equal);

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<QualitativeValue> getLesserList();

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    QualitativeValue getLesser();

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     *
     * @param lesser QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addLesser(QualitativeValue lesser);

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<QualitativeValue> getGreaterList();

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    QualitativeValue getGreater();

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     *
     * @param greater QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addGreater(QualitativeValue greater);

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @return {@link PropertyValue}
     */
    List<PropertyValue> getAdditionalPropertyList();

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @return {@link PropertyValue}
     */
    PropertyValue getAdditionalProperty();

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @param additionalProperty PropertyValue value to set.
     */
    void addAdditionalProperty(PropertyValue additionalProperty);

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<QualitativeValue> getLesserOrEqualList();

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     *
     * @return {@link QualitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    QualitativeValue getLesserOrEqual();

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     *
     * @param lesserOrEqual QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addLesserOrEqual(QualitativeValue lesserOrEqual);
}
