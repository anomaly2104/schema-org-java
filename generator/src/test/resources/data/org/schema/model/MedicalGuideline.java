/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.MedicalEvidenceLevel;
import org.schema.model.datatype.Text;
import org.schema.model.MedicalEntity;
import org.schema.model.datatype.Date;

/**
 * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalGuideline">https://schema.org/MedicalGuideline</a>
 */
public interface MedicalGuideline extends MedicalEntity {

    /**
     * Strength of evidence of the data used to formulate the guideline (enumerated).
     *
     * @return {@link MedicalEvidenceLevel}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<MedicalEvidenceLevel> getEvidenceLevelList();

    /**
     * Strength of evidence of the data used to formulate the guideline (enumerated).
     *
     * @return {@link MedicalEvidenceLevel}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalEvidenceLevel getEvidenceLevel();

    /**
     * Strength of evidence of the data used to formulate the guideline (enumerated).
     *
     * @param evidenceLevel MedicalEvidenceLevel value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addEvidenceLevel(MedicalEvidenceLevel evidenceLevel);

    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getEvidenceOriginList();

    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getEvidenceOrigin();

    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     *
     * @param evidenceOrigin Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addEvidenceOrigin(Text evidenceOrigin);

    /**
     * The medical conditions, treatments, etc. that are the subject of the guideline.
     *
     * @return {@link MedicalEntity}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<MedicalEntity> getGuidelineSubjectList();

    /**
     * The medical conditions, treatments, etc. that are the subject of the guideline.
     *
     * @return {@link MedicalEntity}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalEntity getGuidelineSubject();

    /**
     * The medical conditions, treatments, etc. that are the subject of the guideline.
     *
     * @param guidelineSubject MedicalEntity value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addGuidelineSubject(MedicalEntity guidelineSubject);

    /**
     * Date on which this guideline's recommendation was made.
     *
     * @return {@link Date}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Date> getGuidelineDateList();

    /**
     * Date on which this guideline's recommendation was made.
     *
     * @return {@link Date}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Date getGuidelineDate();

    /**
     * Date on which this guideline's recommendation was made.
     *
     * @param guidelineDate Date value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addGuidelineDate(Date guidelineDate);
}
