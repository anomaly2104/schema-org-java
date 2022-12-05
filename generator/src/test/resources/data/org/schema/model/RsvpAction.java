/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.RsvpResponseType;
import org.schema.model.Comment;
import org.schema.model.datatype.Number;

/**
 * The act of notifying an event organizer as to whether you expect to attend the event.
 *
 * @see <a href="https://schema.org/RsvpAction">https://schema.org/RsvpAction</a>
 */
public interface RsvpAction extends InformAction {

    /**
     * The response (yes, no, maybe) to the RSVP.
     *
     * @return {@link RsvpResponseType}
     */
    RsvpResponseType getRsvpResponse();

    /**
     * The response (yes, no, maybe) to the RSVP.
     *
     * @param rsvpResponse RsvpResponseType value to set.
     */
    void setRsvpResponse(RsvpResponseType rsvpResponse);

    /**
     * Comments, typically from users.
     *
     * @return {@link Comment}
     */
    Comment getComment();

    /**
     * Comments, typically from users.
     *
     * @param comment Comment value to set.
     */
    void setComment(Comment comment);

    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     *
     * @return {@link Number}
     */
    Number getAdditionalNumberOfGuests();

    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     *
     * @param additionalNumberOfGuests Number value to set.
     */
    void setAdditionalNumberOfGuests(Number additionalNumberOfGuests);
}
