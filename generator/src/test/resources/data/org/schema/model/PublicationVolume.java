/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.datatype.Integer;

/**
 * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.<br/><br/>See also [blog post](http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html).
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
 * @see <a href="https://schema.org/PublicationVolume">https://schema.org/PublicationVolume</a>
 */
public interface PublicationVolume extends CreativeWork {

    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @return {@link Text} or {@link Integer}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    <T> T getPageStart();

    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @param pageStart Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageStart(Text pageStart);
    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @param pageStart Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageStart(Integer pageStart);

    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @return {@link Text} or {@link Integer}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    <T> T getPageEnd();

    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @param pageEnd Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageEnd(Text pageEnd);
    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @param pageEnd Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageEnd(Integer pageEnd);

    /**
     * Identifies the volume of publication or multi-part work; for example, "iii" or "2".
     *
     * @return {@link Integer} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    <T> T getVolumeNumber();

    /**
     * Identifies the volume of publication or multi-part work; for example, "iii" or "2".
     *
     * @param volumeNumber Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setVolumeNumber(Integer volumeNumber);
    /**
     * Identifies the volume of publication or multi-part work; for example, "iii" or "2".
     *
     * @param volumeNumber Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setVolumeNumber(Text volumeNumber);

    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     *
     * @return {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    Text getPagination();

    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     *
     * @param pagination Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPagination(Text pagination);
}
