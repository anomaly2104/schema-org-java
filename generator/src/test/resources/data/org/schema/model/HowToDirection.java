/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Duration;
import org.schema.model.MediaObject;
import org.schema.model.datatype.URL;
import org.schema.model.HowToTool;
import org.schema.model.datatype.Text;
import org.schema.model.HowToSupply;

/**
 * A direction indicating a single action to do in the instructions for how to achieve a result.
 *
 * @see <a href="https://schema.org/HowToDirection">https://schema.org/HowToDirection</a>
 */
public interface HowToDirection extends CreativeWork, ListItem {

    /**
     * The length of time it takes to prepare the items to be used in instructions or a direction, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    List<Duration> getPrepTimeList();

    /**
     * The length of time it takes to prepare the items to be used in instructions or a direction, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    Duration getPrepTime();

    /**
     * The length of time it takes to prepare the items to be used in instructions or a direction, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @param prepTime Duration value to set.
     */
    void addPrepTime(Duration prepTime);

    /**
     * A media object representing the circumstances after performing this direction.
     *
     * @return {@link MediaObject} or {@link URL}
     */
    <T> List<T> getAfterMediaList();

    /**
     * A media object representing the circumstances after performing this direction.
     *
     * @return {@link MediaObject} or {@link URL}
     */
    <T> T getAfterMedia();

    /**
     * A media object representing the circumstances after performing this direction.
     *
     * @param afterMedia MediaObject value to set.
     */
    void addAfterMedia(MediaObject afterMedia);
    /**
     * A media object representing the circumstances after performing this direction.
     *
     * @param afterMedia URL value to set.
     */
    void addAfterMedia(URL afterMedia);

    /**
     * A media object representing the circumstances before performing this direction.
     *
     * @return {@link MediaObject} or {@link URL}
     */
    <T> List<T> getBeforeMediaList();

    /**
     * A media object representing the circumstances before performing this direction.
     *
     * @return {@link MediaObject} or {@link URL}
     */
    <T> T getBeforeMedia();

    /**
     * A media object representing the circumstances before performing this direction.
     *
     * @param beforeMedia MediaObject value to set.
     */
    void addBeforeMedia(MediaObject beforeMedia);
    /**
     * A media object representing the circumstances before performing this direction.
     *
     * @param beforeMedia URL value to set.
     */
    void addBeforeMedia(URL beforeMedia);

    /**
     * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
     *
     * @return {@link HowToTool} or {@link Text}
     */
    <T> List<T> getToolList();

    /**
     * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
     *
     * @return {@link HowToTool} or {@link Text}
     */
    <T> T getTool();

    /**
     * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
     *
     * @param tool HowToTool value to set.
     */
    void addTool(HowToTool tool);
    /**
     * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
     *
     * @param tool Text value to set.
     */
    void addTool(Text tool);

    /**
     * A media object representing the circumstances while performing this direction.
     *
     * @return {@link MediaObject} or {@link URL}
     */
    <T> List<T> getDuringMediaList();

    /**
     * A media object representing the circumstances while performing this direction.
     *
     * @return {@link MediaObject} or {@link URL}
     */
    <T> T getDuringMedia();

    /**
     * A media object representing the circumstances while performing this direction.
     *
     * @param duringMedia MediaObject value to set.
     */
    void addDuringMedia(MediaObject duringMedia);
    /**
     * A media object representing the circumstances while performing this direction.
     *
     * @param duringMedia URL value to set.
     */
    void addDuringMedia(URL duringMedia);

    /**
     * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    List<Duration> getPerformTimeList();

    /**
     * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    Duration getPerformTime();

    /**
     * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @param performTime Duration value to set.
     */
    void addPerformTime(Duration performTime);

    /**
     * A sub-property of instrument. A supply consumed when performing instructions or a direction.
     *
     * @return {@link Text} or {@link HowToSupply}
     */
    <T> List<T> getSupplyList();

    /**
     * A sub-property of instrument. A supply consumed when performing instructions or a direction.
     *
     * @return {@link Text} or {@link HowToSupply}
     */
    <T> T getSupply();

    /**
     * A sub-property of instrument. A supply consumed when performing instructions or a direction.
     *
     * @param supply Text value to set.
     */
    void addSupply(Text supply);
    /**
     * A sub-property of instrument. A supply consumed when performing instructions or a direction.
     *
     * @param supply HowToSupply value to set.
     */
    void addSupply(HowToSupply supply);

    /**
     * The total time required to perform instructions or a direction (including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    List<Duration> getTotalTimeList();

    /**
     * The total time required to perform instructions or a direction (including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    Duration getTotalTime();

    /**
     * The total time required to perform instructions or a direction (including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @param totalTime Duration value to set.
     */
    void addTotalTime(Duration totalTime);
}
