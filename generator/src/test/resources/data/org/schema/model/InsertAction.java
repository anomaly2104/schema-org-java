/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Place;

/**
 * The act of adding at a specific location in an ordered collection.
 *
 * @see <a href="https://schema.org/InsertAction">https://schema.org/InsertAction</a>
 */
public interface InsertAction extends AddAction {

    /**
     * A sub property of location. The final location of the object or the agent after the action.
     *
     * @return {@link Place}
     */
    Place getToLocation();

    /**
     * A sub property of location. The final location of the object or the agent after the action.
     *
     * @param toLocation Place value to set.
     */
    void setToLocation(Place toLocation);
}
