/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.URL;
import org.schema.model.Taxon;
import org.schema.model.datatype.Text;
import org.schema.model.PropertyValue;
import org.schema.model.DefinedTerm;

/**
 * A set of organisms asserted to represent a natural cohesive biological unit.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://schema.org/Taxon">https://schema.org/Taxon</a>
 */
public interface Taxon extends Thing {

    /**
     * Closest parent taxon of the taxon in question.
     *
     * @return {@link URL} or {@link Taxon} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> List<T> getParentTaxonList();

    /**
     * Closest parent taxon of the taxon in question.
     *
     * @return {@link URL} or {@link Taxon} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> T getParentTaxon();

    /**
     * Closest parent taxon of the taxon in question.
     *
     * @param parentTaxon URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addParentTaxon(URL parentTaxon);
    /**
     * Closest parent taxon of the taxon in question.
     *
     * @param parentTaxon Taxon value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addParentTaxon(Taxon parentTaxon);
    /**
     * Closest parent taxon of the taxon in question.
     *
     * @param parentTaxon Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addParentTaxon(Text parentTaxon);

    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary – (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> List<T> getTaxonRankList();

    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary – (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> T getTaxonRank();

    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary – (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     *
     * @param taxonRank PropertyValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addTaxonRank(PropertyValue taxonRank);
    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary – (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     *
     * @param taxonRank URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addTaxonRank(URL taxonRank);
    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary – (typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs).
     *
     * @param taxonRank Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addTaxonRank(Text taxonRank);

    /**
     * Closest child taxa of the taxon in question.
     *
     * @return {@link Text} or {@link Taxon} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> List<T> getChildTaxonList();

    /**
     * Closest child taxa of the taxon in question.
     *
     * @return {@link Text} or {@link Taxon} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> T getChildTaxon();

    /**
     * Closest child taxa of the taxon in question.
     *
     * @param childTaxon Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addChildTaxon(Text childTaxon);
    /**
     * Closest child taxa of the taxon in question.
     *
     * @param childTaxon Taxon value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addChildTaxon(Taxon childTaxon);
    /**
     * Closest child taxa of the taxon in question.
     *
     * @param childTaxon URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addChildTaxon(URL childTaxon);

    /**
     * A Defined Term contained in this term set.
     *
     * @return {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    List<DefinedTerm> getHasDefinedTermList();

    /**
     * A Defined Term contained in this term set.
     *
     * @return {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    DefinedTerm getHasDefinedTerm();

    /**
     * A Defined Term contained in this term set.
     *
     * @param hasDefinedTerm DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    void addHasDefinedTerm(DefinedTerm hasDefinedTerm);
}
