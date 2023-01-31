/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Integer;
import org.schema.model.datatype.Text;
import org.schema.model.Person;
import org.schema.model.VideoObject;
import org.schema.model.CreativeWorkSeries;
import org.schema.model.Duration;
import org.schema.model.CreativeWorkSeason;
import org.schema.model.Organization;
import org.schema.model.MusicGroup;

/**
 * A media episode (e.g. TV, radio, video game) which can be part of a series or season.
 *
 * @see <a href="https://schema.org/Episode">https://schema.org/Episode</a>
 */
public interface Episode extends CreativeWork {

    /**
     * Position of the episode within an ordered group of episodes.
     *
     * @return {@link Integer} or {@link Text}
     */
    <T> List<T> getEpisodeNumberList();

    /**
     * Position of the episode within an ordered group of episodes.
     *
     * @return {@link Integer} or {@link Text}
     */
    <T> T getEpisodeNumber();

    /**
     * Position of the episode within an ordered group of episodes.
     *
     * @param episodeNumber Integer value to set.
     */
    void addEpisodeNumber(Integer episodeNumber);
    /**
     * Position of the episode within an ordered group of episodes.
     *
     * @param episodeNumber Text value to set.
     */
    void addEpisodeNumber(Text episodeNumber);

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    List<Person> getDirectorList();

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
    void addDirector(Person director);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    List<Person> getActorList();

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
    void addActor(Person actor);

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @return {@link VideoObject}
     */
    List<VideoObject> getTrailerList();

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @return {@link VideoObject}
     */
    VideoObject getTrailer();

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @param trailer VideoObject value to set.
     */
    void addTrailer(VideoObject trailer);

    /**
     * The series to which this episode or season belongs.
     *
     * @return {@link CreativeWorkSeries}
     */
    List<CreativeWorkSeries> getPartOfSeriesList();

    /**
     * The series to which this episode or season belongs.
     *
     * @return {@link CreativeWorkSeries}
     */
    CreativeWorkSeries getPartOfSeries();

    /**
     * The series to which this episode or season belongs.
     *
     * @param partOfSeries CreativeWorkSeries value to set.
     */
    void addPartOfSeries(CreativeWorkSeries partOfSeries);

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
     * The season to which this episode belongs.
     *
     * @return {@link CreativeWorkSeason}
     */
    List<CreativeWorkSeason> getPartOfSeasonList();

    /**
     * The season to which this episode belongs.
     *
     * @return {@link CreativeWorkSeason}
     */
    CreativeWorkSeason getPartOfSeason();

    /**
     * The season to which this episode belongs.
     *
     * @param partOfSeason CreativeWorkSeason value to set.
     */
    void addPartOfSeason(CreativeWorkSeason partOfSeason);

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @return {@link Organization}
     */
    List<Organization> getProductionCompanyList();

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @return {@link Organization}
     */
    Organization getProductionCompany();

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @param productionCompany Organization value to set.
     */
    void addProductionCompany(Organization productionCompany);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    List<Person> getActorsList();

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
    void addActors(Person actors);

    /**
     * The composer of the soundtrack.
     *
     * @return {@link Person} or {@link MusicGroup}
     */
    <T> List<T> getMusicByList();

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
    void addMusicBy(Person musicBy);
    /**
     * The composer of the soundtrack.
     *
     * @param musicBy MusicGroup value to set.
     */
    void addMusicBy(MusicGroup musicBy);

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    List<Person> getDirectorsList();

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
    void addDirectors(Person directors);
}
