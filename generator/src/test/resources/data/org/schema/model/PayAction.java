/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Person;
import org.schema.model.Audience;
import org.schema.model.ContactPoint;
import org.schema.model.Organization;

/**
 * An agent pays a price to a participant.
 *
 * @see <a href="https://schema.org/PayAction">https://schema.org/PayAction</a>
 */
public interface PayAction extends TradeAction {

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @return {@link Person} or {@link Audience} or {@link ContactPoint} or {@link Organization}
     */
    <T> List<T> getRecipientList();

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @return {@link Person} or {@link Audience} or {@link ContactPoint} or {@link Organization}
     */
    <T> T getRecipient();

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient Person value to set.
     */
    void addRecipient(Person recipient);
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient Audience value to set.
     */
    void addRecipient(Audience recipient);
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient ContactPoint value to set.
     */
    void addRecipient(ContactPoint recipient);
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient Organization value to set.
     */
    void addRecipient(Organization recipient);
}
