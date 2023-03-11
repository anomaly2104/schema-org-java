/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Thing;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Time;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.ActionStatusType;
import org.schema.model.datatype.URL;
import org.schema.model.EntryPoint;
import org.schema.model.Place;
import org.schema.model.datatype.Text;
import org.schema.model.VirtualLocation;
import org.schema.model.PostalAddress;
import org.schema.model.Action;
import org.schema.model.CreativeWork;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.ImageObject;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import java.util.List;
import org.schema.model.UpdateAction;

/**
 * The act of managing by changing/editing the state of the object.
 *
 * @see <a href="https://schema.org/UpdateAction">https://schema.org/UpdateAction</a>
 */
@JsonLdTypeName("UpdateAction")
public class UpdateActionImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements UpdateAction {

    private List<Thing> collection;

    /**
     * A sub property of object. The collection target of the action.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getCollectionList() {
        return collection;
    }

    /**
     * A sub property of object. The collection target of the action.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getCollection() {
        return getFirst(collection);
    }

    /**
     * A sub property of object. The collection target of the action.
     *
     * @param collection Thing value to set.
     */
    @Override
    public void addCollection(Thing collection) {
        this.collection = add(this.collection, collection);
    }

    private List<Thing> targetCollection;

    /**
     * A sub property of object. The collection target of the action.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getTargetCollectionList() {
        return targetCollection;
    }

    /**
     * A sub property of object. The collection target of the action.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getTargetCollection() {
        return getFirst(targetCollection);
    }

    /**
     * A sub property of object. The collection target of the action.
     *
     * @param targetCollection Thing value to set.
     */
    @Override
    public void addTargetCollection(Thing targetCollection) {
        this.targetCollection = add(this.targetCollection, targetCollection);
    }

    @JsonLdFieldTypes({ DateTime.class, Time.class })
    private List<Object> endTime;

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public <T> List<T> getEndTimeList() {
        return (List<T>) endTime;
    }

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public <T> T getEndTime() {
        return (T) getFirst(endTime);
    }

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param endTime DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public void addEndTime(DateTime endTime) {
        this.endTime = add(this.endTime, endTime);
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param endTime Time value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public void addEndTime(Time endTime) {
        this.endTime = add(this.endTime, endTime);
    }

    @JsonLdFieldTypes({ Organization.class, Person.class })
    private List<Object> provider;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> List<T> getProviderList() {
        return (List<T>) provider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getProvider() {
        return (T) getFirst(provider);
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void addProvider(Organization provider) {
        this.provider = add(this.provider, provider);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void addProvider(Person provider) {
        this.provider = add(this.provider, provider);
    }

    @JsonLdFieldTypes({ Time.class, DateTime.class })
    private List<Object> startTime;

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link Time} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public <T> List<T> getStartTimeList() {
        return (List<T>) startTime;
    }

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link Time} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public <T> T getStartTime() {
        return (T) getFirst(startTime);
    }

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param startTime Time value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public void addStartTime(Time startTime) {
        this.startTime = add(this.startTime, startTime);
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param startTime DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public void addStartTime(DateTime startTime) {
        this.startTime = add(this.startTime, startTime);
    }

    private List<Thing> result;

    /**
     * The result produced in the action. E.g. John wrote *a book*.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getResultList() {
        return result;
    }

    /**
     * The result produced in the action. E.g. John wrote *a book*.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getResult() {
        return getFirst(result);
    }

    /**
     * The result produced in the action. E.g. John wrote *a book*.
     *
     * @param result Thing value to set.
     */
    @Override
    public void addResult(Thing result) {
        this.result = add(this.result, result);
    }

    private List<ActionStatusType> actionStatus;

    /**
     * Indicates the current disposition of the Action.
     *
     * @return {@link ActionStatusType}
     */
    @Override
    public List<ActionStatusType> getActionStatusList() {
        return actionStatus;
    }

    /**
     * Indicates the current disposition of the Action.
     *
     * @return {@link ActionStatusType}
     */
    @Override
    public ActionStatusType getActionStatus() {
        return getFirst(actionStatus);
    }

    /**
     * Indicates the current disposition of the Action.
     *
     * @param actionStatus ActionStatusType value to set.
     */
    @Override
    public void addActionStatus(ActionStatusType actionStatus) {
        this.actionStatus = add(this.actionStatus, actionStatus);
    }

    @JsonLdFieldTypes({ Organization.class, Person.class })
    private List<Object> agent;

    /**
     * The direct performer or driver of the action (animate or inanimate). E.g. *John* wrote a book.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> List<T> getAgentList() {
        return (List<T>) agent;
    }

    /**
     * The direct performer or driver of the action (animate or inanimate). E.g. *John* wrote a book.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getAgent() {
        return (T) getFirst(agent);
    }

    /**
     * The direct performer or driver of the action (animate or inanimate). E.g. *John* wrote a book.
     *
     * @param agent Organization value to set.
     */
    @Override
    public void addAgent(Organization agent) {
        this.agent = add(this.agent, agent);
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). E.g. *John* wrote a book.
     *
     * @param agent Person value to set.
     */
    @Override
    public void addAgent(Person agent) {
        this.agent = add(this.agent, agent);
    }

    private List<Thing> instrument;

    /**
     * The object that helped the agent perform the action. E.g. John wrote a book with *a pen*.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getInstrumentList() {
        return instrument;
    }

    /**
     * The object that helped the agent perform the action. E.g. John wrote a book with *a pen*.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getInstrument() {
        return getFirst(instrument);
    }

    /**
     * The object that helped the agent perform the action. E.g. John wrote a book with *a pen*.
     *
     * @param instrument Thing value to set.
     */
    @Override
    public void addInstrument(Thing instrument) {
        this.instrument = add(this.instrument, instrument);
    }

    private List<Thing> object;

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). E.g. John read *a book*.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getObjectList() {
        return object;
    }

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). E.g. John read *a book*.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getObject() {
        return getFirst(object);
    }

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). E.g. John read *a book*.
     *
     * @param object Thing value to set.
     */
    @Override
    public void addObject(Thing object) {
        this.object = add(this.object, object);
    }

    private List<Thing> error;

    /**
     * For failed actions, more information on the cause of the failure.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getErrorList() {
        return error;
    }

    /**
     * For failed actions, more information on the cause of the failure.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getError() {
        return getFirst(error);
    }

    /**
     * For failed actions, more information on the cause of the failure.
     *
     * @param error Thing value to set.
     */
    @Override
    public void addError(Thing error) {
        this.error = add(this.error, error);
    }

    @JsonLdFieldTypes({ URL.class, EntryPoint.class })
    private List<Object> target;

    /**
     * Indicates a target EntryPoint, or url, for an Action.
     *
     * @return {@link URL} or {@link EntryPoint}
     */
    @Override
    public <T> List<T> getTargetList() {
        return (List<T>) target;
    }

    /**
     * Indicates a target EntryPoint, or url, for an Action.
     *
     * @return {@link URL} or {@link EntryPoint}
     */
    @Override
    public <T> T getTarget() {
        return (T) getFirst(target);
    }

    /**
     * Indicates a target EntryPoint, or url, for an Action.
     *
     * @param target URL value to set.
     */
    @Override
    public void addTarget(URL target) {
        this.target = add(this.target, target);
    }
    /**
     * Indicates a target EntryPoint, or url, for an Action.
     *
     * @param target EntryPoint value to set.
     */
    @Override
    public void addTarget(EntryPoint target) {
        this.target = add(this.target, target);
    }

    @JsonLdFieldTypes({ Place.class, Text.class, VirtualLocation.class, PostalAddress.class })
    private List<Object> location;

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @return {@link Place} or {@link Text} or {@link VirtualLocation} or {@link PostalAddress}
     */
    @Override
    public <T> List<T> getLocationList() {
        return (List<T>) location;
    }

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @return {@link Place} or {@link Text} or {@link VirtualLocation} or {@link PostalAddress}
     */
    @Override
    public <T> T getLocation() {
        return (T) getFirst(location);
    }

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location Place value to set.
     */
    @Override
    public void addLocation(Place location) {
        this.location = add(this.location, location);
    }
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location Text value to set.
     */
    @Override
    public void addLocation(Text location) {
        this.location = add(this.location, location);
    }
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location VirtualLocation value to set.
     */
    @Override
    public void addLocation(VirtualLocation location) {
        this.location = add(this.location, location);
    }
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location PostalAddress value to set.
     */
    @Override
    public void addLocation(PostalAddress location) {
        this.location = add(this.location, location);
    }

    @JsonLdFieldTypes({ Organization.class, Person.class })
    private List<Object> participant;

    /**
     * Other co-agents that participated in the action indirectly. E.g. John wrote a book with *Steve*.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> List<T> getParticipantList() {
        return (List<T>) participant;
    }

    /**
     * Other co-agents that participated in the action indirectly. E.g. John wrote a book with *Steve*.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getParticipant() {
        return (T) getFirst(participant);
    }

    /**
     * Other co-agents that participated in the action indirectly. E.g. John wrote a book with *Steve*.
     *
     * @param participant Organization value to set.
     */
    @Override
    public void addParticipant(Organization participant) {
        this.participant = add(this.participant, participant);
    }
    /**
     * Other co-agents that participated in the action indirectly. E.g. John wrote a book with *Steve*.
     *
     * @param participant Person value to set.
     */
    @Override
    public void addParticipant(Person participant) {
        this.participant = add(this.participant, participant);
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
