/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.MedicalTest;
import org.schema.model.MedicalProcedure;
import org.schema.model.MedicalTherapy;
import org.schema.model.Dataset;
import org.schema.model.CDCPMDRecord;
import org.schema.model.MedicalSpecialty;

/**
 * A hospital.
 *
 * @see <a href="https://schema.org/Hospital">https://schema.org/Hospital</a>
 */
public interface Hospital extends MedicalOrganization, EmergencyService, CivicStructure {

    /**
     * A medical service available from this provider.
     *
     * @return {@link MedicalTest} or {@link MedicalProcedure} or {@link MedicalTherapy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> List<T> getAvailableServiceList();

    /**
     * A medical service available from this provider.
     *
     * @return {@link MedicalTest} or {@link MedicalProcedure} or {@link MedicalTherapy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> T getAvailableService();

    /**
     * A medical service available from this provider.
     *
     * @param availableService MedicalTest value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addAvailableService(MedicalTest availableService);
    /**
     * A medical service available from this provider.
     *
     * @param availableService MedicalProcedure value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addAvailableService(MedicalProcedure availableService);
    /**
     * A medical service available from this provider.
     *
     * @param availableService MedicalTherapy value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addAvailableService(MedicalTherapy availableService);

    /**
     * Indicates data describing a hospital, e.g. a CDC [[CDCPMDRecord]] or as some kind of [[Dataset]].
     *
     * @return {@link Dataset} or {@link CDCPMDRecord}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    <T> List<T> getHealthcareReportingDataList();

    /**
     * Indicates data describing a hospital, e.g. a CDC [[CDCPMDRecord]] or as some kind of [[Dataset]].
     *
     * @return {@link Dataset} or {@link CDCPMDRecord}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    <T> T getHealthcareReportingData();

    /**
     * Indicates data describing a hospital, e.g. a CDC [[CDCPMDRecord]] or as some kind of [[Dataset]].
     *
     * @param healthcareReportingData Dataset value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void addHealthcareReportingData(Dataset healthcareReportingData);
    /**
     * Indicates data describing a hospital, e.g. a CDC [[CDCPMDRecord]] or as some kind of [[Dataset]].
     *
     * @param healthcareReportingData CDCPMDRecord value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void addHealthcareReportingData(CDCPMDRecord healthcareReportingData);

    /**
     * A medical specialty of the provider.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<MedicalSpecialty> getMedicalSpecialtyList();

    /**
     * A medical specialty of the provider.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalSpecialty getMedicalSpecialty();

    /**
     * A medical specialty of the provider.
     *
     * @param medicalSpecialty MedicalSpecialty value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addMedicalSpecialty(MedicalSpecialty medicalSpecialty);
}
