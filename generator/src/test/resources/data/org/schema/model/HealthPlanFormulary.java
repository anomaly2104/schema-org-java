/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.Text;

/**
 * For a given health insurance plan, the specification for costs and coverage of prescription drugs. 
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
 * @see <a href="https://schema.org/HealthPlanFormulary">https://schema.org/HealthPlanFormulary</a>
 */
public interface HealthPlanFormulary extends Intangible {

    /**
     * Whether prescriptions can be delivered by mail.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<Boolean> getOffersPrescriptionByMailList();

    /**
     * Whether prescriptions can be delivered by mail.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Boolean getOffersPrescriptionByMail();

    /**
     * Whether prescriptions can be delivered by mail.
     *
     * @param offersPrescriptionByMail Boolean value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addOffersPrescriptionByMail(Boolean offersPrescriptionByMail);

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<Text> getHealthPlanDrugTierList();

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanDrugTier();

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @param healthPlanDrugTier Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addHealthPlanDrugTier(Text healthPlanDrugTier);

    /**
     * Whether The costs to the patient for services under this network or formulary.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<Boolean> getHealthPlanCostSharingList();

    /**
     * Whether The costs to the patient for services under this network or formulary.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Boolean getHealthPlanCostSharing();

    /**
     * Whether The costs to the patient for services under this network or formulary.
     *
     * @param healthPlanCostSharing Boolean value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addHealthPlanCostSharing(Boolean healthPlanCostSharing);
}
