/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Person;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;

/**
 * An instance of a [[Course]] which is distinct from other instances because it is offered at a different time or location or through different media or modes of study or to a specific section of students.
 *
 * @see <a href="https://schema.org/CourseInstance">https://schema.org/CourseInstance</a>
 */
public interface CourseInstance extends Event {

    /**
     * A person assigned to instruct or provide instructional assistance for the [[CourseInstance]].
     *
     * @return {@link Person}
     */
    List<Person> getInstructorList();

    /**
     * A person assigned to instruct or provide instructional assistance for the [[CourseInstance]].
     *
     * @return {@link Person}
     */
    Person getInstructor();

    /**
     * A person assigned to instruct or provide instructional assistance for the [[CourseInstance]].
     *
     * @param instructor Person value to set.
     */
    void addInstructor(Person instructor);

    /**
     * The amount of work expected of students taking the course, often provided as a figure per week or per month, and may be broken down by type. For example, "2 hours of lectures, 1 hour of lab work and 3 hours of independent study per week".
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1909">https://github.com/schemaorg/schemaorg/issues/1909</a>
     */
    List<Text> getCourseWorkloadList();

    /**
     * The amount of work expected of students taking the course, often provided as a figure per week or per month, and may be broken down by type. For example, "2 hours of lectures, 1 hour of lab work and 3 hours of independent study per week".
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1909">https://github.com/schemaorg/schemaorg/issues/1909</a>
     */
    Text getCourseWorkload();

    /**
     * The amount of work expected of students taking the course, often provided as a figure per week or per month, and may be broken down by type. For example, "2 hours of lectures, 1 hour of lab work and 3 hours of independent study per week".
     *
     * @param courseWorkload Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1909">https://github.com/schemaorg/schemaorg/issues/1909</a>
     */
    void addCourseWorkload(Text courseWorkload);

    /**
     * The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     *
     * @return {@link URL} or {@link Text}
     */
    <T> List<T> getCourseModeList();

    /**
     * The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     *
     * @return {@link URL} or {@link Text}
     */
    <T> T getCourseMode();

    /**
     * The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     *
     * @param courseMode URL value to set.
     */
    void addCourseMode(URL courseMode);
    /**
     * The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     *
     * @param courseMode Text value to set.
     */
    void addCourseMode(Text courseMode);
}
