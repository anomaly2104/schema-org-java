/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.QualitativeValue;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Time;
import org.schema.model.datatype.Integer;
import org.schema.model.QuantitativeValue;
import org.schema.model.PriceSpecification;
import org.schema.model.datatype.Number;
import org.schema.model.Ticket;
import org.schema.model.ReservationStatusType;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.ProgramMembership;
import org.schema.model.Thing;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.Reservation;
import org.schema.model.LodgingReservation;

/**
 * A reservation for lodging at a hotel, motel, inn, etc.<br/><br/>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 *
 * @see <a href="https://schema.org/LodgingReservation">https://schema.org/LodgingReservation</a>
 */
@JsonLdTypeName("schema:LodgingReservation")
public class LodgingReservationImpl implements LodgingReservation {

    private Object fLodgingUnitType;

    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     *
     * @return {@link QualitativeValue} or {@link Text}
     */
    @Override
    public <T> T getLodgingUnitType() {
        return (T) fLodgingUnitType;
    }

    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     *
     */
    @Override
    public void setLodgingUnitType(Object fLodgingUnitType) {
        if(!(fLodgingUnitType instanceof QualitativeValue) && !(fLodgingUnitType instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'lodgingUnitType': " + fLodgingUnitType);
        }
        this.fLodgingUnitType = fLodgingUnitType;
    }

    private Text fLodgingUnitDescription;

    /**
     * A full description of the lodging unit.
     *
     * @return {@link Text}
     */
    @Override
    public Text getLodgingUnitDescription() {
        return fLodgingUnitDescription;
    }

    /**
     * A full description of the lodging unit.
     *
     */
    @Override
    public void setLodgingUnitDescription(Text fLodgingUnitDescription) {
        this.fLodgingUnitDescription = fLodgingUnitDescription;
    }

    private Object fCheckoutTime;

    /**
     * The latest someone may check out of a lodging establishment.
     *
     * @return {@link DateTime} or {@link Time}
     */
    @Override
    public <T> T getCheckoutTime() {
        return (T) fCheckoutTime;
    }

    /**
     * The latest someone may check out of a lodging establishment.
     *
     */
    @Override
    public void setCheckoutTime(Object fCheckoutTime) {
        if(!(fCheckoutTime instanceof DateTime) && !(fCheckoutTime instanceof Time)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'checkoutTime': " + fCheckoutTime);
        }
        this.fCheckoutTime = fCheckoutTime;
    }

    private Object fNumAdults;

    /**
     * The number of adults staying in the unit.
     *
     * @return {@link Integer} or {@link QuantitativeValue}
     */
    @Override
    public <T> T getNumAdults() {
        return (T) fNumAdults;
    }

    /**
     * The number of adults staying in the unit.
     *
     */
    @Override
    public void setNumAdults(Object fNumAdults) {
        if(!(fNumAdults instanceof Integer) && !(fNumAdults instanceof QuantitativeValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'numAdults': " + fNumAdults);
        }
        this.fNumAdults = fNumAdults;
    }

    private Object fCheckinTime;

    /**
     * The earliest someone may check into a lodging establishment.
     *
     * @return {@link DateTime} or {@link Time}
     */
    @Override
    public <T> T getCheckinTime() {
        return (T) fCheckinTime;
    }

    /**
     * The earliest someone may check into a lodging establishment.
     *
     */
    @Override
    public void setCheckinTime(Object fCheckinTime) {
        if(!(fCheckinTime instanceof DateTime) && !(fCheckinTime instanceof Time)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'checkinTime': " + fCheckinTime);
        }
        this.fCheckinTime = fCheckinTime;
    }

    private Object fNumChildren;

    /**
     * The number of children staying in the unit.
     *
     * @return {@link Integer} or {@link QuantitativeValue}
     */
    @Override
    public <T> T getNumChildren() {
        return (T) fNumChildren;
    }

    /**
     * The number of children staying in the unit.
     *
     */
    @Override
    public void setNumChildren(Object fNumChildren) {
        if(!(fNumChildren instanceof Integer) && !(fNumChildren instanceof QuantitativeValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'numChildren': " + fNumChildren);
        }
        this.fNumChildren = fNumChildren;
    }

    private DateTime fModifiedTime;

    /**
     * The date and time the reservation was modified.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getModifiedTime() {
        return fModifiedTime;
    }

    /**
     * The date and time the reservation was modified.
     *
     */
    @Override
    public void setModifiedTime(DateTime fModifiedTime) {
        this.fModifiedTime = fModifiedTime;
    }

    private Object fTotalPrice;

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link PriceSpecification} or {@link Number} or {@link Text}
     */
    @Override
    public <T> T getTotalPrice() {
        return (T) fTotalPrice;
    }

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     */
    @Override
    public void setTotalPrice(Object fTotalPrice) {
        if(!(fTotalPrice instanceof PriceSpecification) && !(fTotalPrice instanceof Number) && !(fTotalPrice instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'totalPrice': " + fTotalPrice);
        }
        this.fTotalPrice = fTotalPrice;
    }

    private Ticket fReservedTicket;

    /**
     * A ticket associated with the reservation.
     *
     * @return {@link Ticket}
     */
    @Override
    public Ticket getReservedTicket() {
        return fReservedTicket;
    }

    /**
     * A ticket associated with the reservation.
     *
     */
    @Override
    public void setReservedTicket(Ticket fReservedTicket) {
        this.fReservedTicket = fReservedTicket;
    }

    private ReservationStatusType fReservationStatus;

    /**
     * The current status of the reservation.
     *
     * @return {@link ReservationStatusType}
     */
    @Override
    public ReservationStatusType getReservationStatus() {
        return fReservationStatus;
    }

    /**
     * The current status of the reservation.
     *
     */
    @Override
    public void setReservationStatus(ReservationStatusType fReservationStatus) {
        this.fReservationStatus = fReservationStatus;
    }

    private Object fProvider;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public <T> T getProvider() {
        return (T) fProvider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Object fProvider) {
        if(!(fProvider instanceof Organization) && !(fProvider instanceof Person)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'provider': " + fProvider);
        }
        this.fProvider = fProvider;
    }

    private Object fBroker;

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBroker() {
        return (T) fBroker;
    }

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     */
    @Override
    public void setBroker(Object fBroker) {
        if(!(fBroker instanceof Person) && !(fBroker instanceof Organization)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'broker': " + fBroker);
        }
        this.fBroker = fBroker;
    }

    private DateTime fBookingTime;

    /**
     * The date and time the reservation was booked.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getBookingTime() {
        return fBookingTime;
    }

    /**
     * The date and time the reservation was booked.
     *
     */
    @Override
    public void setBookingTime(DateTime fBookingTime) {
        this.fBookingTime = fBookingTime;
    }

    private ProgramMembership fProgramMembershipUsed;

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @return {@link ProgramMembership}
     */
    @Override
    public ProgramMembership getProgramMembershipUsed() {
        return fProgramMembershipUsed;
    }

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     */
    @Override
    public void setProgramMembershipUsed(ProgramMembership fProgramMembershipUsed) {
        this.fProgramMembershipUsed = fProgramMembershipUsed;
    }

    private Object fBookingAgent;

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBookingAgent() {
        return (T) fBookingAgent;
    }

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     */
    @Override
    public void setBookingAgent(Object fBookingAgent) {
        if(!(fBookingAgent instanceof Person) && !(fBookingAgent instanceof Organization)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'bookingAgent': " + fBookingAgent);
        }
        this.fBookingAgent = fBookingAgent;
    }

    private Text fPriceCurrency;

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    @Override
    public Text getPriceCurrency() {
        return fPriceCurrency;
    }

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     */
    @Override
    public void setPriceCurrency(Text fPriceCurrency) {
        this.fPriceCurrency = fPriceCurrency;
    }

    private Text fReservationId;

    /**
     * A unique identifier for the reservation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getReservationId() {
        return fReservationId;
    }

    /**
     * A unique identifier for the reservation.
     *
     */
    @Override
    public void setReservationId(Text fReservationId) {
        this.fReservationId = fReservationId;
    }

    private Object fUnderName;

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getUnderName() {
        return (T) fUnderName;
    }

    /**
     * The person or organization the reservation or ticket is for.
     *
     */
    @Override
    public void setUnderName(Object fUnderName) {
        if(!(fUnderName instanceof Organization) && !(fUnderName instanceof Person)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'underName': " + fUnderName);
        }
        this.fUnderName = fUnderName;
    }

    private Thing fReservationFor;

    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getReservationFor() {
        return fReservationFor;
    }

    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     *
     */
    @Override
    public void setReservationFor(Thing fReservationFor) {
        this.fReservationFor = fReservationFor;
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
