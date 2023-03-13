/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.QuantitativeValue;
import org.schema.model.datatype.Number;
import org.schema.model.datatype.Text;
import org.schema.model.LocationFeatureSpecification;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Integer;
import org.schema.model.Duration;
import org.schema.model.datatype.Boolean;
import org.schema.model.FloorPlan;

/**
 * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
 * For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
 * <br /><br />
 * See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
 *
 * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
 * @see <a href="https://schema.org/Accommodation">https://schema.org/Accommodation</a>
 */
public interface Accommodation extends Place {

    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    List<QuantitativeValue> getFloorSizeList();

    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    QuantitativeValue getFloorSize();

    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     *
     * @param floorSize QuantitativeValue value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addFloorSize(QuantitativeValue floorSize);

    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    <T> List<T> getNumberOfRoomsList();

    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    <T> T getNumberOfRooms();

    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *
     * @param numberOfRooms Number value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addNumberOfRooms(Number numberOfRooms);
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     *
     * @param numberOfRooms QuantitativeValue value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addNumberOfRooms(QuantitativeValue numberOfRooms);

    /**
     * The floor level for an [[Accommodation]] in a multi-storey building. Since counting
     *   systems [vary internationally](https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations), the local system should be used where possible.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<Text> getFloorLevelList();

    /**
     * The floor level for an [[Accommodation]] in a multi-storey building. Since counting
     *   systems [vary internationally](https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations), the local system should be used where possible.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    Text getFloorLevel();

    /**
     * The floor level for an [[Accommodation]] in a multi-storey building. Since counting
     *   systems [vary internationally](https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations), the local system should be used where possible.
     *
     * @param floorLevel Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addFloorLevel(Text floorLevel);

    /**
     * Number of full bathrooms - The total number of full and ¾ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<Number> getNumberOfFullBathroomsList();

    /**
     * Number of full bathrooms - The total number of full and ¾ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    Number getNumberOfFullBathrooms();

    /**
     * Number of full bathrooms - The total number of full and ¾ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     *
     * @param numberOfFullBathrooms Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addNumberOfFullBathrooms(Number numberOfFullBathrooms);

    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     *
     * @return {@link LocationFeatureSpecification}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    List<LocationFeatureSpecification> getAmenityFeatureList();

    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     *
     * @return {@link LocationFeatureSpecification}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    LocationFeatureSpecification getAmenityFeature();

    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     *
     * @param amenityFeature LocationFeatureSpecification value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addAmenityFeature(LocationFeatureSpecification amenityFeature);

    /**
     * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<URL> getTourBookingPageList();

    /**
     * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    URL getTourBookingPage();

    /**
     * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
     *
     * @param tourBookingPage URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addTourBookingPage(URL tourBookingPage);

    /**
     * The total integer number of bathrooms in some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): "The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.". See also [[numberOfRooms]].
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<Integer> getNumberOfBathroomsTotalList();

    /**
     * The total integer number of bathrooms in some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): "The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.". See also [[numberOfRooms]].
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    Integer getNumberOfBathroomsTotal();

    /**
     * The total integer number of bathrooms in some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): "The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.". See also [[numberOfRooms]].
     *
     * @param numberOfBathroomsTotal Integer value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addNumberOfBathroomsTotal(Integer numberOfBathroomsTotal);

    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    <T> List<T> getNumberOfBedroomsList();

    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    <T> T getNumberOfBedrooms();

    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     *
     * @param numberOfBedrooms Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addNumberOfBedrooms(Number numberOfBedrooms);
    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     *
     * @param numberOfBedrooms QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addNumberOfBedrooms(QuantitativeValue numberOfBedrooms);

    /**
     * Category of an [[Accommodation]], following real estate conventions, e.g. RESO (see [PropertySubType](https://ddwiki.reso.org/display/DDW17/PropertySubType+Field), and [PropertyType](https://ddwiki.reso.org/display/DDW17/PropertyType+Field) fields  for suggested values).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<Text> getAccommodationCategoryList();

    /**
     * Category of an [[Accommodation]], following real estate conventions, e.g. RESO (see [PropertySubType](https://ddwiki.reso.org/display/DDW17/PropertySubType+Field), and [PropertyType](https://ddwiki.reso.org/display/DDW17/PropertyType+Field) fields  for suggested values).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    Text getAccommodationCategory();

    /**
     * Category of an [[Accommodation]], following real estate conventions, e.g. RESO (see [PropertySubType](https://ddwiki.reso.org/display/DDW17/PropertySubType+Field), and [PropertyType](https://ddwiki.reso.org/display/DDW17/PropertyType+Field) fields  for suggested values).
     *
     * @param accommodationCategory Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addAccommodationCategory(Text accommodationCategory);

    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     *
     * @return {@link QuantitativeValue} or {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    <T> List<T> getLeaseLengthList();

    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     *
     * @return {@link QuantitativeValue} or {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    <T> T getLeaseLength();

    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     *
     * @param leaseLength QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addLeaseLength(QuantitativeValue leaseLength);
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     *
     * @param leaseLength Duration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addLeaseLength(Duration leaseLength);

    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     *
     * @return {@link Text} or {@link Boolean}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    <T> List<T> getPetsAllowedList();

    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     *
     * @return {@link Text} or {@link Boolean}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    <T> T getPetsAllowed();

    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     *
     * @param petsAllowed Text value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addPetsAllowed(Text petsAllowed);
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     *
     * @param petsAllowed Boolean value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addPetsAllowed(Boolean petsAllowed);

    /**
     * Indications regarding the permitted usage of the accommodation.
     *
     * @return {@link Text}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    List<Text> getPermittedUsageList();

    /**
     * Indications regarding the permitted usage of the accommodation.
     *
     * @return {@link Text}
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    Text getPermittedUsage();

    /**
     * Indications regarding the permitted usage of the accommodation.
     *
     * @param permittedUsage Text value to set.
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology</a>
     */
    void addPermittedUsage(Text permittedUsage);

    /**
     * Number of partial bathrooms - The total number of half and ¼ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<Number> getNumberOfPartialBathroomsList();

    /**
     * Number of partial bathrooms - The total number of half and ¼ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    Number getNumberOfPartialBathrooms();

    /**
     * Number of partial bathrooms - The total number of half and ¼ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field). 
     *
     * @param numberOfPartialBathrooms Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addNumberOfPartialBathrooms(Number numberOfPartialBathrooms);

    /**
     * A floorplan of some [[Accommodation]].
     *
     * @return {@link FloorPlan}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<FloorPlan> getAccommodationFloorPlanList();

    /**
     * A floorplan of some [[Accommodation]].
     *
     * @return {@link FloorPlan}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    FloorPlan getAccommodationFloorPlan();

    /**
     * A floorplan of some [[Accommodation]].
     *
     * @param accommodationFloorPlan FloorPlan value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addAccommodationFloorPlan(FloorPlan accommodationFloorPlan);

    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    List<Number> getYearBuiltList();

    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    Number getYearBuilt();

    /**
     * The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field). 
     *
     * @param yearBuilt Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void addYearBuilt(Number yearBuilt);
}
