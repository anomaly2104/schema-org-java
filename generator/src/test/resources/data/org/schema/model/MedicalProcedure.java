/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalProcedureType;
import org.schema.model.MedicalEntity;
import org.schema.model.datatype.Text;
import org.schema.model.EventStatusType;
import org.schema.model.MedicalStudyStatus;

/**
 * A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalProcedure">https://schema.org/MedicalProcedure</a>
 */
public interface MedicalProcedure extends MedicalEntity {

    /**
     * The type of procedure, for example Surgical, Noninvasive, or Percutaneous.
     *
     * @return {@link MedicalProcedureType}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalProcedureType getProcedureType();

    /**
     * The type of procedure, for example Surgical, Noninvasive, or Percutaneous.
     *
     * @param procedureType MedicalProcedureType value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setProcedureType(MedicalProcedureType procedureType);

    /**
     * Typical preparation that a patient must undergo before having the procedure performed.
     *
     * @return {@link MedicalEntity} or {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> T getPreparation();

    /**
     * Typical preparation that a patient must undergo before having the procedure performed.
     *
     * @param preparation MedicalEntity value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setPreparation(MedicalEntity preparation);
    /**
     * Typical preparation that a patient must undergo before having the procedure performed.
     *
     * @param preparation Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setPreparation(Text preparation);

    /**
     * Location in the body of the anatomical structure.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getBodyLocation();

    /**
     * Location in the body of the anatomical structure.
     *
     * @param bodyLocation Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setBodyLocation(Text bodyLocation);

    /**
     * The status of the study (enumerated).
     *
     * @return {@link Text} or {@link EventStatusType} or {@link MedicalStudyStatus}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> T getStatus();

    /**
     * The status of the study (enumerated).
     *
     * @param status Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setStatus(Text status);
    /**
     * The status of the study (enumerated).
     *
     * @param status EventStatusType value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setStatus(EventStatusType status);
    /**
     * The status of the study (enumerated).
     *
     * @param status MedicalStudyStatus value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setStatus(MedicalStudyStatus status);

    /**
     * How the procedure is performed.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getHowPerformed();

    /**
     * How the procedure is performed.
     *
     * @param howPerformed Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setHowPerformed(Text howPerformed);

    /**
     * Typical or recommended followup care after the procedure is performed.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getFollowup();

    /**
     * Typical or recommended followup care after the procedure is performed.
     *
     * @param followup Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setFollowup(Text followup);
}
