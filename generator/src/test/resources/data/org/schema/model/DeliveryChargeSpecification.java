/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.Place;
import org.schema.model.GeoShape;
import org.schema.model.AdministrativeArea;
import org.schema.model.DeliveryMethod;

/**
 * The price for the delivery of an offer using a particular delivery method.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/DeliveryChargeSpecification">https://schema.org/DeliveryChargeSpecification</a>
 */
public interface DeliveryChargeSpecification extends PriceSpecification {

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link Text} or {@link Place} or {@link GeoShape} or {@link AdministrativeArea}
     */
    <T> List<T> getAreaServedList();

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link Text} or {@link Place} or {@link GeoShape} or {@link AdministrativeArea}
     */
    <T> T getAreaServed();

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Text value to set.
     */
    void addAreaServed(Text areaServed);
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Place value to set.
     */
    void addAreaServed(Place areaServed);
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed GeoShape value to set.
     */
    void addAreaServed(GeoShape areaServed);
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed AdministrativeArea value to set.
     */
    void addAreaServed(AdministrativeArea areaServed);

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @return {@link Place} or {@link Text} or {@link GeoShape}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> List<T> getEligibleRegionList();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @return {@link Place} or {@link Text} or {@link GeoShape}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> T getEligibleRegion();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @param eligibleRegion Place value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addEligibleRegion(Place eligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @param eligibleRegion Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addEligibleRegion(Text eligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @param eligibleRegion GeoShape value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addEligibleRegion(GeoShape eligibleRegion);

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @return {@link DeliveryMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<DeliveryMethod> getAppliesToDeliveryMethodList();

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @return {@link DeliveryMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    DeliveryMethod getAppliesToDeliveryMethod();

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @param appliesToDeliveryMethod DeliveryMethod value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addAppliesToDeliveryMethod(DeliveryMethod appliesToDeliveryMethod);

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @return {@link Place} or {@link GeoShape} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    <T> List<T> getIneligibleRegionList();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @return {@link Place} or {@link GeoShape} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    <T> T getIneligibleRegion();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @param ineligibleRegion Place value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void addIneligibleRegion(Place ineligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @param ineligibleRegion GeoShape value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void addIneligibleRegion(GeoShape ineligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @param ineligibleRegion Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void addIneligibleRegion(Text ineligibleRegion);
}
