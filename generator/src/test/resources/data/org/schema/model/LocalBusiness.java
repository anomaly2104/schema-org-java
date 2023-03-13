/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.Organization;

/**
 * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
 *
 * @see <a href="https://schema.org/LocalBusiness">https://schema.org/LocalBusiness</a>
 */
public interface LocalBusiness extends Place, Organization {

    /**
     * The price range of the business, for example ```$$$```.
     *
     * @return {@link Text}
     */
    List<Text> getPriceRangeList();

    /**
     * The price range of the business, for example ```$$$```.
     *
     * @return {@link Text}
     */
    Text getPriceRange();

    /**
     * The price range of the business, for example ```$$$```.
     *
     * @param priceRange Text value to set.
     */
    void addPriceRange(Text priceRange);

    /**
     * The currency accepted.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    List<Text> getCurrenciesAcceptedList();

    /**
     * The currency accepted.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    Text getCurrenciesAccepted();

    /**
     * The currency accepted.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @param currenciesAccepted Text value to set.
     */
    void addCurrenciesAccepted(Text currenciesAccepted);

    /**
     * The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical) [[branch]].
     *
     * @return {@link Organization}
     */
    List<Organization> getBranchOfList();

    /**
     * The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical) [[branch]].
     *
     * @return {@link Organization}
     */
    Organization getBranchOf();

    /**
     * The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical) [[branch]].
     *
     * @param branchOf Organization value to set.
     */
    void addBranchOf(Organization branchOf);

    /**
     * Cash, Credit Card, Cryptocurrency, Local Exchange Tradings System, etc.
     *
     * @return {@link Text}
     */
    List<Text> getPaymentAcceptedList();

    /**
     * Cash, Credit Card, Cryptocurrency, Local Exchange Tradings System, etc.
     *
     * @return {@link Text}
     */
    Text getPaymentAccepted();

    /**
     * Cash, Credit Card, Cryptocurrency, Local Exchange Tradings System, etc.
     *
     * @param paymentAccepted Text value to set.
     */
    void addPaymentAccepted(Text paymentAccepted);

    /**
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br/><br/>* Days are specified using the following two-letter combinations: ```Mo```, ```Tu```, ```We```, ```Th```, ```Fr```, ```Sa```, ```Su```.<br/>* Times are specified using 24:00 format. For example, 3pm is specified as ```15:00```, 10am as ```10:00```. <br/>* Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.<br/>* If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     *
     * @return {@link Text}
     */
    List<Text> getOpeningHoursList();

    /**
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br/><br/>* Days are specified using the following two-letter combinations: ```Mo```, ```Tu```, ```We```, ```Th```, ```Fr```, ```Sa```, ```Su```.<br/>* Times are specified using 24:00 format. For example, 3pm is specified as ```15:00```, 10am as ```10:00```. <br/>* Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.<br/>* If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     *
     * @return {@link Text}
     */
    Text getOpeningHours();

    /**
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.<br/><br/>* Days are specified using the following two-letter combinations: ```Mo```, ```Tu```, ```We```, ```Th```, ```Fr```, ```Sa```, ```Su```.<br/>* Times are specified using 24:00 format. For example, 3pm is specified as ```15:00```, 10am as ```10:00```. <br/>* Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.<br/>* If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     *
     * @param openingHours Text value to set.
     */
    void addOpeningHours(Text openingHours);
}
