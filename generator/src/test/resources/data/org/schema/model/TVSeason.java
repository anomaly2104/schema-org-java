/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Country;
import org.schema.model.TVSeries;

/**
 * Season dedicated to TV broadcast and associated online delivery.
 *
 * @see <a href="https://schema.org/TVSeason">https://schema.org/TVSeason</a>
 */
public interface TVSeason extends CreativeWorkSeason, CreativeWork {

    /**
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *
     * @return {@link Country}
     */
    Country getCountryOfOrigin();

    /**
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *
     * @param countryOfOrigin Country value to set.
     */
    void setCountryOfOrigin(Country countryOfOrigin);

    /**
     * The TV series to which this episode or season belongs.
     *
     * @return {@link TVSeries}
     */
    TVSeries getPartOfTVSeries();

    /**
     * The TV series to which this episode or season belongs.
     *
     * @param partOfTVSeries TVSeries value to set.
     */
    void setPartOfTVSeries(TVSeries partOfTVSeries);
}
