/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.BoatTerminal;

/**
 * A trip on a commercial ferry line.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
 * @see <a href="https://schema.org/BoatTrip">https://schema.org/BoatTrip</a>
 */
public interface BoatTrip extends Trip {

    /**
     * The terminal or port from which the boat departs.
     *
     * @return {@link BoatTerminal}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
     */
    List<BoatTerminal> getDepartureBoatTerminalList();

    /**
     * The terminal or port from which the boat departs.
     *
     * @return {@link BoatTerminal}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
     */
    BoatTerminal getDepartureBoatTerminal();

    /**
     * The terminal or port from which the boat departs.
     *
     * @param departureBoatTerminal BoatTerminal value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
     */
    void addDepartureBoatTerminal(BoatTerminal departureBoatTerminal);

    /**
     * The terminal or port from which the boat arrives.
     *
     * @return {@link BoatTerminal}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
     */
    List<BoatTerminal> getArrivalBoatTerminalList();

    /**
     * The terminal or port from which the boat arrives.
     *
     * @return {@link BoatTerminal}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
     */
    BoatTerminal getArrivalBoatTerminal();

    /**
     * The terminal or port from which the boat arrives.
     *
     * @param arrivalBoatTerminal BoatTerminal value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
     */
    void addArrivalBoatTerminal(BoatTerminal arrivalBoatTerminal);
}
