/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.Text;
import org.schema.model.CategoryCode;
import org.schema.model.MonetaryAmountDistribution;

/**
 * A program with both an educational and employment component. Typically based at a workplace and structured around work-based learning, with the aim of instilling competencies related to an occupation. WorkBasedProgram is used to distinguish programs such as apprenticeships from school, college or other classroom based educational programs.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
 * @see <a href="https://schema.org/WorkBasedProgram">https://schema.org/WorkBasedProgram</a>
 */
public interface WorkBasedProgram extends EducationalOccupationalProgram {

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @return {@link Text} or {@link CategoryCode}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     */
    <T> List<T> getOccupationalCategoryList();

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @return {@link Text} or {@link CategoryCode}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     */
    <T> T getOccupationalCategory();

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @param occupationalCategory Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     */
    void addOccupationalCategory(Text occupationalCategory);
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @param occupationalCategory CategoryCode value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     */
    void addOccupationalCategory(CategoryCode occupationalCategory);

    /**
     * The estimated salary earned while in the program.
     *
     * @return {@link MonetaryAmountDistribution}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    List<MonetaryAmountDistribution> getTrainingSalaryList();

    /**
     * The estimated salary earned while in the program.
     *
     * @return {@link MonetaryAmountDistribution}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    MonetaryAmountDistribution getTrainingSalary();

    /**
     * The estimated salary earned while in the program.
     *
     * @param trainingSalary MonetaryAmountDistribution value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    void addTrainingSalary(MonetaryAmountDistribution trainingSalary);
}
