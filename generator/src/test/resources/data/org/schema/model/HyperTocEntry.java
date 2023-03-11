/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.MediaObject;
import org.schema.model.datatype.Text;
import org.schema.model.HyperTocEntry;

/**
 * A HyperToEntry is an item within a [[HyperToc]], which represents a hypertext table of contents for complex media objects, such as [[VideoObject]], [[AudioObject]]. The media object itself is indicated using [[associatedMedia]]. Each section of interest within that content can be described with a [[HyperTocEntry]], with associated [[startOffset]] and [[endOffset]]. When several entries are all from the same file, [[associatedMedia]] is used on the overarching [[HyperTocEntry]]; if the content has been split into multiple files, they can be referenced using [[associatedMedia]] on each [[HyperTocEntry]].
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
 * @see <a href="https://schema.org/HyperTocEntry">https://schema.org/HyperTocEntry</a>
 */
public interface HyperTocEntry extends CreativeWork {

    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     *
     * @return {@link MediaObject}
     */
    List<MediaObject> getAssociatedMediaList();

    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     *
     * @return {@link MediaObject}
     */
    MediaObject getAssociatedMedia();

    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     *
     * @param associatedMedia MediaObject value to set.
     */
    void addAssociatedMedia(MediaObject associatedMedia);

    /**
     * Text of an utterances (spoken words, lyrics etc.) that occurs at a certain section of a media object, represented as a [[HyperTocEntry]].
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
     */
    List<Text> getUtterancesList();

    /**
     * Text of an utterances (spoken words, lyrics etc.) that occurs at a certain section of a media object, represented as a [[HyperTocEntry]].
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
     */
    Text getUtterances();

    /**
     * Text of an utterances (spoken words, lyrics etc.) that occurs at a certain section of a media object, represented as a [[HyperTocEntry]].
     *
     * @param utterances Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
     */
    void addUtterances(Text utterances);

    /**
     * A [[HyperTocEntry]] can have a [[tocContinuation]] indicated, which is another [[HyperTocEntry]] that would be the default next item to play or render.
     *
     * @return {@link HyperTocEntry}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
     */
    List<HyperTocEntry> getTocContinuationList();

    /**
     * A [[HyperTocEntry]] can have a [[tocContinuation]] indicated, which is another [[HyperTocEntry]] that would be the default next item to play or render.
     *
     * @return {@link HyperTocEntry}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
     */
    HyperTocEntry getTocContinuation();

    /**
     * A [[HyperTocEntry]] can have a [[tocContinuation]] indicated, which is another [[HyperTocEntry]] that would be the default next item to play or render.
     *
     * @param tocContinuation HyperTocEntry value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2766">https://github.com/schemaorg/schemaorg/issues/2766</a>
     */
    void addTocContinuation(HyperTocEntry tocContinuation);
}
