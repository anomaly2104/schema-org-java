/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.ItemList;
import org.schema.model.Answer;
import org.schema.model.datatype.Integer;
import org.schema.model.datatype.Text;

/**
 * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_QAStackExchange">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_QAStackExchange</a>
 * @see <a href="https://schema.org/Question">https://schema.org/Question</a>
 */
public interface Question extends Comment {

    /**
     * An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.
     *
     * @return {@link ItemList} or {@link Answer}
     */
    <T> List<T> getSuggestedAnswerList();

    /**
     * An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.
     *
     * @return {@link ItemList} or {@link Answer}
     */
    <T> T getSuggestedAnswer();

    /**
     * An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.
     *
     * @param suggestedAnswer ItemList value to set.
     */
    void addSuggestedAnswer(ItemList suggestedAnswer);
    /**
     * An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site.
     *
     * @param suggestedAnswer Answer value to set.
     */
    void addSuggestedAnswer(Answer suggestedAnswer);

    /**
     * The answer(s) that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.
     *
     * @return {@link Answer} or {@link ItemList}
     */
    <T> List<T> getAcceptedAnswerList();

    /**
     * The answer(s) that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.
     *
     * @return {@link Answer} or {@link ItemList}
     */
    <T> T getAcceptedAnswer();

    /**
     * The answer(s) that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.
     *
     * @param acceptedAnswer Answer value to set.
     */
    void addAcceptedAnswer(Answer acceptedAnswer);
    /**
     * The answer(s) that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author.
     *
     * @param acceptedAnswer ItemList value to set.
     */
    void addAcceptedAnswer(ItemList acceptedAnswer);

    /**
     * The number of answers this question has received.
     *
     * @return {@link Integer}
     */
    List<Integer> getAnswerCountList();

    /**
     * The number of answers this question has received.
     *
     * @return {@link Integer}
     */
    Integer getAnswerCount();

    /**
     * The number of answers this question has received.
     *
     * @param answerCount Integer value to set.
     */
    void addAnswerCount(Integer answerCount);

    /**
     * For questions that are part of learning resources (e.g. Quiz), eduQuestionType indicates the format of question being given. Example: "Multiple choice", "Open ended", "Flashcard".
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2636">https://github.com/schemaorg/schemaorg/issues/2636</a>
     */
    List<Text> getEduQuestionTypeList();

    /**
     * For questions that are part of learning resources (e.g. Quiz), eduQuestionType indicates the format of question being given. Example: "Multiple choice", "Open ended", "Flashcard".
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2636">https://github.com/schemaorg/schemaorg/issues/2636</a>
     */
    Text getEduQuestionType();

    /**
     * For questions that are part of learning resources (e.g. Quiz), eduQuestionType indicates the format of question being given. Example: "Multiple choice", "Open ended", "Flashcard".
     *
     * @param eduQuestionType Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2636">https://github.com/schemaorg/schemaorg/issues/2636</a>
     */
    void addEduQuestionType(Text eduQuestionType);
}
