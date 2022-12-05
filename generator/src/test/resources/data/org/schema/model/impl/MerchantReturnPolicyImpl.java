/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.MerchantReturnEnumeration;
import org.schema.model.Country;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.MonetaryAmount;
import org.schema.model.datatype.Number;
import org.schema.model.ReturnFeesEnumeration;
import org.schema.model.datatype.Boolean;
import org.schema.model.OfferItemCondition;
import org.schema.model.ReturnLabelSourceEnumeration;
import org.schema.model.RefundTypeEnumeration;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Integer;
import org.schema.model.datatype.Date;
import org.schema.model.ReturnMethodEnumeration;
import org.schema.model.PropertyValue;
import org.schema.model.MerchantReturnPolicySeasonalOverride;
import org.schema.model.CreativeWork;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.MerchantReturnPolicy;

/**
 * A MerchantReturnPolicy provides information about product return policies associated with an [[Organization]], [[Product]], or [[Offer]].
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
 * @see <a href="https://schema.org/MerchantReturnPolicy">https://schema.org/MerchantReturnPolicy</a>
 */
@JsonLdTypeName("MerchantReturnPolicy")
public class MerchantReturnPolicyImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements MerchantReturnPolicy {

    private MerchantReturnEnumeration returnPolicyCategory;

    /**
     * Specifies an applicable return policy (from an enumeration).
     *
     * @return {@link MerchantReturnEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public MerchantReturnEnumeration getReturnPolicyCategory() {
        return returnPolicyCategory;
    }

    /**
     * Specifies an applicable return policy (from an enumeration).
     *
     * @param returnPolicyCategory MerchantReturnEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setReturnPolicyCategory(MerchantReturnEnumeration returnPolicyCategory) {
        this.returnPolicyCategory = returnPolicyCategory;
    }

    private Object returnPolicyCountry;

    /**
     * The country where the product has to be sent to for returns, for example "Ireland" using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public <T> T getReturnPolicyCountry() {
        return (T) returnPolicyCountry;
    }

    /**
     * The country where the product has to be sent to for returns, for example "Ireland" using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
     *
     * @param returnPolicyCountry Country value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setReturnPolicyCountry(Country returnPolicyCountry) {
        this.returnPolicyCountry = returnPolicyCountry;
    }
    /**
     * The country where the product has to be sent to for returns, for example "Ireland" using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent too.
     *
     * @param returnPolicyCountry Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setReturnPolicyCountry(Text returnPolicyCountry) {
        this.returnPolicyCountry = returnPolicyCountry;
    }

    private URL merchantReturnLink;

    /**
     * Specifies a Web page or service by URL, for product returns.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public URL getMerchantReturnLink() {
        return merchantReturnLink;
    }

    /**
     * Specifies a Web page or service by URL, for product returns.
     *
     * @param merchantReturnLink URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setMerchantReturnLink(URL merchantReturnLink) {
        this.merchantReturnLink = merchantReturnLink;
    }

    private Object restockingFee;

    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     *
     * @return {@link MonetaryAmount} or {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public <T> T getRestockingFee() {
        return (T) restockingFee;
    }

    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     *
     * @param restockingFee MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setRestockingFee(MonetaryAmount restockingFee) {
        this.restockingFee = restockingFee;
    }
    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     *
     * @param restockingFee Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setRestockingFee(Number restockingFee) {
        this.restockingFee = restockingFee;
    }

    private MonetaryAmount itemDefectReturnShippingFeesAmount;

    /**
     * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
     *
     * @return {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public MonetaryAmount getItemDefectReturnShippingFeesAmount() {
        return itemDefectReturnShippingFeesAmount;
    }

    /**
     * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
     *
     * @param itemDefectReturnShippingFeesAmount MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setItemDefectReturnShippingFeesAmount(MonetaryAmount itemDefectReturnShippingFeesAmount) {
        this.itemDefectReturnShippingFeesAmount = itemDefectReturnShippingFeesAmount;
    }

    private ReturnFeesEnumeration itemDefectReturnFees;

    /**
     * The type of return fees for returns of defect products.
     *
     * @return {@link ReturnFeesEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public ReturnFeesEnumeration getItemDefectReturnFees() {
        return itemDefectReturnFees;
    }

    /**
     * The type of return fees for returns of defect products.
     *
     * @param itemDefectReturnFees ReturnFeesEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setItemDefectReturnFees(ReturnFeesEnumeration itemDefectReturnFees) {
        this.itemDefectReturnFees = itemDefectReturnFees;
    }

    private Boolean inStoreReturnsOffered;

    /**
     * Are in-store returns offered? (for more advanced return methods use the [[returnMethod]] property)
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public Boolean getInStoreReturnsOffered() {
        return inStoreReturnsOffered;
    }

    /**
     * Are in-store returns offered? (for more advanced return methods use the [[returnMethod]] property)
     *
     * @param inStoreReturnsOffered Boolean value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setInStoreReturnsOffered(Boolean inStoreReturnsOffered) {
        this.inStoreReturnsOffered = inStoreReturnsOffered;
    }

    private OfferItemCondition itemCondition;

    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     *
     * @return {@link OfferItemCondition}
     */
    @Override
    public OfferItemCondition getItemCondition() {
        return itemCondition;
    }

    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     *
     * @param itemCondition OfferItemCondition value to set.
     */
    @Override
    public void setItemCondition(OfferItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }

    private ReturnLabelSourceEnumeration itemDefectReturnLabelSource;

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
     *
     * @return {@link ReturnLabelSourceEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public ReturnLabelSourceEnumeration getItemDefectReturnLabelSource() {
        return itemDefectReturnLabelSource;
    }

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
     *
     * @param itemDefectReturnLabelSource ReturnLabelSourceEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setItemDefectReturnLabelSource(ReturnLabelSourceEnumeration itemDefectReturnLabelSource) {
        this.itemDefectReturnLabelSource = itemDefectReturnLabelSource;
    }

    private ReturnLabelSourceEnumeration returnLabelSource;

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
     *
     * @return {@link ReturnLabelSourceEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public ReturnLabelSourceEnumeration getReturnLabelSource() {
        return returnLabelSource;
    }

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
     *
     * @param returnLabelSource ReturnLabelSourceEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setReturnLabelSource(ReturnLabelSourceEnumeration returnLabelSource) {
        this.returnLabelSource = returnLabelSource;
    }

    private MonetaryAmount customerRemorseReturnShippingFeesAmount;

    /**
     * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
     *
     * @return {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public MonetaryAmount getCustomerRemorseReturnShippingFeesAmount() {
        return customerRemorseReturnShippingFeesAmount;
    }

    /**
     * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
     *
     * @param customerRemorseReturnShippingFeesAmount MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setCustomerRemorseReturnShippingFeesAmount(MonetaryAmount customerRemorseReturnShippingFeesAmount) {
        this.customerRemorseReturnShippingFeesAmount = customerRemorseReturnShippingFeesAmount;
    }

    private RefundTypeEnumeration refundType;

    /**
     * A refund type, from an enumerated list.
     *
     * @return {@link RefundTypeEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public RefundTypeEnumeration getRefundType() {
        return refundType;
    }

    /**
     * A refund type, from an enumerated list.
     *
     * @param refundType RefundTypeEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setRefundType(RefundTypeEnumeration refundType) {
        this.refundType = refundType;
    }

    private MonetaryAmount returnShippingFeesAmount;

    /**
     * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
     *
     * @return {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public MonetaryAmount getReturnShippingFeesAmount() {
        return returnShippingFeesAmount;
    }

    /**
     * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
     *
     * @param returnShippingFeesAmount MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setReturnShippingFeesAmount(MonetaryAmount returnShippingFeesAmount) {
        this.returnShippingFeesAmount = returnShippingFeesAmount;
    }

    private Object merchantReturnDays;

    /**
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     *
     * @return {@link DateTime} or {@link Integer} or {@link Date}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public <T> T getMerchantReturnDays() {
        return (T) merchantReturnDays;
    }

    /**
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     *
     * @param merchantReturnDays DateTime value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setMerchantReturnDays(DateTime merchantReturnDays) {
        this.merchantReturnDays = merchantReturnDays;
    }
    /**
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     *
     * @param merchantReturnDays Integer value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setMerchantReturnDays(Integer merchantReturnDays) {
        this.merchantReturnDays = merchantReturnDays;
    }
    /**
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     *
     * @param merchantReturnDays Date value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setMerchantReturnDays(Date merchantReturnDays) {
        this.merchantReturnDays = merchantReturnDays;
    }

    private ReturnMethodEnumeration returnMethod;

    /**
     * The type of return method offered, specified from an enumeration.
     *
     * @return {@link ReturnMethodEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public ReturnMethodEnumeration getReturnMethod() {
        return returnMethod;
    }

    /**
     * The type of return method offered, specified from an enumeration.
     *
     * @param returnMethod ReturnMethodEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setReturnMethod(ReturnMethodEnumeration returnMethod) {
        this.returnMethod = returnMethod;
    }

    private PropertyValue additionalProperty;

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @return {@link PropertyValue}
     */
    @Override
    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @param additionalProperty PropertyValue value to set.
     */
    @Override
    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    private ReturnLabelSourceEnumeration customerRemorseReturnLabelSource;

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
     *
     * @return {@link ReturnLabelSourceEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public ReturnLabelSourceEnumeration getCustomerRemorseReturnLabelSource() {
        return customerRemorseReturnLabelSource;
    }

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
     *
     * @param customerRemorseReturnLabelSource ReturnLabelSourceEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setCustomerRemorseReturnLabelSource(ReturnLabelSourceEnumeration customerRemorseReturnLabelSource) {
        this.customerRemorseReturnLabelSource = customerRemorseReturnLabelSource;
    }

    private ReturnFeesEnumeration customerRemorseReturnFees;

    /**
     * The type of return fees if the product is returned due to customer remorse.
     *
     * @return {@link ReturnFeesEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public ReturnFeesEnumeration getCustomerRemorseReturnFees() {
        return customerRemorseReturnFees;
    }

    /**
     * The type of return fees if the product is returned due to customer remorse.
     *
     * @param customerRemorseReturnFees ReturnFeesEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setCustomerRemorseReturnFees(ReturnFeesEnumeration customerRemorseReturnFees) {
        this.customerRemorseReturnFees = customerRemorseReturnFees;
    }

    private MerchantReturnPolicySeasonalOverride returnPolicySeasonalOverride;

    /**
     * Seasonal override of a return policy.
     *
     * @return {@link MerchantReturnPolicySeasonalOverride}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public MerchantReturnPolicySeasonalOverride getReturnPolicySeasonalOverride() {
        return returnPolicySeasonalOverride;
    }

    /**
     * Seasonal override of a return policy.
     *
     * @param returnPolicySeasonalOverride MerchantReturnPolicySeasonalOverride value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2880">https://github.com/schemaorg/schemaorg/issues/2880</a>
     */
    @Override
    public void setReturnPolicySeasonalOverride(MerchantReturnPolicySeasonalOverride returnPolicySeasonalOverride) {
        this.returnPolicySeasonalOverride = returnPolicySeasonalOverride;
    }

    private Object applicableCountry;

    /**
     * A country where a particular merchant return policy applies to, for example the two-letter ISO 3166-1 alpha-2 country code.
     *
     * @return {@link Text} or {@link Country}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/3001">https://github.com/schemaorg/schemaorg/issues/3001</a>
     */
    @Override
    public <T> T getApplicableCountry() {
        return (T) applicableCountry;
    }

    /**
     * A country where a particular merchant return policy applies to, for example the two-letter ISO 3166-1 alpha-2 country code.
     *
     * @param applicableCountry Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/3001">https://github.com/schemaorg/schemaorg/issues/3001</a>
     */
    @Override
    public void setApplicableCountry(Text applicableCountry) {
        this.applicableCountry = applicableCountry;
    }
    /**
     * A country where a particular merchant return policy applies to, for example the two-letter ISO 3166-1 alpha-2 country code.
     *
     * @param applicableCountry Country value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/3001">https://github.com/schemaorg/schemaorg/issues/3001</a>
     */
    @Override
    public void setApplicableCountry(Country applicableCountry) {
        this.applicableCountry = applicableCountry;
    }

    private ReturnFeesEnumeration returnFees;

    /**
     * The type of return fees for purchased products (for any return reason)
     *
     * @return {@link ReturnFeesEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public ReturnFeesEnumeration getReturnFees() {
        return returnFees;
    }

    /**
     * The type of return fees for purchased products (for any return reason)
     *
     * @param returnFees ReturnFeesEnumeration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2288">https://github.com/schemaorg/schemaorg/issues/2288</a>
     */
    @Override
    public void setReturnFees(ReturnFeesEnumeration returnFees) {
        this.returnFees = returnFees;
    }

    private Object mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void setMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void setMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }

    private Text alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void setAlternateName(Text alternateName) {
        this.alternateName = alternateName;
    }

    private Text name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void setName(Text name) {
        this.name = name;
    }

    private Action potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }

    private Object image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void setImage(URL image) {
        this.image = image;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void setImage(ImageObject image) {
        this.image = image;
    }

    private URL url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    private Text description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void setDescription(Text description) {
        this.description = description;
    }

    private Object subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Event subjectOf) {
        this.subjectOf = subjectOf;
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = subjectOf;
    }

    private URL additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void setAdditionalType(URL additionalType) {
        this.additionalType = additionalType;
    }

    private Text disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void setDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = disambiguatingDescription;
    }

    private URL sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void setSameAs(URL sameAs) {
        this.sameAs = sameAs;
    }

    private Object identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void setIdentifier(URL identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void setIdentifier(Text identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void setIdentifier(PropertyValue identifier) {
        this.identifier = identifier;
    }
}
