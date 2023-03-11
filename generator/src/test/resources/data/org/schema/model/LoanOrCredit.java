/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Thing;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Boolean;
import org.schema.model.Duration;
import org.schema.model.QuantitativeValue;
import org.schema.model.MonetaryAmount;
import org.schema.model.datatype.Number;
import org.schema.model.RepaymentSpecification;

/**
 * A financial product for the loaning of an amount of money, or line of credit, under agreed terms and charges.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
 * @see <a href="https://schema.org/LoanOrCredit">https://schema.org/LoanOrCredit</a>
 */
public interface LoanOrCredit extends FinancialProduct {

    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     *
     * @return {@link Thing} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    <T> List<T> getRequiredCollateralList();

    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     *
     * @return {@link Thing} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    <T> T getRequiredCollateral();

    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     *
     * @param requiredCollateral Thing value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void addRequiredCollateral(Thing requiredCollateral);
    /**
     * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
     *
     * @param requiredCollateral Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void addRequiredCollateral(Text requiredCollateral);

    /**
     * The type of a loan or credit.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    <T> List<T> getLoanTypeList();

    /**
     * The type of a loan or credit.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    <T> T getLoanType();

    /**
     * The type of a loan or credit.
     *
     * @param loanType URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void addLoanType(URL loanType);
    /**
     * The type of a loan or credit.
     *
     * @param loanType Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void addLoanType(Text loanType);

    /**
     * The currency in which the monetary amount is expressed.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    List<Text> getCurrencyList();

    /**
     * The currency in which the monetary amount is expressed.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    Text getCurrency();

    /**
     * The currency in which the monetary amount is expressed.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @param currency Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void addCurrency(Text currency);

    /**
     * Whether the terms for payment of interest can be renegotiated during the life of the loan.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    List<Boolean> getRenegotiableLoanList();

    /**
     * Whether the terms for payment of interest can be renegotiated during the life of the loan.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    Boolean getRenegotiableLoan();

    /**
     * Whether the terms for payment of interest can be renegotiated during the life of the loan.
     *
     * @param renegotiableLoan Boolean value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void addRenegotiableLoan(Boolean renegotiableLoan);

    /**
     * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
     *
     * @return {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    List<Duration> getGracePeriodList();

    /**
     * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
     *
     * @return {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    Duration getGracePeriod();

    /**
     * The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred.
     *
     * @param gracePeriod Duration value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void addGracePeriod(Duration gracePeriod);

    /**
     * The duration of the loan or credit agreement.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    List<QuantitativeValue> getLoanTermList();

    /**
     * The duration of the loan or credit agreement.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    QuantitativeValue getLoanTerm();

    /**
     * The duration of the loan or credit agreement.
     *
     * @param loanTerm QuantitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void addLoanTerm(QuantitativeValue loanTerm);

    /**
     * The amount of money.
     *
     * @return {@link MonetaryAmount} or {@link Number}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    <T> List<T> getAmountList();

    /**
     * The amount of money.
     *
     * @return {@link MonetaryAmount} or {@link Number}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    <T> T getAmount();

    /**
     * The amount of money.
     *
     * @param amount MonetaryAmount value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void addAmount(MonetaryAmount amount);
    /**
     * The amount of money.
     *
     * @param amount Number value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void addAmount(Number amount);

    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     *
     * @return {@link RepaymentSpecification}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    List<RepaymentSpecification> getLoanRepaymentFormList();

    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     *
     * @return {@link RepaymentSpecification}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    RepaymentSpecification getLoanRepaymentForm();

    /**
     * A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment.
     *
     * @param loanRepaymentForm RepaymentSpecification value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void addLoanRepaymentForm(RepaymentSpecification loanRepaymentForm);

    /**
     * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    List<Boolean> getRecourseLoanList();

    /**
     * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    Boolean getRecourseLoan();

    /**
     * The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.
     *
     * @param recourseLoan Boolean value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void addRecourseLoan(Boolean recourseLoan);
}
