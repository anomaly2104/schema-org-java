/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.DoseSchedule;
import org.schema.model.Drug;
import org.schema.model.MedicalEntity;

/**
 * A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/TherapeuticProcedure">https://schema.org/TherapeuticProcedure</a>
 */
public interface TherapeuticProcedure extends MedicalProcedure {

    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     *
     * @return {@link DoseSchedule}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<DoseSchedule> getDoseScheduleList();

    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     *
     * @return {@link DoseSchedule}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    DoseSchedule getDoseSchedule();

    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     *
     * @param doseSchedule DoseSchedule value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addDoseSchedule(DoseSchedule doseSchedule);

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @return {@link Drug}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Drug> getDrugList();

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @return {@link Drug}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Drug getDrug();

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @param drug Drug value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addDrug(Drug drug);

    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or otherwise life-threatening or requiring immediate medical attention), tag it as a seriousAdverseOutcome instead.
     *
     * @return {@link MedicalEntity}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<MedicalEntity> getAdverseOutcomeList();

    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or otherwise life-threatening or requiring immediate medical attention), tag it as a seriousAdverseOutcome instead.
     *
     * @return {@link MedicalEntity}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalEntity getAdverseOutcome();

    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or otherwise life-threatening or requiring immediate medical attention), tag it as a seriousAdverseOutcome instead.
     *
     * @param adverseOutcome MedicalEntity value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addAdverseOutcome(MedicalEntity adverseOutcome);
}
