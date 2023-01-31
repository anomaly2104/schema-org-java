/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.DateTime;
import org.schema.model.DeliveryMethod;

/**
 * An event involving the delivery of an item.
 *
 * @see <a href="https://schema.org/DeliveryEvent">https://schema.org/DeliveryEvent</a>
 */
public interface DeliveryEvent extends Event {

    /**
     * Password, PIN, or access code needed for delivery (e.g. from a locker).
     *
     * @return {@link Text}
     */
    List<Text> getAccessCodeList();

    /**
     * Password, PIN, or access code needed for delivery (e.g. from a locker).
     *
     * @return {@link Text}
     */
    Text getAccessCode();

    /**
     * Password, PIN, or access code needed for delivery (e.g. from a locker).
     *
     * @param accessCode Text value to set.
     */
    void addAccessCode(Text accessCode);

    /**
     * After this date, the item will no longer be available for pickup.
     *
     * @return {@link DateTime}
     */
    List<DateTime> getAvailableThroughList();

    /**
     * After this date, the item will no longer be available for pickup.
     *
     * @return {@link DateTime}
     */
    DateTime getAvailableThrough();

    /**
     * After this date, the item will no longer be available for pickup.
     *
     * @param availableThrough DateTime value to set.
     */
    void addAvailableThrough(DateTime availableThrough);

    /**
     * Method used for delivery or shipping.
     *
     * @return {@link DeliveryMethod}
     */
    List<DeliveryMethod> getHasDeliveryMethodList();

    /**
     * Method used for delivery or shipping.
     *
     * @return {@link DeliveryMethod}
     */
    DeliveryMethod getHasDeliveryMethod();

    /**
     * Method used for delivery or shipping.
     *
     * @param hasDeliveryMethod DeliveryMethod value to set.
     */
    void addHasDeliveryMethod(DeliveryMethod hasDeliveryMethod);

    /**
     * When the item is available for pickup from the store, locker, etc.
     *
     * @return {@link DateTime}
     */
    List<DateTime> getAvailableFromList();

    /**
     * When the item is available for pickup from the store, locker, etc.
     *
     * @return {@link DateTime}
     */
    DateTime getAvailableFrom();

    /**
     * When the item is available for pickup from the store, locker, etc.
     *
     * @param availableFrom DateTime value to set.
     */
    void addAvailableFrom(DateTime availableFrom);
}
