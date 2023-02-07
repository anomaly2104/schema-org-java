/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Audience;
import org.schema.model.datatype.Text;
import org.schema.model.TouristAttraction;

/**
 * A tourist destination. In principle any [[Place]] can be a [[TouristDestination]] from a [[City]], Region or [[Country]] to an [[AmusementPark]] or [[Hotel]]. This Type can be used on its own to describe a general [[TouristDestination]], or be used as an [[additionalType]] to add tourist relevant properties to any other [[Place]].  A [[TouristDestination]] is defined as a [[Place]] that contains, or is colocated with, one or more [[TouristAttraction]]s, often linked by a similar theme or interest to a particular [[touristType]]. The [UNWTO](http://www2.unwto.org/) defines Destination (main destination of a tourism trip) as the place visited that is central to the decision to take the trip.
 *   (See examples below).
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
 * @see <a href="https://schema.org/TouristDestination">https://schema.org/TouristDestination</a>
 */
public interface TouristDestination extends Place {

    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @return {@link Audience} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    <T> List<T> getTouristTypeList();

    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @return {@link Audience} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    <T> T getTouristType();

    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @param touristType Audience value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    void addTouristType(Audience touristType);
    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @param touristType Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    void addTouristType(Text touristType);

    /**
     * Attraction located at destination.
     *
     * @return {@link TouristAttraction}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    List<TouristAttraction> getIncludesAttractionList();

    /**
     * Attraction located at destination.
     *
     * @return {@link TouristAttraction}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    TouristAttraction getIncludesAttraction();

    /**
     * Attraction located at destination.
     *
     * @param includesAttraction TouristAttraction value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    void addIncludesAttraction(TouristAttraction includesAttraction);
}
