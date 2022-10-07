/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Number;
import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.Text;
import org.schema.model.Thing;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.PropertyValueSpecification;

/**
 * A Property value specification.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass</a>
 * @see <a href="https://schema.org/PropertyValueSpecification">https://schema.org/PropertyValueSpecification</a>
 */
@JsonLdTypeName("schema:PropertyValueSpecification")
public class PropertyValueSpecificationImpl implements PropertyValueSpecification {

    private Number fValueMaxLength;

    /**
     * Specifies the allowed range for number of characters in a literal value.
     *
     * @return {@link Number}
     */
    @Override
    public Number getValueMaxLength() {
        return fValueMaxLength;
    }

    /**
     * Specifies the allowed range for number of characters in a literal value.
     *
     */
    @Override
    public void setValueMaxLength(Number fValueMaxLength) {
        this.fValueMaxLength = fValueMaxLength;
    }

    private Boolean fReadonlyValue;

    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     *
     * @return {@link Boolean}
     */
    @Override
    public Boolean getReadonlyValue() {
        return fReadonlyValue;
    }

    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     *
     */
    @Override
    public void setReadonlyValue(Boolean fReadonlyValue) {
        this.fReadonlyValue = fReadonlyValue;
    }

    private Number fMaxValue;

    /**
     * The upper value of some characteristic or property.
     *
     * @return {@link Number}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public Number getMaxValue() {
        return fMaxValue;
    }

    /**
     * The upper value of some characteristic or property.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setMaxValue(Number fMaxValue) {
        this.fMaxValue = fMaxValue;
    }

    private Text fValueName;

    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     *
     * @return {@link Text}
     */
    @Override
    public Text getValueName() {
        return fValueName;
    }

    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     *
     */
    @Override
    public void setValueName(Text fValueName) {
        this.fValueName = fValueName;
    }

    private Object fDefaultValue;

    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     *
     * @return {@link Text} or {@link Thing}
     */
    @Override
    public <T> T getDefaultValue() {
        return (T) fDefaultValue;
    }

    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     *
     */
    @Override
    public void setDefaultValue(Object fDefaultValue) {
        if(!(fDefaultValue instanceof Text) && !(fDefaultValue instanceof Thing)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'defaultValue': " + fDefaultValue);
        }
        this.fDefaultValue = fDefaultValue;
    }

    private Number fValueMinLength;

    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     *
     * @return {@link Number}
     */
    @Override
    public Number getValueMinLength() {
        return fValueMinLength;
    }

    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     *
     */
    @Override
    public void setValueMinLength(Number fValueMinLength) {
        this.fValueMinLength = fValueMinLength;
    }

    private Boolean fValueRequired;

    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     *
     * @return {@link Boolean}
     */
    @Override
    public Boolean getValueRequired() {
        return fValueRequired;
    }

    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     *
     */
    @Override
    public void setValueRequired(Boolean fValueRequired) {
        this.fValueRequired = fValueRequired;
    }

    private Number fMinValue;

    /**
     * The lower value of some characteristic or property.
     *
     * @return {@link Number}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public Number getMinValue() {
        return fMinValue;
    }

    /**
     * The lower value of some characteristic or property.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setMinValue(Number fMinValue) {
        this.fMinValue = fMinValue;
    }

    private Text fValuePattern;

    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     *
     * @return {@link Text}
     */
    @Override
    public Text getValuePattern() {
        return fValuePattern;
    }

    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     *
     */
    @Override
    public void setValuePattern(Text fValuePattern) {
        this.fValuePattern = fValuePattern;
    }

    private Number fStepValue;

    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     *
     * @return {@link Number}
     */
    @Override
    public Number getStepValue() {
        return fStepValue;
    }

    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     *
     */
    @Override
    public void setStepValue(Number fStepValue) {
        this.fStepValue = fStepValue;
    }

    private Boolean fMultipleValues;

    /**
     * Whether multiple values are allowed for the property.  Default is false.
     *
     * @return {@link Boolean}
     */
    @Override
    public Boolean getMultipleValues() {
        return fMultipleValues;
    }

    /**
     * Whether multiple values are allowed for the property.  Default is false.
     *
     */
    @Override
    public void setMultipleValues(Boolean fMultipleValues) {
        this.fMultipleValues = fMultipleValues;
    }

    private Object fMainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) fMainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        if(!(fMainEntityOfPage instanceof CreativeWork) && !(fMainEntityOfPage instanceof URL)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'mainEntityOfPage': " + fMainEntityOfPage);
        }
        this.fMainEntityOfPage = fMainEntityOfPage;
    }

    private Text fAlternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return fAlternateName;
    }

    /**
     * An alias for the item.
     *
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }

    private Text fName;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return fName;
    }

    /**
     * The name of the item.
     *
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }

    private Action fPotentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return fPotentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        this.fPotentialAction = fPotentialAction;
    }

    private Object fImage;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) fImage;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     */
    @Override
    public void setImage(Object fImage) {
        if(!(fImage instanceof URL) && !(fImage instanceof ImageObject)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'image': " + fImage);
        }
        this.fImage = fImage;
    }

    private URL fUrl;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return fUrl;
    }

    /**
     * URL of the item.
     *
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }

    private Text fDescription;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return fDescription;
    }

    /**
     * A description of the item.
     *
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }

    private Object fSubjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) fSubjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        if(!(fSubjectOf instanceof Event) && !(fSubjectOf instanceof CreativeWork)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'subjectOf': " + fSubjectOf);
        }
        this.fSubjectOf = fSubjectOf;
    }

    private URL fAdditionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return fAdditionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }

    private Text fDisambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return fDisambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }

    private URL fSameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return fSameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }

    private Object fIdentifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) fIdentifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     */
    @Override
    public void setIdentifier(Object fIdentifier) {
        if(!(fIdentifier instanceof URL) && !(fIdentifier instanceof Text) && !(fIdentifier instanceof PropertyValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'identifier': " + fIdentifier);
        }
        this.fIdentifier = fIdentifier;
    }
}
