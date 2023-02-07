/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.InfectiousAgentClass;
import org.schema.model.datatype.Text;

/**
 * An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/InfectiousDisease">https://schema.org/InfectiousDisease</a>
 */
public interface InfectiousDisease extends MedicalCondition {

    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     *
     * @return {@link InfectiousAgentClass}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<InfectiousAgentClass> getInfectiousAgentClassList();

    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     *
     * @return {@link InfectiousAgentClass}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    InfectiousAgentClass getInfectiousAgentClass();

    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     *
     * @param infectiousAgentClass InfectiousAgentClass value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addInfectiousAgentClass(InfectiousAgentClass infectiousAgentClass);

    /**
     * The actual infectious agent, such as a specific bacterium.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getInfectiousAgentList();

    /**
     * The actual infectious agent, such as a specific bacterium.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getInfectiousAgent();

    /**
     * The actual infectious agent, such as a specific bacterium.
     *
     * @param infectiousAgent Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addInfectiousAgent(Text infectiousAgent);

    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    List<Text> getTransmissionMethodList();

    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getTransmissionMethod();

    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     *
     * @param transmissionMethod Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void addTransmissionMethod(Text transmissionMethod);
}
