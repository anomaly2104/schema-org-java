/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.MusicAlbum;
import org.schema.model.MusicReleaseFormatType;
import org.schema.model.Duration;
import org.schema.model.Person;
import org.schema.model.Organization;
import org.schema.model.datatype.Text;

/**
 * A MusicRelease is a specific release of a music album.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
 * @see <a href="https://schema.org/MusicRelease">https://schema.org/MusicRelease</a>
 */
public interface MusicRelease extends MusicPlaylist {

    /**
     * The album this is a release of.
     *
     * @return {@link MusicAlbum}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    List<MusicAlbum> getReleaseOfList();

    /**
     * The album this is a release of.
     *
     * @return {@link MusicAlbum}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    MusicAlbum getReleaseOf();

    /**
     * The album this is a release of.
     *
     * @param releaseOf MusicAlbum value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void addReleaseOf(MusicAlbum releaseOf);

    /**
     * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
     *
     * @return {@link MusicReleaseFormatType}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    List<MusicReleaseFormatType> getMusicReleaseFormatList();

    /**
     * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
     *
     * @return {@link MusicReleaseFormatType}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    MusicReleaseFormatType getMusicReleaseFormat();

    /**
     * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
     *
     * @param musicReleaseFormat MusicReleaseFormatType value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void addMusicReleaseFormat(MusicReleaseFormatType musicReleaseFormat);

    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    List<Duration> getDurationList();

    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    Duration getDuration();

    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @param duration Duration value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void addDuration(Duration duration);

    /**
     * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
     *
     * @return {@link Person} or {@link Organization}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    <T> List<T> getCreditedToList();

    /**
     * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
     *
     * @return {@link Person} or {@link Organization}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    <T> T getCreditedTo();

    /**
     * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
     *
     * @param creditedTo Person value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void addCreditedTo(Person creditedTo);
    /**
     * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
     *
     * @param creditedTo Organization value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void addCreditedTo(Organization creditedTo);

    /**
     * The label that issued the release.
     *
     * @return {@link Organization}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    List<Organization> getRecordLabelList();

    /**
     * The label that issued the release.
     *
     * @return {@link Organization}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    Organization getRecordLabel();

    /**
     * The label that issued the release.
     *
     * @param recordLabel Organization value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void addRecordLabel(Organization recordLabel);

    /**
     * The catalog number for the release.
     *
     * @return {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    List<Text> getCatalogNumberList();

    /**
     * The catalog number for the release.
     *
     * @return {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    Text getCatalogNumber();

    /**
     * The catalog number for the release.
     *
     * @param catalogNumber Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void addCatalogNumber(Text catalogNumber);
}
