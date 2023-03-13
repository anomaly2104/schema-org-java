/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.DefinedTerm;
import org.schema.model.AlignmentObject;

/**
 * The LearningResource type can be used to indicate [[CreativeWork]]s (whether physical or digital) that have a particular and explicit orientation towards learning, education, skill acquisition, and other educational purposes.
 * 
 * [[LearningResource]] is expected to be used as an addition to a primary type such as [[Book]], [[VideoObject]], [[Product]] etc.
 * 
 * [[EducationEvent]] serves a similar purpose for event-like things (e.g. a [[Trip]]). A [[LearningResource]] may be created as a result of an [[EducationEvent]], for example by recording one.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1401">https://github.com/schemaorg/schemaorg/issues/1401</a>
 * @see <a href="https://schema.org/LearningResource">https://schema.org/LearningResource</a>
 */
public interface LearningResource extends CreativeWork {

    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     *
     * @return {@link Text} or {@link URL} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    <T> List<T> getEducationalLevelList();

    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     *
     * @return {@link Text} or {@link URL} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    <T> T getEducationalLevel();

    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     *
     * @param educationalLevel Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    void addEducationalLevel(Text educationalLevel);
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     *
     * @param educationalLevel URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    void addEducationalLevel(URL educationalLevel);
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     *
     * @param educationalLevel DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    void addEducationalLevel(DefinedTerm educationalLevel);

    /**
     * Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource.
     *
     * @return {@link Text} or {@link URL} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    <T> List<T> getCompetencyRequiredList();

    /**
     * Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource.
     *
     * @return {@link Text} or {@link URL} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    <T> T getCompetencyRequired();

    /**
     * Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource.
     *
     * @param competencyRequired Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    void addCompetencyRequired(Text competencyRequired);
    /**
     * Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource.
     *
     * @param competencyRequired URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    void addCompetencyRequired(URL competencyRequired);
    /**
     * Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource.
     *
     * @param competencyRequired DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    void addCompetencyRequired(DefinedTerm competencyRequired);

    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     *
     * @return {@link DefinedTerm} or {@link Text}
     */
    <T> List<T> getEducationalUseList();

    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     *
     * @return {@link DefinedTerm} or {@link Text}
     */
    <T> T getEducationalUse();

    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     *
     * @param educationalUse DefinedTerm value to set.
     */
    void addEducationalUse(DefinedTerm educationalUse);
    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     *
     * @param educationalUse Text value to set.
     */
    void addEducationalUse(Text educationalUse);

    /**
     * An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     *
     * @return {@link AlignmentObject}
     */
    List<AlignmentObject> getEducationalAlignmentList();

    /**
     * An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     *
     * @return {@link AlignmentObject}
     */
    AlignmentObject getEducationalAlignment();

    /**
     * An alignment to an established educational framework.
     * 
     * This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency.
     *
     * @param educationalAlignment AlignmentObject value to set.
     */
    void addEducationalAlignment(AlignmentObject educationalAlignment);

    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     *
     * @return {@link DefinedTerm} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    <T> List<T> getAssessesList();

    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     *
     * @return {@link DefinedTerm} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    <T> T getAssesses();

    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     *
     * @param assesses DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    void addAssesses(DefinedTerm assesses);
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     *
     * @param assesses Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    void addAssesses(Text assesses);

    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     *
     * @return {@link DefinedTerm} or {@link Text}
     */
    <T> List<T> getLearningResourceTypeList();

    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     *
     * @return {@link DefinedTerm} or {@link Text}
     */
    <T> T getLearningResourceType();

    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     *
     * @param learningResourceType DefinedTerm value to set.
     */
    void addLearningResourceType(DefinedTerm learningResourceType);
    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     *
     * @param learningResourceType Text value to set.
     */
    void addLearningResourceType(Text learningResourceType);

    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     *
     * @return {@link DefinedTerm} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    <T> List<T> getTeachesList();

    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     *
     * @return {@link DefinedTerm} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    <T> T getTeaches();

    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     *
     * @param teaches DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    void addTeaches(DefinedTerm teaches);
    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     *
     * @param teaches Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2427">https://github.com/schemaorg/schemaorg/issues/2427</a>
     */
    void addTeaches(Text teaches);
}
