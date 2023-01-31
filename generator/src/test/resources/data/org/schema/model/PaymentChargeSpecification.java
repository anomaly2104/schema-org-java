/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.PaymentMethod;
import org.schema.model.DeliveryMethod;

/**
 * The costs of settling the payment using a particular payment method.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/PaymentChargeSpecification">https://schema.org/PaymentChargeSpecification</a>
 */
public interface PaymentChargeSpecification extends PriceSpecification {

    /**
     * The payment method(s) to which the payment charge specification applies.
     *
     * @return {@link PaymentMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<PaymentMethod> getAppliesToPaymentMethodList();

    /**
     * The payment method(s) to which the payment charge specification applies.
     *
     * @return {@link PaymentMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    PaymentMethod getAppliesToPaymentMethod();

    /**
     * The payment method(s) to which the payment charge specification applies.
     *
     * @param appliesToPaymentMethod PaymentMethod value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addAppliesToPaymentMethod(PaymentMethod appliesToPaymentMethod);

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @return {@link DeliveryMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    List<DeliveryMethod> getAppliesToDeliveryMethodList();

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @return {@link DeliveryMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    DeliveryMethod getAppliesToDeliveryMethod();

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @param appliesToDeliveryMethod DeliveryMethod value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addAppliesToDeliveryMethod(DeliveryMethod appliesToDeliveryMethod);
}
