/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalTest;
import org.schema.model.PhysicalExam;

/**
 * Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalSign">https://schema.org/MedicalSign</a>
 */
public interface MedicalSign extends MedicalSignOrSymptom {

    /**
     * A diagnostic test that can identify this sign.
     *
     * @return {@link MedicalTest}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalTest getIdentifyingTest();

    /**
     * A diagnostic test that can identify this sign.
     *
     * @param identifyingTest MedicalTest value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setIdentifyingTest(MedicalTest identifyingTest);

    /**
     * A physical examination that can identify this sign.
     *
     * @return {@link PhysicalExam}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    PhysicalExam getIdentifyingExam();

    /**
     * A physical examination that can identify this sign.
     *
     * @param identifyingExam PhysicalExam value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setIdentifyingExam(PhysicalExam identifyingExam);
}
