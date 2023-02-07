/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.AdministrativeArea;
import org.schema.model.datatype.Number;
import org.schema.model.datatype.Text;
import org.schema.model.QualitativeValue;
import org.schema.model.DrugCostCategory;
import org.schema.model.DrugLegalStatus;
import org.schema.model.MedicalEnumeration;
import org.schema.model.Grant;
import org.schema.model.MedicalStudy;
import org.schema.model.MedicalCode;
import org.schema.model.MedicalGuideline;
import org.schema.model.Organization;
import org.schema.model.MedicineSystem;
import org.schema.model.MedicalSpecialty;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import java.util.List;
import org.schema.model.MedicalEntity;
import org.schema.model.DrugCost;

/**
 * The cost per unit of a medical drug. Note that this type is not meant to represent the price in an offer of a drug for sale; see the Offer type for that. This type will typically be used to tag wholesale or average retail cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary widely depending on how and where they are paid for, so while this type captures some of the variables, costs should be used with caution by consumers of this schema's markup.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/DrugCost">https://schema.org/DrugCost</a>
 */
@JsonLdTypeName("DrugCost")
public class DrugCostImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements DrugCost {

    private List<AdministrativeArea> applicableLocation;

    /**
     * The location in which the status applies.
     *
     * @return {@link AdministrativeArea}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<AdministrativeArea> getApplicableLocationList() {
        return applicableLocation;
    }

    /**
     * The location in which the status applies.
     *
     * @return {@link AdministrativeArea}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public AdministrativeArea getApplicableLocation() {
        return getFirst(applicableLocation);
    }

    /**
     * The location in which the status applies.
     *
     * @param applicableLocation AdministrativeArea value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addApplicableLocation(AdministrativeArea applicableLocation) {
        this.applicableLocation = add(this.applicableLocation, applicableLocation);
    }

    @JsonLdFieldTypes({ Number.class, Text.class, QualitativeValue.class })
    private List<Object> costPerUnit;

    /**
     * The cost per unit of the drug.
     *
     * @return {@link Number} or {@link Text} or {@link QualitativeValue}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> List<T> getCostPerUnitList() {
        return (List<T>) costPerUnit;
    }

    /**
     * The cost per unit of the drug.
     *
     * @return {@link Number} or {@link Text} or {@link QualitativeValue}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> T getCostPerUnit() {
        return (T) getFirst(costPerUnit);
    }

    /**
     * The cost per unit of the drug.
     *
     * @param costPerUnit Number value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCostPerUnit(Number costPerUnit) {
        this.costPerUnit = add(this.costPerUnit, costPerUnit);
    }
    /**
     * The cost per unit of the drug.
     *
     * @param costPerUnit Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCostPerUnit(Text costPerUnit) {
        this.costPerUnit = add(this.costPerUnit, costPerUnit);
    }
    /**
     * The cost per unit of the drug.
     *
     * @param costPerUnit QualitativeValue value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCostPerUnit(QualitativeValue costPerUnit) {
        this.costPerUnit = add(this.costPerUnit, costPerUnit);
    }

    private List<DrugCostCategory> costCategory;

    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     *
     * @return {@link DrugCostCategory}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<DrugCostCategory> getCostCategoryList() {
        return costCategory;
    }

    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     *
     * @return {@link DrugCostCategory}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public DrugCostCategory getCostCategory() {
        return getFirst(costCategory);
    }

    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     *
     * @param costCategory DrugCostCategory value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCostCategory(DrugCostCategory costCategory) {
        this.costCategory = add(this.costCategory, costCategory);
    }

    private List<Text> drugUnit;

    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<Text> getDrugUnitList() {
        return drugUnit;
    }

    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getDrugUnit() {
        return getFirst(drugUnit);
    }

    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     *
     * @param drugUnit Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addDrugUnit(Text drugUnit) {
        this.drugUnit = add(this.drugUnit, drugUnit);
    }

    private List<Text> costCurrency;

    /**
     * The currency (in 3-letter of the drug cost. See: http://en.wikipedia.org/wiki/ISO_4217. 
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<Text> getCostCurrencyList() {
        return costCurrency;
    }

    /**
     * The currency (in 3-letter of the drug cost. See: http://en.wikipedia.org/wiki/ISO_4217. 
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getCostCurrency() {
        return getFirst(costCurrency);
    }

    /**
     * The currency (in 3-letter of the drug cost. See: http://en.wikipedia.org/wiki/ISO_4217. 
     *
     * @param costCurrency Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCostCurrency(Text costCurrency) {
        this.costCurrency = add(this.costCurrency, costCurrency);
    }

    private List<Text> costOrigin;

    /**
     * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<Text> getCostOriginList() {
        return costOrigin;
    }

    /**
     * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getCostOrigin() {
        return getFirst(costOrigin);
    }

    /**
     * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
     *
     * @param costOrigin Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCostOrigin(Text costOrigin) {
        this.costOrigin = add(this.costOrigin, costOrigin);
    }

    @JsonLdFieldTypes({ DrugLegalStatus.class, Text.class, MedicalEnumeration.class })
    private List<Object> legalStatus;

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link DrugLegalStatus} or {@link Text} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> List<T> getLegalStatusList() {
        return (List<T>) legalStatus;
    }

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link DrugLegalStatus} or {@link Text} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> T getLegalStatus() {
        return (T) getFirst(legalStatus);
    }

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus DrugLegalStatus value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addLegalStatus(DrugLegalStatus legalStatus) {
        this.legalStatus = add(this.legalStatus, legalStatus);
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addLegalStatus(Text legalStatus) {
        this.legalStatus = add(this.legalStatus, legalStatus);
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus MedicalEnumeration value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addLegalStatus(MedicalEnumeration legalStatus) {
        this.legalStatus = add(this.legalStatus, legalStatus);
    }

    private List<Grant> funding;

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @return {@link Grant}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     */
    @Override
    public List<Grant> getFundingList() {
        return funding;
    }

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @return {@link Grant}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     */
    @Override
    public Grant getFunding() {
        return getFirst(funding);
    }

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @param funding Grant value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     */
    @Override
    public void addFunding(Grant funding) {
        this.funding = add(this.funding, funding);
    }

    private List<MedicalStudy> study;

    /**
     * A medical study or trial related to this entity.
     *
     * @return {@link MedicalStudy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalStudy> getStudyList() {
        return study;
    }

    /**
     * A medical study or trial related to this entity.
     *
     * @return {@link MedicalStudy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalStudy getStudy() {
        return getFirst(study);
    }

    /**
     * A medical study or trial related to this entity.
     *
     * @param study MedicalStudy value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addStudy(MedicalStudy study) {
        this.study = add(this.study, study);
    }

    private List<MedicalCode> code;

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @return {@link MedicalCode}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalCode> getCodeList() {
        return code;
    }

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @return {@link MedicalCode}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalCode getCode() {
        return getFirst(code);
    }

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @param code MedicalCode value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCode(MedicalCode code) {
        this.code = add(this.code, code);
    }

    private List<MedicalGuideline> guideline;

    /**
     * A medical guideline related to this entity.
     *
     * @return {@link MedicalGuideline}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalGuideline> getGuidelineList() {
        return guideline;
    }

    /**
     * A medical guideline related to this entity.
     *
     * @return {@link MedicalGuideline}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalGuideline getGuideline() {
        return getFirst(guideline);
    }

    /**
     * A medical guideline related to this entity.
     *
     * @param guideline MedicalGuideline value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addGuideline(MedicalGuideline guideline) {
        this.guideline = add(this.guideline, guideline);
    }

    private List<Organization> recognizingAuthority;

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @return {@link Organization}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<Organization> getRecognizingAuthorityList() {
        return recognizingAuthority;
    }

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @return {@link Organization}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Organization getRecognizingAuthority() {
        return getFirst(recognizingAuthority);
    }

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @param recognizingAuthority Organization value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addRecognizingAuthority(Organization recognizingAuthority) {
        this.recognizingAuthority = add(this.recognizingAuthority, recognizingAuthority);
    }

    private List<MedicineSystem> medicineSystem;

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @return {@link MedicineSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicineSystem> getMedicineSystemList() {
        return medicineSystem;
    }

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @return {@link MedicineSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicineSystem getMedicineSystem() {
        return getFirst(medicineSystem);
    }

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @param medicineSystem MedicineSystem value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addMedicineSystem(MedicineSystem medicineSystem) {
        this.medicineSystem = add(this.medicineSystem, medicineSystem);
    }

    private List<MedicalSpecialty> relevantSpecialty;

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalSpecialty> getRelevantSpecialtyList() {
        return relevantSpecialty;
    }

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalSpecialty getRelevantSpecialty() {
        return getFirst(relevantSpecialty);
    }

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @param relevantSpecialty MedicalSpecialty value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addRelevantSpecialty(MedicalSpecialty relevantSpecialty) {
        this.relevantSpecialty = add(this.relevantSpecialty, relevantSpecialty);
    }

    @JsonLdFieldTypes({ CreativeWork.class, URL.class })
    private List<Object> mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> List<T> getMainEntityOfPageList() {
        return (List<T>) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) getFirst(mainEntityOfPage);
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void addMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void addMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }

    private List<Text> alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getAlternateNameList() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return getFirst(alternateName);
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void addAlternateName(Text alternateName) {
        this.alternateName = add(this.alternateName, alternateName);
    }

    private List<Text> name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getNameList() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return getFirst(name);
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void addName(Text name) {
        this.name = add(this.name, name);
    }

    private List<Action> potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public List<Action> getPotentialActionList() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return getFirst(potentialAction);
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void addPotentialAction(Action potentialAction) {
        this.potentialAction = add(this.potentialAction, potentialAction);
    }

    @JsonLdFieldTypes({ URL.class, ImageObject.class })
    private List<Object> image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> List<T> getImageList() {
        return (List<T>) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) getFirst(image);
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void addImage(URL image) {
        this.image = add(this.image, image);
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void addImage(ImageObject image) {
        this.image = add(this.image, image);
    }

    private List<URL> url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getUrlList() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return getFirst(url);
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void addUrl(URL url) {
        this.url = add(this.url, url);
    }

    private List<Text> description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDescriptionList() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return getFirst(description);
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void addDescription(Text description) {
        this.description = add(this.description, description);
    }

    @JsonLdFieldTypes({ Event.class, CreativeWork.class })
    private List<Object> subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> List<T> getSubjectOfList() {
        return (List<T>) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) getFirst(subjectOf);
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(Event subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }

    private List<URL> additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getAdditionalTypeList() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return getFirst(additionalType);
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void addAdditionalType(URL additionalType) {
        this.additionalType = add(this.additionalType, additionalType);
    }

    private List<Text> disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDisambiguatingDescriptionList() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return getFirst(disambiguatingDescription);
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void addDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = add(this.disambiguatingDescription, disambiguatingDescription);
    }

    private List<URL> sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getSameAsList() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return getFirst(sameAs);
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void addSameAs(URL sameAs) {
        this.sameAs = add(this.sameAs, sameAs);
    }

    @JsonLdFieldTypes({ URL.class, Text.class, PropertyValue.class })
    private List<Object> identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> List<T> getIdentifierList() {
        return (List<T>) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) getFirst(identifier);
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void addIdentifier(URL identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void addIdentifier(Text identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void addIdentifier(PropertyValue identifier) {
        this.identifier = add(this.identifier, identifier);
    }
}
