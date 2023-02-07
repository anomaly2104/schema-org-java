/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Country;
import org.schema.model.datatype.Text;
import org.schema.model.PostalAddress;
import org.schema.model.datatype.Number;

/**
 * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews</a>
 * @see <a href="https://schema.org/GeoShape">https://schema.org/GeoShape</a>
 */
public interface GeoShape extends StructuredValue {

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    <T> List<T> getAddressCountryList();

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    <T> T getAddressCountry();

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @param addressCountry Country value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void addAddressCountry(Country addressCountry);
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @param addressCountry Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void addAddressCountry(Text addressCountry);

    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     *
     * @return {@link Text}
     */
    List<Text> getCircleList();

    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     *
     * @return {@link Text}
     */
    Text getCircle();

    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     *
     * @param circle Text value to set.
     */
    void addCircle(Text circle);

    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     *
     * @return {@link Text}
     */
    List<Text> getLineList();

    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     *
     * @return {@link Text}
     */
    Text getLine();

    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     *
     * @param line Text value to set.
     */
    void addLine(Text line);

    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     *
     * @return {@link Text}
     */
    List<Text> getPolygonList();

    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     *
     * @return {@link Text}
     */
    Text getPolygon();

    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     *
     * @param polygon Text value to set.
     */
    void addPolygon(Text polygon);

    /**
     * Physical address of the item.
     *
     * @return {@link Text} or {@link PostalAddress}
     */
    <T> List<T> getAddressList();

    /**
     * Physical address of the item.
     *
     * @return {@link Text} or {@link PostalAddress}
     */
    <T> T getAddress();

    /**
     * Physical address of the item.
     *
     * @param address Text value to set.
     */
    void addAddress(Text address);
    /**
     * Physical address of the item.
     *
     * @param address PostalAddress value to set.
     */
    void addAddress(PostalAddress address);

    /**
     * The postal code. For example, 94043.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    List<Text> getPostalCodeList();

    /**
     * The postal code. For example, 94043.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    Text getPostalCode();

    /**
     * The postal code. For example, 94043.
     *
     * @param postalCode Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void addPostalCode(Text postalCode);

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @return {@link Text} or {@link Number}
     */
    <T> List<T> getElevationList();

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @return {@link Text} or {@link Number}
     */
    <T> T getElevation();

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @param elevation Text value to set.
     */
    void addElevation(Text elevation);
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @param elevation Number value to set.
     */
    void addElevation(Number elevation);

    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     *
     * @return {@link Text}
     */
    List<Text> getBoxList();

    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     *
     * @return {@link Text}
     */
    Text getBox();

    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     *
     * @param box Text value to set.
     */
    void addBox(Text box);
}
