/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Mass;
import org.schema.model.Energy;
import org.schema.model.datatype.Text;

/**
 * Nutritional information about the recipe.
 *
 * @see <a href="https://schema.org/NutritionInformation">https://schema.org/NutritionInformation</a>
 */
public interface NutritionInformation extends StructuredValue {

    /**
     * The number of milligrams of sodium.
     *
     * @return {@link Mass}
     */
    List<Mass> getSodiumContentList();

    /**
     * The number of milligrams of sodium.
     *
     * @return {@link Mass}
     */
    Mass getSodiumContent();

    /**
     * The number of milligrams of sodium.
     *
     * @param sodiumContent Mass value to set.
     */
    void addSodiumContent(Mass sodiumContent);

    /**
     * The number of grams of carbohydrates.
     *
     * @return {@link Mass}
     */
    List<Mass> getCarbohydrateContentList();

    /**
     * The number of grams of carbohydrates.
     *
     * @return {@link Mass}
     */
    Mass getCarbohydrateContent();

    /**
     * The number of grams of carbohydrates.
     *
     * @param carbohydrateContent Mass value to set.
     */
    void addCarbohydrateContent(Mass carbohydrateContent);

    /**
     * The number of grams of fat.
     *
     * @return {@link Mass}
     */
    List<Mass> getFatContentList();

    /**
     * The number of grams of fat.
     *
     * @return {@link Mass}
     */
    Mass getFatContent();

    /**
     * The number of grams of fat.
     *
     * @param fatContent Mass value to set.
     */
    void addFatContent(Mass fatContent);

    /**
     * The number of milligrams of cholesterol.
     *
     * @return {@link Mass}
     */
    List<Mass> getCholesterolContentList();

    /**
     * The number of milligrams of cholesterol.
     *
     * @return {@link Mass}
     */
    Mass getCholesterolContent();

    /**
     * The number of milligrams of cholesterol.
     *
     * @param cholesterolContent Mass value to set.
     */
    void addCholesterolContent(Mass cholesterolContent);

    /**
     * The number of calories.
     *
     * @return {@link Energy}
     */
    List<Energy> getCaloriesList();

    /**
     * The number of calories.
     *
     * @return {@link Energy}
     */
    Energy getCalories();

    /**
     * The number of calories.
     *
     * @param calories Energy value to set.
     */
    void addCalories(Energy calories);

    /**
     * The number of grams of unsaturated fat.
     *
     * @return {@link Mass}
     */
    List<Mass> getUnsaturatedFatContentList();

    /**
     * The number of grams of unsaturated fat.
     *
     * @return {@link Mass}
     */
    Mass getUnsaturatedFatContent();

    /**
     * The number of grams of unsaturated fat.
     *
     * @param unsaturatedFatContent Mass value to set.
     */
    void addUnsaturatedFatContent(Mass unsaturatedFatContent);

    /**
     * The number of grams of sugar.
     *
     * @return {@link Mass}
     */
    List<Mass> getSugarContentList();

    /**
     * The number of grams of sugar.
     *
     * @return {@link Mass}
     */
    Mass getSugarContent();

    /**
     * The number of grams of sugar.
     *
     * @param sugarContent Mass value to set.
     */
    void addSugarContent(Mass sugarContent);

    /**
     * The number of grams of trans fat.
     *
     * @return {@link Mass}
     */
    List<Mass> getTransFatContentList();

    /**
     * The number of grams of trans fat.
     *
     * @return {@link Mass}
     */
    Mass getTransFatContent();

    /**
     * The number of grams of trans fat.
     *
     * @param transFatContent Mass value to set.
     */
    void addTransFatContent(Mass transFatContent);

    /**
     * The number of grams of protein.
     *
     * @return {@link Mass}
     */
    List<Mass> getProteinContentList();

    /**
     * The number of grams of protein.
     *
     * @return {@link Mass}
     */
    Mass getProteinContent();

    /**
     * The number of grams of protein.
     *
     * @param proteinContent Mass value to set.
     */
    void addProteinContent(Mass proteinContent);

    /**
     * The number of grams of saturated fat.
     *
     * @return {@link Mass}
     */
    List<Mass> getSaturatedFatContentList();

    /**
     * The number of grams of saturated fat.
     *
     * @return {@link Mass}
     */
    Mass getSaturatedFatContent();

    /**
     * The number of grams of saturated fat.
     *
     * @param saturatedFatContent Mass value to set.
     */
    void addSaturatedFatContent(Mass saturatedFatContent);

    /**
     * The serving size, in terms of the number of volume or mass.
     *
     * @return {@link Text}
     */
    List<Text> getServingSizeList();

    /**
     * The serving size, in terms of the number of volume or mass.
     *
     * @return {@link Text}
     */
    Text getServingSize();

    /**
     * The serving size, in terms of the number of volume or mass.
     *
     * @param servingSize Text value to set.
     */
    void addServingSize(Text servingSize);

    /**
     * The number of grams of fiber.
     *
     * @return {@link Mass}
     */
    List<Mass> getFiberContentList();

    /**
     * The number of grams of fiber.
     *
     * @return {@link Mass}
     */
    Mass getFiberContent();

    /**
     * The number of grams of fiber.
     *
     * @param fiberContent Mass value to set.
     */
    void addFiberContent(Mass fiberContent);
}
