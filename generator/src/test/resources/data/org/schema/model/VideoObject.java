/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.Person;
import org.schema.model.MediaObject;
import org.schema.model.ImageObject;
import org.schema.model.MusicGroup;

/**
 * A video file.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews</a>
 * @see <a href="https://schema.org/VideoObject">https://schema.org/VideoObject</a>
 */
public interface VideoObject extends MediaObject {

    /**
     * Represents textual captioning from a [[MediaObject]], e.g. text of a 'meme'.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    Text getEmbeddedTextCaption();

    /**
     * Represents textual captioning from a [[MediaObject]], e.g. text of a 'meme'.
     *
     * @param embeddedTextCaption Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void setEmbeddedTextCaption(Text embeddedTextCaption);

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirector();

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @param director Person value to set.
     */
    void setDirector(Person director);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActor();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @param actor Person value to set.
     */
    void setActor(Person actor);

    /**
     * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the [[encodingFormat]].
     *
     * @return {@link Text} or {@link MediaObject}
     */
    <T> T getCaption();

    /**
     * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the [[encodingFormat]].
     *
     * @param caption Text value to set.
     */
    void setCaption(Text caption);
    /**
     * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the [[encodingFormat]].
     *
     * @param caption MediaObject value to set.
     */
    void setCaption(MediaObject caption);

    /**
     * Thumbnail image for an image or video.
     *
     * @return {@link ImageObject}
     */
    ImageObject getThumbnail();

    /**
     * Thumbnail image for an image or video.
     *
     * @param thumbnail ImageObject value to set.
     */
    void setThumbnail(ImageObject thumbnail);

    /**
     * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
     *
     * @return {@link Text}
     */
    Text getTranscript();

    /**
     * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
     *
     * @param transcript Text value to set.
     */
    void setTranscript(Text transcript);

    /**
     * The quality of the video.
     *
     * @return {@link Text}
     */
    Text getVideoQuality();

    /**
     * The quality of the video.
     *
     * @param videoQuality Text value to set.
     */
    void setVideoQuality(Text videoQuality);

    /**
     * The frame size of the video.
     *
     * @return {@link Text}
     */
    Text getVideoFrameSize();

    /**
     * The frame size of the video.
     *
     * @param videoFrameSize Text value to set.
     */
    void setVideoFrameSize(Text videoFrameSize);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActors();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @param actors Person value to set.
     */
    void setActors(Person actors);

    /**
     * The composer of the soundtrack.
     *
     * @return {@link Person} or {@link MusicGroup}
     */
    <T> T getMusicBy();

    /**
     * The composer of the soundtrack.
     *
     * @param musicBy Person value to set.
     */
    void setMusicBy(Person musicBy);
    /**
     * The composer of the soundtrack.
     *
     * @param musicBy MusicGroup value to set.
     */
    void setMusicBy(MusicGroup musicBy);

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirectors();

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @param directors Person value to set.
     */
    void setDirectors(Person directors);
}
