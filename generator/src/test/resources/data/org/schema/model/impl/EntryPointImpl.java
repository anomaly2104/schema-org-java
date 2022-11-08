/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.SoftwareApplication;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.DigitalPlatformEnumeration;
import org.schema.model.CreativeWork;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.EntryPoint;

/**
 * An entry point, within some Web-based protocol.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass</a>
 * @see <a href="https://schema.org/EntryPoint">https://schema.org/EntryPoint</a>
 */
@JsonLdTypeName("schema:EntryPoint")
public class EntryPointImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements EntryPoint {

    private SoftwareApplication fActionApplication;

    /**
     * An application that can complete the request.
     *
     * @return {@link SoftwareApplication}
     */
    @Override
    public SoftwareApplication getActionApplication() {
        return fActionApplication;
    }

    /**
     * An application that can complete the request.
     *
     */
    @Override
    public void setActionApplication(SoftwareApplication fActionApplication) {
        this.fActionApplication = fActionApplication;
    }

    private SoftwareApplication fApplication;

    /**
     * An application that can complete the request.
     *
     * @return {@link SoftwareApplication}
     */
    @Override
    public SoftwareApplication getApplication() {
        return fApplication;
    }

    /**
     * An application that can complete the request.
     *
     */
    @Override
    public void setApplication(SoftwareApplication fApplication) {
        this.fApplication = fApplication;
    }

    private Object fActionPlatform;

    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @return {@link Text} or {@link URL} or {@link DigitalPlatformEnumeration}
     */
    @Override
    public <T> T getActionPlatform() {
        return (T) fActionPlatform;
    }

    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     */
    @Override
    public void setActionPlatform(Object fActionPlatform) {
        if(!(fActionPlatform instanceof Text) && !(fActionPlatform instanceof URL) && !(fActionPlatform instanceof DigitalPlatformEnumeration)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'actionPlatform': " + fActionPlatform);
        }
        this.fActionPlatform = fActionPlatform;
    }

    private Text fHttpMethod;

    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     *
     * @return {@link Text}
     */
    @Override
    public Text getHttpMethod() {
        return fHttpMethod;
    }

    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     *
     */
    @Override
    public void setHttpMethod(Text fHttpMethod) {
        this.fHttpMethod = fHttpMethod;
    }

    private Text fUrlTemplate;

    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     *
     * @return {@link Text}
     */
    @Override
    public Text getUrlTemplate() {
        return fUrlTemplate;
    }

    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     *
     */
    @Override
    public void setUrlTemplate(Text fUrlTemplate) {
        this.fUrlTemplate = fUrlTemplate;
    }

    private Text fEncodingType;

    /**
     * The supported encoding type(s) for an EntryPoint request.
     *
     * @return {@link Text}
     */
    @Override
    public Text getEncodingType() {
        return fEncodingType;
    }

    /**
     * The supported encoding type(s) for an EntryPoint request.
     *
     */
    @Override
    public void setEncodingType(Text fEncodingType) {
        this.fEncodingType = fEncodingType;
    }

    private Text fContentType;

    /**
     * The supported content type(s) for an EntryPoint response.
     *
     * @return {@link Text}
     */
    @Override
    public Text getContentType() {
        return fContentType;
    }

    /**
     * The supported content type(s) for an EntryPoint response.
     *
     */
    @Override
    public void setContentType(Text fContentType) {
        this.fContentType = fContentType;
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
