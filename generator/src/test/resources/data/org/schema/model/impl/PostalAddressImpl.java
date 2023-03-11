/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Text;
import org.schema.model.Country;
import org.schema.model.AdministrativeArea;
import org.schema.model.Place;
import org.schema.model.GeoShape;
import org.schema.model.Language;
import org.schema.model.Product;
import org.schema.model.ContactPointOption;
import org.schema.model.OpeningHoursSpecification;
import org.schema.model.Action;
import org.schema.model.datatype.URL;
import org.schema.model.CreativeWork;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.ImageObject;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import java.util.List;
import org.schema.model.Intangible;
import org.schema.model.StructuredValue;
import org.schema.model.ContactPoint;
import org.schema.model.PostalAddress;

/**
 * The mailing address.
 *
 * @see <a href="https://schema.org/PostalAddress">https://schema.org/PostalAddress</a>
 */
@JsonLdTypeName("PostalAddress")
public class PostalAddressImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements PostalAddress {

    private List<Text> addressLocality;

    /**
     * The locality in which the street address is, and which is in the region. For example, Mountain View.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getAddressLocalityList() {
        return addressLocality;
    }

    /**
     * The locality in which the street address is, and which is in the region. For example, Mountain View.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAddressLocality() {
        return getFirst(addressLocality);
    }

    /**
     * The locality in which the street address is, and which is in the region. For example, Mountain View.
     *
     * @param addressLocality Text value to set.
     */
    @Override
    public void addAddressLocality(Text addressLocality) {
        this.addressLocality = add(this.addressLocality, addressLocality);
    }

    private List<Text> postOfficeBoxNumber;

    /**
     * The post office box number for PO box addresses.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getPostOfficeBoxNumberList() {
        return postOfficeBoxNumber;
    }

    /**
     * The post office box number for PO box addresses.
     *
     * @return {@link Text}
     */
    @Override
    public Text getPostOfficeBoxNumber() {
        return getFirst(postOfficeBoxNumber);
    }

    /**
     * The post office box number for PO box addresses.
     *
     * @param postOfficeBoxNumber Text value to set.
     */
    @Override
    public void addPostOfficeBoxNumber(Text postOfficeBoxNumber) {
        this.postOfficeBoxNumber = add(this.postOfficeBoxNumber, postOfficeBoxNumber);
    }

    private List<Text> streetAddress;

    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getStreetAddressList() {
        return streetAddress;
    }

    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     *
     * @return {@link Text}
     */
    @Override
    public Text getStreetAddress() {
        return getFirst(streetAddress);
    }

    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     *
     * @param streetAddress Text value to set.
     */
    @Override
    public void addStreetAddress(Text streetAddress) {
        this.streetAddress = add(this.streetAddress, streetAddress);
    }

    @JsonLdFieldTypes({ Country.class, Text.class })
    private List<Object> addressCountry;

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public <T> List<T> getAddressCountryList() {
        return (List<T>) addressCountry;
    }

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public <T> T getAddressCountry() {
        return (T) getFirst(addressCountry);
    }

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @param addressCountry Country value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public void addAddressCountry(Country addressCountry) {
        this.addressCountry = add(this.addressCountry, addressCountry);
    }
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @param addressCountry Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public void addAddressCountry(Text addressCountry) {
        this.addressCountry = add(this.addressCountry, addressCountry);
    }

    private List<Text> postalCode;

    /**
     * The postal code. For example, 94043.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public List<Text> getPostalCodeList() {
        return postalCode;
    }

    /**
     * The postal code. For example, 94043.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public Text getPostalCode() {
        return getFirst(postalCode);
    }

    /**
     * The postal code. For example, 94043.
     *
     * @param postalCode Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public void addPostalCode(Text postalCode) {
        this.postalCode = add(this.postalCode, postalCode);
    }

    private List<Text> addressRegion;

    /**
     * The region in which the locality is, and which is in the country. For example, California or another appropriate first-level [Administrative division](https://en.wikipedia.org/wiki/List_of_administrative_divisions_by_country).
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public List<Text> getAddressRegionList() {
        return addressRegion;
    }

    /**
     * The region in which the locality is, and which is in the country. For example, California or another appropriate first-level [Administrative division](https://en.wikipedia.org/wiki/List_of_administrative_divisions_by_country).
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public Text getAddressRegion() {
        return getFirst(addressRegion);
    }

    /**
     * The region in which the locality is, and which is in the country. For example, California or another appropriate first-level [Administrative division](https://en.wikipedia.org/wiki/List_of_administrative_divisions_by_country).
     *
     * @param addressRegion Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public void addAddressRegion(Text addressRegion) {
        this.addressRegion = add(this.addressRegion, addressRegion);
    }

    @JsonLdFieldTypes({ AdministrativeArea.class, Place.class, GeoShape.class })
    private List<Object> serviceArea;

    /**
     * The geographic area where the service is provided.
     *
     * @return {@link AdministrativeArea} or {@link Place} or {@link GeoShape}
     */
    @Override
    public <T> List<T> getServiceAreaList() {
        return (List<T>) serviceArea;
    }

    /**
     * The geographic area where the service is provided.
     *
     * @return {@link AdministrativeArea} or {@link Place} or {@link GeoShape}
     */
    @Override
    public <T> T getServiceArea() {
        return (T) getFirst(serviceArea);
    }

    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea AdministrativeArea value to set.
     */
    @Override
    public void addServiceArea(AdministrativeArea serviceArea) {
        this.serviceArea = add(this.serviceArea, serviceArea);
    }
    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea Place value to set.
     */
    @Override
    public void addServiceArea(Place serviceArea) {
        this.serviceArea = add(this.serviceArea, serviceArea);
    }
    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea GeoShape value to set.
     */
    @Override
    public void addServiceArea(GeoShape serviceArea) {
        this.serviceArea = add(this.serviceArea, serviceArea);
    }

    @JsonLdFieldTypes({ Text.class, Language.class })
    private List<Object> availableLanguage;

    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]].
     *
     * @return {@link Text} or {@link Language}
     */
    @Override
    public <T> List<T> getAvailableLanguageList() {
        return (List<T>) availableLanguage;
    }

    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]].
     *
     * @return {@link Text} or {@link Language}
     */
    @Override
    public <T> T getAvailableLanguage() {
        return (T) getFirst(availableLanguage);
    }

    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]].
     *
     * @param availableLanguage Text value to set.
     */
    @Override
    public void addAvailableLanguage(Text availableLanguage) {
        this.availableLanguage = add(this.availableLanguage, availableLanguage);
    }
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]].
     *
     * @param availableLanguage Language value to set.
     */
    @Override
    public void addAvailableLanguage(Language availableLanguage) {
        this.availableLanguage = add(this.availableLanguage, availableLanguage);
    }

    @JsonLdFieldTypes({ Text.class, Product.class })
    private List<Object> productSupported;

    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     *
     * @return {@link Text} or {@link Product}
     */
    @Override
    public <T> List<T> getProductSupportedList() {
        return (List<T>) productSupported;
    }

    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     *
     * @return {@link Text} or {@link Product}
     */
    @Override
    public <T> T getProductSupported() {
        return (T) getFirst(productSupported);
    }

    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     *
     * @param productSupported Text value to set.
     */
    @Override
    public void addProductSupported(Text productSupported) {
        this.productSupported = add(this.productSupported, productSupported);
    }
    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     *
     * @param productSupported Product value to set.
     */
    @Override
    public void addProductSupported(Product productSupported) {
        this.productSupported = add(this.productSupported, productSupported);
    }

    @JsonLdFieldTypes({ Text.class, Place.class, GeoShape.class, AdministrativeArea.class })
    private List<Object> areaServed;

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link Text} or {@link Place} or {@link GeoShape} or {@link AdministrativeArea}
     */
    @Override
    public <T> List<T> getAreaServedList() {
        return (List<T>) areaServed;
    }

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link Text} or {@link Place} or {@link GeoShape} or {@link AdministrativeArea}
     */
    @Override
    public <T> T getAreaServed() {
        return (T) getFirst(areaServed);
    }

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Text value to set.
     */
    @Override
    public void addAreaServed(Text areaServed) {
        this.areaServed = add(this.areaServed, areaServed);
    }
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Place value to set.
     */
    @Override
    public void addAreaServed(Place areaServed) {
        this.areaServed = add(this.areaServed, areaServed);
    }
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed GeoShape value to set.
     */
    @Override
    public void addAreaServed(GeoShape areaServed) {
        this.areaServed = add(this.areaServed, areaServed);
    }
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed AdministrativeArea value to set.
     */
    @Override
    public void addAreaServed(AdministrativeArea areaServed) {
        this.areaServed = add(this.areaServed, areaServed);
    }

    private List<ContactPointOption> contactOption;

    /**
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     *
     * @return {@link ContactPointOption}
     */
    @Override
    public List<ContactPointOption> getContactOptionList() {
        return contactOption;
    }

    /**
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     *
     * @return {@link ContactPointOption}
     */
    @Override
    public ContactPointOption getContactOption() {
        return getFirst(contactOption);
    }

    /**
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     *
     * @param contactOption ContactPointOption value to set.
     */
    @Override
    public void addContactOption(ContactPointOption contactOption) {
        this.contactOption = add(this.contactOption, contactOption);
    }

    private List<Text> email;

    /**
     * Email address.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getEmailList() {
        return email;
    }

    /**
     * Email address.
     *
     * @return {@link Text}
     */
    @Override
    public Text getEmail() {
        return getFirst(email);
    }

    /**
     * Email address.
     *
     * @param email Text value to set.
     */
    @Override
    public void addEmail(Text email) {
        this.email = add(this.email, email);
    }

    private List<Text> contactType;

    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getContactTypeList() {
        return contactType;
    }

    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     *
     * @return {@link Text}
     */
    @Override
    public Text getContactType() {
        return getFirst(contactType);
    }

    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     *
     * @param contactType Text value to set.
     */
    @Override
    public void addContactType(Text contactType) {
        this.contactType = add(this.contactType, contactType);
    }

    private List<OpeningHoursSpecification> hoursAvailable;

    /**
     * The hours during which this service or contact is available.
     *
     * @return {@link OpeningHoursSpecification}
     */
    @Override
    public List<OpeningHoursSpecification> getHoursAvailableList() {
        return hoursAvailable;
    }

    /**
     * The hours during which this service or contact is available.
     *
     * @return {@link OpeningHoursSpecification}
     */
    @Override
    public OpeningHoursSpecification getHoursAvailable() {
        return getFirst(hoursAvailable);
    }

    /**
     * The hours during which this service or contact is available.
     *
     * @param hoursAvailable OpeningHoursSpecification value to set.
     */
    @Override
    public void addHoursAvailable(OpeningHoursSpecification hoursAvailable) {
        this.hoursAvailable = add(this.hoursAvailable, hoursAvailable);
    }

    private List<Text> faxNumber;

    /**
     * The fax number.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getFaxNumberList() {
        return faxNumber;
    }

    /**
     * The fax number.
     *
     * @return {@link Text}
     */
    @Override
    public Text getFaxNumber() {
        return getFirst(faxNumber);
    }

    /**
     * The fax number.
     *
     * @param faxNumber Text value to set.
     */
    @Override
    public void addFaxNumber(Text faxNumber) {
        this.faxNumber = add(this.faxNumber, faxNumber);
    }

    private List<Text> telephone;

    /**
     * The telephone number.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getTelephoneList() {
        return telephone;
    }

    /**
     * The telephone number.
     *
     * @return {@link Text}
     */
    @Override
    public Text getTelephone() {
        return getFirst(telephone);
    }

    /**
     * The telephone number.
     *
     * @param telephone Text value to set.
     */
    @Override
    public void addTelephone(Text telephone) {
        this.telephone = add(this.telephone, telephone);
    }

    private List<Action> potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public List<Action> getPotentialActionList() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return getFirst(potentialAction);
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void addPotentialAction(Action potentialAction) {
        this.potentialAction = add(this.potentialAction, potentialAction);
    }

    @JsonLdFieldTypes({ URL.class, CreativeWork.class })
    private List<Object> mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link URL} or {@link CreativeWork}
     */
    @Override
    public <T> List<T> getMainEntityOfPageList() {
        return (List<T>) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link URL} or {@link CreativeWork}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) getFirst(mainEntityOfPage);
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void addMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void addMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }

    @JsonLdFieldTypes({ Event.class, CreativeWork.class })
    private List<Object> subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> List<T> getSubjectOfList() {
        return (List<T>) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) getFirst(subjectOf);
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(Event subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }

    private List<URL> url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getUrlList() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return getFirst(url);
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void addUrl(URL url) {
        this.url = add(this.url, url);
    }

    private List<Text> alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getAlternateNameList() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return getFirst(alternateName);
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void addAlternateName(Text alternateName) {
        this.alternateName = add(this.alternateName, alternateName);
    }

    private List<URL> sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getSameAsList() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return getFirst(sameAs);
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void addSameAs(URL sameAs) {
        this.sameAs = add(this.sameAs, sameAs);
    }

    private List<Text> description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDescriptionList() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return getFirst(description);
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void addDescription(Text description) {
        this.description = add(this.description, description);
    }

    private List<Text> disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDisambiguatingDescriptionList() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return getFirst(disambiguatingDescription);
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void addDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = add(this.disambiguatingDescription, disambiguatingDescription);
    }

    @JsonLdFieldTypes({ PropertyValue.class, URL.class, Text.class })
    private List<Object> identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     */
    @Override
    public <T> List<T> getIdentifierList() {
        return (List<T>) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) getFirst(identifier);
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void addIdentifier(PropertyValue identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void addIdentifier(URL identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void addIdentifier(Text identifier) {
        this.identifier = add(this.identifier, identifier);
    }

    @JsonLdFieldTypes({ URL.class, ImageObject.class })
    private List<Object> image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> List<T> getImageList() {
        return (List<T>) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) getFirst(image);
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void addImage(URL image) {
        this.image = add(this.image, image);
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void addImage(ImageObject image) {
        this.image = add(this.image, image);
    }

    private List<Text> name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getNameList() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return getFirst(name);
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void addName(Text name) {
        this.name = add(this.name, name);
    }

    private List<URL> additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getAdditionalTypeList() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return getFirst(additionalType);
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void addAdditionalType(URL additionalType) {
        this.additionalType = add(this.additionalType, additionalType);
    }
}
