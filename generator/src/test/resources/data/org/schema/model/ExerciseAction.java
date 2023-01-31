/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.SportsTeam;
import org.schema.model.Place;
import org.schema.model.Diet;
import org.schema.model.SportsActivityLocation;
import org.schema.model.Distance;
import org.schema.model.ExercisePlan;
import org.schema.model.SportsEvent;
import org.schema.model.Person;
import org.schema.model.datatype.Text;

/**
 * The act of participating in exertive activity for the purposes of improving health and fitness.
 *
 * @see <a href="https://schema.org/ExerciseAction">https://schema.org/ExerciseAction</a>
 */
public interface ExerciseAction extends PlayAction {

    /**
     * A sub property of participant. The sports team that participated on this action.
     *
     * @return {@link SportsTeam}
     */
    List<SportsTeam> getSportsTeamList();

    /**
     * A sub property of participant. The sports team that participated on this action.
     *
     * @return {@link SportsTeam}
     */
    SportsTeam getSportsTeam();

    /**
     * A sub property of participant. The sports team that participated on this action.
     *
     * @param sportsTeam SportsTeam value to set.
     */
    void addSportsTeam(SportsTeam sportsTeam);

    /**
     * A sub property of location. The course where this action was taken.
     *
     * @return {@link Place}
     */
    List<Place> getCourseList();

    /**
     * A sub property of location. The course where this action was taken.
     *
     * @return {@link Place}
     */
    Place getCourse();

    /**
     * A sub property of location. The course where this action was taken.
     *
     * @param course Place value to set.
     */
    void addCourse(Place course);

    /**
     * A sub property of location. The original location of the object or the agent before the action.
     *
     * @return {@link Place}
     */
    List<Place> getFromLocationList();

    /**
     * A sub property of location. The original location of the object or the agent before the action.
     *
     * @return {@link Place}
     */
    Place getFromLocation();

    /**
     * A sub property of location. The original location of the object or the agent before the action.
     *
     * @param fromLocation Place value to set.
     */
    void addFromLocation(Place fromLocation);

    /**
     * A sub property of instrument. The diet used in this action.
     *
     * @return {@link Diet}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Diet> getDietList();

    /**
     * A sub property of instrument. The diet used in this action.
     *
     * @return {@link Diet}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Diet getDiet();

    /**
     * A sub property of instrument. The diet used in this action.
     *
     * @param diet Diet value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addDiet(Diet diet);

    /**
     * A sub property of location. The sports activity location where this action occurred.
     *
     * @return {@link SportsActivityLocation}
     */
    List<SportsActivityLocation> getSportsActivityLocationList();

    /**
     * A sub property of location. The sports activity location where this action occurred.
     *
     * @return {@link SportsActivityLocation}
     */
    SportsActivityLocation getSportsActivityLocation();

    /**
     * A sub property of location. The sports activity location where this action occurred.
     *
     * @param sportsActivityLocation SportsActivityLocation value to set.
     */
    void addSportsActivityLocation(SportsActivityLocation sportsActivityLocation);

    /**
     * The distance travelled, e.g. exercising or travelling.
     *
     * @return {@link Distance}
     */
    List<Distance> getDistanceList();

    /**
     * The distance travelled, e.g. exercising or travelling.
     *
     * @return {@link Distance}
     */
    Distance getDistance();

    /**
     * The distance travelled, e.g. exercising or travelling.
     *
     * @param distance Distance value to set.
     */
    void addDistance(Distance distance);

    /**
     * A sub property of instrument. The exercise plan used on this action.
     *
     * @return {@link ExercisePlan}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<ExercisePlan> getExercisePlanList();

    /**
     * A sub property of instrument. The exercise plan used on this action.
     *
     * @return {@link ExercisePlan}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    ExercisePlan getExercisePlan();

    /**
     * A sub property of instrument. The exercise plan used on this action.
     *
     * @param exercisePlan ExercisePlan value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addExercisePlan(ExercisePlan exercisePlan);

    /**
     * A sub property of location. The sports event where this action occurred.
     *
     * @return {@link SportsEvent}
     */
    List<SportsEvent> getSportsEventList();

    /**
     * A sub property of location. The sports event where this action occurred.
     *
     * @return {@link SportsEvent}
     */
    SportsEvent getSportsEvent();

    /**
     * A sub property of location. The sports event where this action occurred.
     *
     * @param sportsEvent SportsEvent value to set.
     */
    void addSportsEvent(SportsEvent sportsEvent);

    /**
     * A sub property of instrument. The diet used in this action.
     *
     * @return {@link Diet}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Diet> getExerciseRelatedDietList();

    /**
     * A sub property of instrument. The diet used in this action.
     *
     * @return {@link Diet}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Diet getExerciseRelatedDiet();

    /**
     * A sub property of instrument. The diet used in this action.
     *
     * @param exerciseRelatedDiet Diet value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addExerciseRelatedDiet(Diet exerciseRelatedDiet);

    /**
     * A sub property of participant. The opponent on this action.
     *
     * @return {@link Person}
     */
    List<Person> getOpponentList();

    /**
     * A sub property of participant. The opponent on this action.
     *
     * @return {@link Person}
     */
    Person getOpponent();

    /**
     * A sub property of participant. The opponent on this action.
     *
     * @param opponent Person value to set.
     */
    void addOpponent(Person opponent);

    /**
     * A sub property of location. The course where this action was taken.
     *
     * @return {@link Place}
     */
    List<Place> getExerciseCourseList();

    /**
     * A sub property of location. The course where this action was taken.
     *
     * @return {@link Place}
     */
    Place getExerciseCourse();

    /**
     * A sub property of location. The course where this action was taken.
     *
     * @param exerciseCourse Place value to set.
     */
    void addExerciseCourse(Place exerciseCourse);

    /**
     * A sub property of location. The final location of the object or the agent after the action.
     *
     * @return {@link Place}
     */
    List<Place> getToLocationList();

    /**
     * A sub property of location. The final location of the object or the agent after the action.
     *
     * @return {@link Place}
     */
    Place getToLocation();

    /**
     * A sub property of location. The final location of the object or the agent after the action.
     *
     * @param toLocation Place value to set.
     */
    void addToLocation(Place toLocation);

    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getExerciseTypeList();

    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getExerciseType();

    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     *
     * @param exerciseType Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addExerciseType(Text exerciseType);
}
