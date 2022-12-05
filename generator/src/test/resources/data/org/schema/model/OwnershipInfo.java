/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.DateTime;
import org.schema.model.Product;
import org.schema.model.Service;
import org.schema.model.Organization;
import org.schema.model.Person;

/**
 * A structured value providing information about when a certain organization or person owned a certain product.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/OwnershipInfo">https://schema.org/OwnershipInfo</a>
 */
public interface OwnershipInfo extends StructuredValue {

    /**
     * The date and time of obtaining the product.
     *
     * @return {@link DateTime}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    DateTime getOwnedFrom();

    /**
     * The date and time of obtaining the product.
     *
     * @param ownedFrom DateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setOwnedFrom(DateTime ownedFrom);

    /**
     * The product that this structured value is referring to.
     *
     * @return {@link Product} or {@link Service}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getTypeOfGood();

    /**
     * The product that this structured value is referring to.
     *
     * @param typeOfGood Product value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setTypeOfGood(Product typeOfGood);
    /**
     * The product that this structured value is referring to.
     *
     * @param typeOfGood Service value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setTypeOfGood(Service typeOfGood);

    /**
     * The organization or person from which the product was acquired.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getAcquiredFrom();

    /**
     * The organization or person from which the product was acquired.
     *
     * @param acquiredFrom Organization value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setAcquiredFrom(Organization acquiredFrom);
    /**
     * The organization or person from which the product was acquired.
     *
     * @param acquiredFrom Person value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setAcquiredFrom(Person acquiredFrom);

    /**
     * The date and time of giving up ownership on the product.
     *
     * @return {@link DateTime}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    DateTime getOwnedThrough();

    /**
     * The date and time of giving up ownership on the product.
     *
     * @param ownedThrough DateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setOwnedThrough(DateTime ownedThrough);
}
