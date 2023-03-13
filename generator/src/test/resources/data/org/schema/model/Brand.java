/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.Review;
import org.schema.model.ImageObject;
import org.schema.model.datatype.URL;
import org.schema.model.AggregateRating;

/**
 * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/Brand">https://schema.org/Brand</a>
 */
public interface Brand extends Intangible {

    /**
     * A slogan or motto associated with the item.
     *
     * @return {@link Text}
     */
    List<Text> getSloganList();

    /**
     * A slogan or motto associated with the item.
     *
     * @return {@link Text}
     */
    Text getSlogan();

    /**
     * A slogan or motto associated with the item.
     *
     * @param slogan Text value to set.
     */
    void addSlogan(Text slogan);

    /**
     * A review of the item.
     *
     * @return {@link Review}
     */
    List<Review> getReviewList();

    /**
     * A review of the item.
     *
     * @return {@link Review}
     */
    Review getReview();

    /**
     * A review of the item.
     *
     * @param review Review value to set.
     */
    void addReview(Review review);

    /**
     * An associated logo.
     *
     * @return {@link ImageObject} or {@link URL}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> List<T> getLogoList();

    /**
     * An associated logo.
     *
     * @return {@link ImageObject} or {@link URL}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getLogo();

    /**
     * An associated logo.
     *
     * @param logo ImageObject value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addLogo(ImageObject logo);
    /**
     * An associated logo.
     *
     * @param logo URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addLogo(URL logo);

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @return {@link AggregateRating}
     */
    List<AggregateRating> getAggregateRatingList();

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @return {@link AggregateRating}
     */
    AggregateRating getAggregateRating();

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @param aggregateRating AggregateRating value to set.
     */
    void addAggregateRating(AggregateRating aggregateRating);
}
