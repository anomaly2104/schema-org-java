/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.WebPage;
import org.schema.model.MediaObject;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.MediaManipulationRatingEnumeration;

/**
 * A [[MediaReview]] is a more specialized form of Review dedicated to the evaluation of media content online, typically in the context of fact-checking and misinformation.
 *     For more general reviews of media in the broader sense, use [[UserReview]], [[CriticReview]] or other [[Review]] types. This definition is
 *     a work in progress. While the [[MediaManipulationRatingEnumeration]] list reflects significant community review amongst fact-checkers and others working
 *     to combat misinformation, the specific structures for representing media objects, their versions and publication context, are still evolving. Similarly, best practices for the relationship between [[MediaReview]] and [[ClaimReview]] markup have not yet been finalized.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
 * @see <a href="https://schema.org/MediaReview">https://schema.org/MediaReview</a>
 */
public interface MediaReview extends Review {

    /**
     * Link to the page containing an original version of the content, or directly to an online copy of the original [[MediaObject]] content, e.g. video file.
     *
     * @return {@link WebPage} or {@link MediaObject} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    <T> List<T> getOriginalMediaLinkList();

    /**
     * Link to the page containing an original version of the content, or directly to an online copy of the original [[MediaObject]] content, e.g. video file.
     *
     * @return {@link WebPage} or {@link MediaObject} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    <T> T getOriginalMediaLink();

    /**
     * Link to the page containing an original version of the content, or directly to an online copy of the original [[MediaObject]] content, e.g. video file.
     *
     * @param originalMediaLink WebPage value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addOriginalMediaLink(WebPage originalMediaLink);
    /**
     * Link to the page containing an original version of the content, or directly to an online copy of the original [[MediaObject]] content, e.g. video file.
     *
     * @param originalMediaLink MediaObject value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addOriginalMediaLink(MediaObject originalMediaLink);
    /**
     * Link to the page containing an original version of the content, or directly to an online copy of the original [[MediaObject]] content, e.g. video file.
     *
     * @param originalMediaLink URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addOriginalMediaLink(URL originalMediaLink);

    /**
     * Describes, in a [[MediaReview]] when dealing with [[DecontextualizedContent]], background information that can contribute to better interpretation of the [[MediaObject]].
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    List<Text> getOriginalMediaContextDescriptionList();

    /**
     * Describes, in a [[MediaReview]] when dealing with [[DecontextualizedContent]], background information that can contribute to better interpretation of the [[MediaObject]].
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    Text getOriginalMediaContextDescription();

    /**
     * Describes, in a [[MediaReview]] when dealing with [[DecontextualizedContent]], background information that can contribute to better interpretation of the [[MediaObject]].
     *
     * @param originalMediaContextDescription Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addOriginalMediaContextDescription(Text originalMediaContextDescription);

    /**
     * Indicates a MediaManipulationRatingEnumeration classification of a media object (in the context of how it was published or shared).
     *
     * @return {@link MediaManipulationRatingEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    List<MediaManipulationRatingEnumeration> getMediaAuthenticityCategoryList();

    /**
     * Indicates a MediaManipulationRatingEnumeration classification of a media object (in the context of how it was published or shared).
     *
     * @return {@link MediaManipulationRatingEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    MediaManipulationRatingEnumeration getMediaAuthenticityCategory();

    /**
     * Indicates a MediaManipulationRatingEnumeration classification of a media object (in the context of how it was published or shared).
     *
     * @param mediaAuthenticityCategory MediaManipulationRatingEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addMediaAuthenticityCategory(MediaManipulationRatingEnumeration mediaAuthenticityCategory);
}
