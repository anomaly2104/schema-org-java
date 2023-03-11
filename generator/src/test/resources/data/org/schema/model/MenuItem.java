/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.NutritionInformation;
import org.schema.model.RestrictedDiet;
import org.schema.model.MenuItem;
import org.schema.model.MenuSection;
import org.schema.model.Demand;
import org.schema.model.Offer;

/**
 * A food or drink item listed in a menu or menu section.
 *
 * @see <a href="https://schema.org/MenuItem">https://schema.org/MenuItem</a>
 */
public interface MenuItem extends Intangible {

    /**
     * Nutrition information about the recipe or menu item.
     *
     * @return {@link NutritionInformation}
     */
    List<NutritionInformation> getNutritionList();

    /**
     * Nutrition information about the recipe or menu item.
     *
     * @return {@link NutritionInformation}
     */
    NutritionInformation getNutrition();

    /**
     * Nutrition information about the recipe or menu item.
     *
     * @param nutrition NutritionInformation value to set.
     */
    void addNutrition(NutritionInformation nutrition);

    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     *
     * @return {@link RestrictedDiet}
     */
    List<RestrictedDiet> getSuitableForDietList();

    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     *
     * @return {@link RestrictedDiet}
     */
    RestrictedDiet getSuitableForDiet();

    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     *
     * @param suitableForDiet RestrictedDiet value to set.
     */
    void addSuitableForDiet(RestrictedDiet suitableForDiet);

    /**
     * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
     *
     * @return {@link MenuItem} or {@link MenuSection}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1541">https://github.com/schemaorg/schemaorg/issues/1541</a>
     */
    <T> List<T> getMenuAddOnList();

    /**
     * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
     *
     * @return {@link MenuItem} or {@link MenuSection}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1541">https://github.com/schemaorg/schemaorg/issues/1541</a>
     */
    <T> T getMenuAddOn();

    /**
     * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
     *
     * @param menuAddOn MenuItem value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1541">https://github.com/schemaorg/schemaorg/issues/1541</a>
     */
    void addMenuAddOn(MenuItem menuAddOn);
    /**
     * Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.
     *
     * @param menuAddOn MenuSection value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1541">https://github.com/schemaorg/schemaorg/issues/1541</a>
     */
    void addMenuAddOn(MenuSection menuAddOn);

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Demand} or {@link Offer}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> List<T> getOffersList();

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Demand} or {@link Offer}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> T getOffers();

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Demand value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void addOffers(Demand offers);
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void addOffers(Offer offers);
}
