/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;

/**
 * Represents additional information about a relationship or property. For example a Role can be used to say that a 'member' role linking some SportsTeam to a player occurred during a particular time period. Or that a Person's 'actor' role in a Movie was for some particular characterName. Such properties can be attached to a Role entity, which is then associated with the main entities using ordinary properties like 'member' or 'actor'.<br/><br/>See also [blog post](http://blog.schema.org/2014/06/introducing-role.html).
 *
 * @see <a href="https://schema.org/Role">https://schema.org/Role</a>
 */
public interface Role extends Intangible {

    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @return {@link Text} or {@link URL}
     */
    <T> List<T> getRoleNameList();

    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @return {@link Text} or {@link URL}
     */
    <T> T getRoleName();

    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @param roleName Text value to set.
     */
    void addRoleName(Text roleName);
    /**
     * A role played, performed or filled by a person or organization. For example, the team of creators for a comic book might fill the roles named 'inker', 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @param roleName URL value to set.
     */
    void addRoleName(URL roleName);

    /**
     * A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @return {@link Text} or {@link URL}
     */
    <T> List<T> getNamedPositionList();

    /**
     * A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @return {@link Text} or {@link URL}
     */
    <T> T getNamedPosition();

    /**
     * A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @param namedPosition Text value to set.
     */
    void addNamedPosition(Text namedPosition);
    /**
     * A position played, performed or filled by a person or organization, as part of an organization. For example, an athlete in a SportsTeam might play in the position named 'Quarterback'.
     *
     * @param namedPosition URL value to set.
     */
    void addNamedPosition(URL namedPosition);

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> List<T> getStartDateList();

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> T getStartDate();

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param startDate DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void addStartDate(DateTime startDate);
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param startDate Date value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void addStartDate(Date startDate);

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> List<T> getEndDateList();

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> T getEndDate();

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param endDate DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void addEndDate(DateTime endDate);
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param endDate Date value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void addEndDate(Date endDate);
}
