/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.DefinedTerm;
import org.schema.model.Product;

/**
 * A ProductGroup represents a group of [[Product]]s that vary only in certain well-described ways, such as by [[size]], [[color]], [[material]] etc.
 * 
 * While a ProductGroup itself is not directly offered for sale, the various varying products that it represents can be. The ProductGroup serves as a prototype or template, standing in for all of the products who have an [[isVariantOf]] relationship to it. As such, properties (including additional types) can be applied to the ProductGroup to represent characteristics shared by each of the (possibly very many) variants. Properties that reference a ProductGroup are not included in this mechanism; neither are the following specific properties [[variesBy]], [[hasVariant]], [[url]]. 
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2597">https://github.com/schemaorg/schemaorg/issues/2597</a>
 * @see <a href="https://schema.org/ProductGroup">https://schema.org/ProductGroup</a>
 */
public interface ProductGroup extends Product {

    /**
     * Indicates the property or properties by which the variants in a [[ProductGroup]] vary, e.g. their size, color etc. Schema.org properties can be referenced by their short name e.g. "color"; terms defined elsewhere can be referenced with their URIs.
     *
     * @return {@link Text} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    <T> List<T> getVariesByList();

    /**
     * Indicates the property or properties by which the variants in a [[ProductGroup]] vary, e.g. their size, color etc. Schema.org properties can be referenced by their short name e.g. "color"; terms defined elsewhere can be referenced with their URIs.
     *
     * @return {@link Text} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    <T> T getVariesBy();

    /**
     * Indicates the property or properties by which the variants in a [[ProductGroup]] vary, e.g. their size, color etc. Schema.org properties can be referenced by their short name e.g. "color"; terms defined elsewhere can be referenced with their URIs.
     *
     * @param variesBy Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    void addVariesBy(Text variesBy);
    /**
     * Indicates the property or properties by which the variants in a [[ProductGroup]] vary, e.g. their size, color etc. Schema.org properties can be referenced by their short name e.g. "color"; terms defined elsewhere can be referenced with their URIs.
     *
     * @param variesBy DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    void addVariesBy(DefinedTerm variesBy);

    /**
     * Indicates a [[Product]] that is a member of this [[ProductGroup]] (or [[ProductModel]]).
     *
     * @return {@link Product}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    List<Product> getHasVariantList();

    /**
     * Indicates a [[Product]] that is a member of this [[ProductGroup]] (or [[ProductModel]]).
     *
     * @return {@link Product}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    Product getHasVariant();

    /**
     * Indicates a [[Product]] that is a member of this [[ProductGroup]] (or [[ProductModel]]).
     *
     * @param hasVariant Product value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    void addHasVariant(Product hasVariant);

    /**
     * Indicates a textual identifier for a ProductGroup.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    List<Text> getProductGroupIDList();

    /**
     * Indicates a textual identifier for a ProductGroup.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    Text getProductGroupID();

    /**
     * Indicates a textual identifier for a ProductGroup.
     *
     * @param productGroupID Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1797">https://github.com/schemaorg/schemaorg/issues/1797</a>
     */
    void addProductGroupID(Text productGroupID);
}
