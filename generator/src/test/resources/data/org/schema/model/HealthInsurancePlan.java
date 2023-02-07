/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.HealthPlanFormulary;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.ContactPoint;
import org.schema.model.HealthPlanNetwork;

/**
 * A US-style health insurance plan, including PPOs, EPOs, and HMOs. 
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
 * @see <a href="https://schema.org/HealthInsurancePlan">https://schema.org/HealthInsurancePlan</a>
 */
public interface HealthInsurancePlan extends Intangible {

    /**
     * Formularies covered by this plan.
     *
     * @return {@link HealthPlanFormulary}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<HealthPlanFormulary> getIncludesHealthPlanFormularyList();

    /**
     * Formularies covered by this plan.
     *
     * @return {@link HealthPlanFormulary}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    HealthPlanFormulary getIncludesHealthPlanFormulary();

    /**
     * Formularies covered by this plan.
     *
     * @param includesHealthPlanFormulary HealthPlanFormulary value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addIncludesHealthPlanFormulary(HealthPlanFormulary includesHealthPlanFormulary);

    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<URL> getBenefitsSummaryUrlList();

    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    URL getBenefitsSummaryUrl();

    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     *
     * @param benefitsSummaryUrl URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addBenefitsSummaryUrl(URL benefitsSummaryUrl);

    /**
     * TODO.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<Text> getHealthPlanDrugOptionList();

    /**
     * TODO.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanDrugOption();

    /**
     * TODO.
     *
     * @param healthPlanDrugOption Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addHealthPlanDrugOption(Text healthPlanDrugOption);

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
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<Text> getHealthPlanIdList();

    /**
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanId();

    /**
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     *
     * @param healthPlanId Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addHealthPlanId(Text healthPlanId);

    /**
     * A contact point for a person or organization.
     *
     * @return {@link ContactPoint}
     */
    List<ContactPoint> getContactPointList();

    /**
     * A contact point for a person or organization.
     *
     * @return {@link ContactPoint}
     */
    ContactPoint getContactPoint();

    /**
     * A contact point for a person or organization.
     *
     * @param contactPoint ContactPoint value to set.
     */
    void addContactPoint(ContactPoint contactPoint);

    /**
     * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    <T> List<T> getUsesHealthPlanIdStandardList();

    /**
     * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    <T> T getUsesHealthPlanIdStandard();

    /**
     * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details.
     *
     * @param usesHealthPlanIdStandard URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addUsesHealthPlanIdStandard(URL usesHealthPlanIdStandard);
    /**
     * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details.
     *
     * @param usesHealthPlanIdStandard Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addUsesHealthPlanIdStandard(Text usesHealthPlanIdStandard);

    /**
     * Networks covered by this plan.
     *
     * @return {@link HealthPlanNetwork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<HealthPlanNetwork> getIncludesHealthPlanNetworkList();

    /**
     * Networks covered by this plan.
     *
     * @return {@link HealthPlanNetwork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    HealthPlanNetwork getIncludesHealthPlanNetwork();

    /**
     * Networks covered by this plan.
     *
     * @param includesHealthPlanNetwork HealthPlanNetwork value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addIncludesHealthPlanNetwork(HealthPlanNetwork includesHealthPlanNetwork);

    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    List<URL> getHealthPlanMarketingUrlList();

    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    URL getHealthPlanMarketingUrl();

    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     *
     * @param healthPlanMarketingUrl URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void addHealthPlanMarketingUrl(URL healthPlanMarketingUrl);
}
