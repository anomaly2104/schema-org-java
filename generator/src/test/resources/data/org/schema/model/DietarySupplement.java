/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.RecommendedDoseSchedule;
import org.schema.model.DrugLegalStatus;
import org.schema.model.MedicalEnumeration;
import org.schema.model.MaximumDoseSchedule;
import org.schema.model.Organization;
import org.schema.model.datatype.Boolean;

/**
 * A product taken by mouth that contains a dietary ingredient intended to supplement the diet. Dietary ingredients may include vitamins, minerals, herbs or other botanicals, amino acids, and substances such as enzymes, organ tissues, glandulars and metabolites.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/DietarySupplement">https://schema.org/DietarySupplement</a>
 */
public interface DietarySupplement extends Substance {

    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getTargetPopulationList();

    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getTargetPopulation();

    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     *
     * @param targetPopulation Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addTargetPopulation(Text targetPopulation);

    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     *
     * @return {@link RecommendedDoseSchedule}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<RecommendedDoseSchedule> getRecommendedIntakeList();

    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     *
     * @return {@link RecommendedDoseSchedule}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    RecommendedDoseSchedule getRecommendedIntake();

    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     *
     * @param recommendedIntake RecommendedDoseSchedule value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addRecommendedIntake(RecommendedDoseSchedule recommendedIntake);

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link DrugLegalStatus} or {@link Text} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> List<T> getLegalStatusList();

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link DrugLegalStatus} or {@link Text} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> T getLegalStatus();

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus DrugLegalStatus value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addLegalStatus(DrugLegalStatus legalStatus);
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addLegalStatus(Text legalStatus);
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus MedicalEnumeration value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addLegalStatus(MedicalEnumeration legalStatus);

    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getMechanismOfActionList();

    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getMechanismOfAction();

    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     *
     * @param mechanismOfAction Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addMechanismOfAction(Text mechanismOfAction);

    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     *
     * @return {@link MaximumDoseSchedule}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<MaximumDoseSchedule> getMaximumIntakeList();

    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     *
     * @return {@link MaximumDoseSchedule}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MaximumDoseSchedule getMaximumIntake();

    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     *
     * @param maximumIntake MaximumDoseSchedule value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addMaximumIntake(MaximumDoseSchedule maximumIntake);

    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getActiveIngredientList();

    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getActiveIngredient();

    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     *
     * @param activeIngredient Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addActiveIngredient(Text activeIngredient);

    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getProprietaryNameList();

    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getProprietaryName();

    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     *
     * @param proprietaryName Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addProprietaryName(Text proprietaryName);

    /**
     * The generic name of this drug or supplement.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getNonProprietaryNameList();

    /**
     * The generic name of this drug or supplement.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getNonProprietaryName();

    /**
     * The generic name of this drug or supplement.
     *
     * @param nonProprietaryName Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addNonProprietaryName(Text nonProprietaryName);

    /**
     * The manufacturer of the product.
     *
     * @return {@link Organization}
     */
    List<Organization> getManufacturerList();

    /**
     * The manufacturer of the product.
     *
     * @return {@link Organization}
     */
    Organization getManufacturer();

    /**
     * The manufacturer of the product.
     *
     * @param manufacturer Organization value to set.
     */
    void addManufacturer(Organization manufacturer);

    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     *
     * @return {@link Boolean}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Boolean> getIsProprietaryList();

    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     *
     * @return {@link Boolean}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Boolean getIsProprietary();

    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     *
     * @param isProprietary Boolean value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addIsProprietary(Boolean isProprietary);

    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getSafetyConsiderationList();

    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getSafetyConsideration();

    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     *
     * @param safetyConsideration Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addSafetyConsideration(Text safetyConsideration);
}
