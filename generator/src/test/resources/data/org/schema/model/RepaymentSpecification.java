/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Number;
import org.schema.model.MonetaryAmount;

/**
 * A structured value representing repayment.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
 * @see <a href="https://schema.org/RepaymentSpecification">https://schema.org/RepaymentSpecification</a>
 */
public interface RepaymentSpecification extends StructuredValue {

    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    Number getNumberOfLoanPayments();

    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     *
     * @param numberOfLoanPayments Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setNumberOfLoanPayments(Number numberOfLoanPayments);

    /**
     * The amount to be paid as a penalty in the event of early payment of the loan.
     *
     * @return {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    MonetaryAmount getEarlyPrepaymentPenalty();

    /**
     * The amount to be paid as a penalty in the event of early payment of the loan.
     *
     * @param earlyPrepaymentPenalty MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setEarlyPrepaymentPenalty(MonetaryAmount earlyPrepaymentPenalty);

    /**
     * The amount of money to pay in a single payment.
     *
     * @return {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    MonetaryAmount getLoanPaymentAmount();

    /**
     * The amount of money to pay in a single payment.
     *
     * @param loanPaymentAmount MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setLoanPaymentAmount(MonetaryAmount loanPaymentAmount);

    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    Number getLoanPaymentFrequency();

    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     *
     * @param loanPaymentFrequency Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setLoanPaymentFrequency(Number loanPaymentFrequency);

    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     *
     * @return {@link Number} or {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    <T> T getDownPayment();

    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     *
     * @param downPayment Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setDownPayment(Number downPayment);
    /**
     * a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.
     *
     * @param downPayment MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setDownPayment(MonetaryAmount downPayment);
}
