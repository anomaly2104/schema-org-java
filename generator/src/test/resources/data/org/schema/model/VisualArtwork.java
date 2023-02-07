/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.QuantitativeValue;
import org.schema.model.Distance;
import org.schema.model.Person;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.Integer;

/**
 * A work of art that is primarily visual in character.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_VisualArtworkClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_VisualArtworkClass</a>
 * @see <a href="https://schema.org/VisualArtwork">https://schema.org/VisualArtwork</a>
 */
public interface VisualArtwork extends CreativeWork {

    /**
     * The width of the item.
     *
     * @return {@link QuantitativeValue} or {@link Distance}
     */
    <T> List<T> getWidthList();

    /**
     * The width of the item.
     *
     * @return {@link QuantitativeValue} or {@link Distance}
     */
    <T> T getWidth();

    /**
     * The width of the item.
     *
     * @param width QuantitativeValue value to set.
     */
    void addWidth(QuantitativeValue width);
    /**
     * The width of the item.
     *
     * @param width Distance value to set.
     */
    void addWidth(Distance width);

    /**
     * The individual who adds lettering, including speech balloons and sound effects, to artwork.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    List<Person> getLettererList();

    /**
     * The individual who adds lettering, including speech balloons and sound effects, to artwork.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    Person getLetterer();

    /**
     * The individual who adds lettering, including speech balloons and sound effects, to artwork.
     *
     * @param letterer Person value to set.
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    void addLetterer(Person letterer);

    /**
     * The height of the item.
     *
     * @return {@link Distance} or {@link QuantitativeValue}
     */
    <T> List<T> getHeightList();

    /**
     * The height of the item.
     *
     * @return {@link Distance} or {@link QuantitativeValue}
     */
    <T> T getHeight();

    /**
     * The height of the item.
     *
     * @param height Distance value to set.
     */
    void addHeight(Distance height);
    /**
     * The height of the item.
     *
     * @param height QuantitativeValue value to set.
     */
    void addHeight(QuantitativeValue height);

    /**
     * A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @return {@link URL} or {@link Text}
     */
    <T> List<T> getSurfaceList();

    /**
     * A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @return {@link URL} or {@link Text}
     */
    <T> T getSurface();

    /**
     * A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @param surface URL value to set.
     */
    void addSurface(URL surface);
    /**
     * A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @param surface Text value to set.
     */
    void addSurface(Text surface);

    /**
     * The individual who adds color to inked drawings.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    List<Person> getColoristList();

    /**
     * The individual who adds color to inked drawings.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    Person getColorist();

    /**
     * The individual who adds color to inked drawings.
     *
     * @param colorist Person value to set.
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    void addColorist(Person colorist);

    /**
     * The individual who traces over the pencil drawings in ink after pencils are complete.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    List<Person> getInkerList();

    /**
     * The individual who traces over the pencil drawings in ink after pencils are complete.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    Person getInker();

    /**
     * The individual who traces over the pencil drawings in ink after pencils are complete.
     *
     * @param inker Person value to set.
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    void addInker(Person inker);

    /**
     * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.
     *
     * @return {@link Text} or {@link URL}
     */
    <T> List<T> getArtformList();

    /**
     * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.
     *
     * @return {@link Text} or {@link URL}
     */
    <T> T getArtform();

    /**
     * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.
     *
     * @param artform Text value to set.
     */
    void addArtform(Text artform);
    /**
     * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.
     *
     * @param artform URL value to set.
     */
    void addArtform(URL artform);

    /**
     * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @return {@link URL} or {@link Text}
     */
    <T> List<T> getArtworkSurfaceList();

    /**
     * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @return {@link URL} or {@link Text}
     */
    <T> T getArtworkSurface();

    /**
     * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @param artworkSurface URL value to set.
     */
    void addArtworkSurface(URL artworkSurface);
    /**
     * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.
     *
     * @param artworkSurface Text value to set.
     */
    void addArtworkSurface(Text artworkSurface);

    /**
     * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").
     *
     * @return {@link Integer} or {@link Text}
     */
    <T> List<T> getArtEditionList();

    /**
     * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").
     *
     * @return {@link Integer} or {@link Text}
     */
    <T> T getArtEdition();

    /**
     * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").
     *
     * @param artEdition Integer value to set.
     */
    void addArtEdition(Integer artEdition);
    /**
     * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20").
     *
     * @param artEdition Text value to set.
     */
    void addArtEdition(Text artEdition);

    /**
     * The depth of the item.
     *
     * @return {@link Distance} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> List<T> getDepthList();

    /**
     * The depth of the item.
     *
     * @return {@link Distance} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getDepth();

    /**
     * The depth of the item.
     *
     * @param depth Distance value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addDepth(Distance depth);
    /**
     * The depth of the item.
     *
     * @param depth QuantitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addDepth(QuantitativeValue depth);

    /**
     * The individual who draws the primary narrative artwork.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    List<Person> getPencilerList();

    /**
     * The individual who draws the primary narrative artwork.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    Person getPenciler();

    /**
     * The individual who draws the primary narrative artwork.
     *
     * @param penciler Person value to set.
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    void addPenciler(Person penciler);

    /**
     * The primary artist for a work
     *     	in a medium other than pencils or digital line art--for example, if the
     *     	primary artwork is done in watercolors or digital paints.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    List<Person> getArtistList();

    /**
     * The primary artist for a work
     *     	in a medium other than pencils or digital line art--for example, if the
     *     	primary artwork is done in watercolors or digital paints.
     *
     * @return {@link Person}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    Person getArtist();

    /**
     * The primary artist for a work
     *     	in a medium other than pencils or digital line art--for example, if the
     *     	primary artwork is done in watercolors or digital paints.
     *
     * @param artist Person value to set.
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    void addArtist(Person artist);

    /**
     * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)
     *
     * @return {@link URL} or {@link Text}
     */
    <T> List<T> getArtMediumList();

    /**
     * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)
     *
     * @return {@link URL} or {@link Text}
     */
    <T> T getArtMedium();

    /**
     * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)
     *
     * @param artMedium URL value to set.
     */
    void addArtMedium(URL artMedium);
    /**
     * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.)
     *
     * @param artMedium Text value to set.
     */
    void addArtMedium(Text artMedium);
}
