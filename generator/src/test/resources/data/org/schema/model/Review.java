/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.Review;
import org.schema.model.WebContent;
import org.schema.model.ListItem;
import org.schema.model.ItemList;
import org.schema.model.Rating;
import org.schema.model.Thing;

/**
 * A review of an item - for example, of a restaurant, movie, or store.
 *
 * @see <a href="https://schema.org/Review">https://schema.org/Review</a>
 */
public interface Review extends CreativeWork {

    /**
     * The actual body of the review.
     *
     * @return {@link Text}
     */
    List<Text> getReviewBodyList();

    /**
     * The actual body of the review.
     *
     * @return {@link Text}
     */
    Text getReviewBody();

    /**
     * The actual body of the review.
     *
     * @param reviewBody Text value to set.
     */
    void addReviewBody(Text reviewBody);

    /**
     * An associated [[MediaReview]], related by specific common content, topic or claim. The expectation is that this property would be most typically used in cases where a single activity is conducting both claim reviews and media reviews, in which case [[relatedMediaReview]] would commonly be used on a [[ClaimReview]], while [[relatedClaimReview]] would be used on [[MediaReview]].
     *
     * @return {@link Review}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    List<Review> getAssociatedMediaReviewList();

    /**
     * An associated [[MediaReview]], related by specific common content, topic or claim. The expectation is that this property would be most typically used in cases where a single activity is conducting both claim reviews and media reviews, in which case [[relatedMediaReview]] would commonly be used on a [[ClaimReview]], while [[relatedClaimReview]] would be used on [[MediaReview]].
     *
     * @return {@link Review}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    Review getAssociatedMediaReview();

    /**
     * An associated [[MediaReview]], related by specific common content, topic or claim. The expectation is that this property would be most typically used in cases where a single activity is conducting both claim reviews and media reviews, in which case [[relatedMediaReview]] would commonly be used on a [[ClaimReview]], while [[relatedClaimReview]] would be used on [[MediaReview]].
     *
     * @param associatedMediaReview Review value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addAssociatedMediaReview(Review associatedMediaReview);

    /**
     * An associated [[Review]].
     *
     * @return {@link Review}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    List<Review> getAssociatedReviewList();

    /**
     * An associated [[Review]].
     *
     * @return {@link Review}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    Review getAssociatedReview();

    /**
     * An associated [[Review]].
     *
     * @param associatedReview Review value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addAssociatedReview(Review associatedReview);

    /**
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     *
     * @return {@link Text} or {@link WebContent} or {@link ListItem} or {@link ItemList}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    <T> List<T> getPositiveNotesList();

    /**
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     *
     * @return {@link Text} or {@link WebContent} or {@link ListItem} or {@link ItemList}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    <T> T getPositiveNotes();

    /**
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     *
     * @param positiveNotes Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addPositiveNotes(Text positiveNotes);
    /**
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     *
     * @param positiveNotes WebContent value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addPositiveNotes(WebContent positiveNotes);
    /**
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     *
     * @param positiveNotes ListItem value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addPositiveNotes(ListItem positiveNotes);
    /**
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     *
     * @param positiveNotes ItemList value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addPositiveNotes(ItemList positiveNotes);

    /**
     * The rating given in this review. Note that reviews can themselves be rated. The ```reviewRating``` applies to rating given by the review. The [[aggregateRating]] property applies to the review itself, as a creative work.
     *
     * @return {@link Rating}
     */
    List<Rating> getReviewRatingList();

    /**
     * The rating given in this review. Note that reviews can themselves be rated. The ```reviewRating``` applies to rating given by the review. The [[aggregateRating]] property applies to the review itself, as a creative work.
     *
     * @return {@link Rating}
     */
    Rating getReviewRating();

    /**
     * The rating given in this review. Note that reviews can themselves be rated. The ```reviewRating``` applies to rating given by the review. The [[aggregateRating]] property applies to the review itself, as a creative work.
     *
     * @param reviewRating Rating value to set.
     */
    void addReviewRating(Rating reviewRating);

    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1689">https://github.com/schemaorg/schemaorg/issues/1689</a>
     */
    List<Text> getReviewAspectList();

    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1689">https://github.com/schemaorg/schemaorg/issues/1689</a>
     */
    Text getReviewAspect();

    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     *
     * @param reviewAspect Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1689">https://github.com/schemaorg/schemaorg/issues/1689</a>
     */
    void addReviewAspect(Text reviewAspect);

    /**
     * The item that is being reviewed/rated.
     *
     * @return {@link Thing}
     */
    List<Thing> getItemReviewedList();

    /**
     * The item that is being reviewed/rated.
     *
     * @return {@link Thing}
     */
    Thing getItemReviewed();

    /**
     * The item that is being reviewed/rated.
     *
     * @param itemReviewed Thing value to set.
     */
    void addItemReviewed(Thing itemReviewed);

    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry 
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions 
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     *
     * @return {@link ListItem} or {@link Text} or {@link ItemList} or {@link WebContent}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    <T> List<T> getNegativeNotesList();

    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry 
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions 
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     *
     * @return {@link ListItem} or {@link Text} or {@link ItemList} or {@link WebContent}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    <T> T getNegativeNotes();

    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry 
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions 
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     *
     * @param negativeNotes ListItem value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addNegativeNotes(ListItem negativeNotes);
    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry 
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions 
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     *
     * @param negativeNotes Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addNegativeNotes(Text negativeNotes);
    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry 
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions 
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     *
     * @param negativeNotes ItemList value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addNegativeNotes(ItemList negativeNotes);
    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry 
     * 
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions 
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * 
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     *
     * @param negativeNotes WebContent value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2832">https://github.com/schemaorg/schemaorg/issues/2832</a>
     */
    void addNegativeNotes(WebContent negativeNotes);

    /**
     * An associated [[ClaimReview]], related by specific common content, topic or claim. The expectation is that this property would be most typically used in cases where a single activity is conducting both claim reviews and media reviews, in which case [[relatedMediaReview]] would commonly be used on a [[ClaimReview]], while [[relatedClaimReview]] would be used on [[MediaReview]].
     *
     * @return {@link Review}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    List<Review> getAssociatedClaimReviewList();

    /**
     * An associated [[ClaimReview]], related by specific common content, topic or claim. The expectation is that this property would be most typically used in cases where a single activity is conducting both claim reviews and media reviews, in which case [[relatedMediaReview]] would commonly be used on a [[ClaimReview]], while [[relatedClaimReview]] would be used on [[MediaReview]].
     *
     * @return {@link Review}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    Review getAssociatedClaimReview();

    /**
     * An associated [[ClaimReview]], related by specific common content, topic or claim. The expectation is that this property would be most typically used in cases where a single activity is conducting both claim reviews and media reviews, in which case [[relatedMediaReview]] would commonly be used on a [[ClaimReview]], while [[relatedClaimReview]] would be used on [[MediaReview]].
     *
     * @param associatedClaimReview Review value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addAssociatedClaimReview(Review associatedClaimReview);
}
