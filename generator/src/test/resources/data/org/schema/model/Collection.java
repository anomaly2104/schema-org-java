/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Integer;

/**
 * A collection of items, e.g. creative works or products.
 *
 * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
 * @see <a href="https://schema.org/Collection">https://schema.org/Collection</a>
 */
public interface Collection extends CreativeWork {

    /**
     * The number of items in the [[Collection]].
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1759">https://github.com/schemaorg/schemaorg/issues/1759</a>
     */
    List<Integer> getCollectionSizeList();

    /**
     * The number of items in the [[Collection]].
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1759">https://github.com/schemaorg/schemaorg/issues/1759</a>
     */
    Integer getCollectionSize();

    /**
     * The number of items in the [[Collection]].
     *
     * @param collectionSize Integer value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1759">https://github.com/schemaorg/schemaorg/issues/1759</a>
     */
    void addCollectionSize(Integer collectionSize);
}
