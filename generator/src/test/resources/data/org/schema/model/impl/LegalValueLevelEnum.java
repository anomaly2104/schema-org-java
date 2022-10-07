/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Enumeration;
import org.schema.model.Class;
import org.schema.model.Property;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.LegalValueLevel;

/**
 * A list of possible levels for the legal validity of a legislation.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="http://publications.europa.eu/mdr/eli/index.html">http://publications.europa.eu/mdr/eli/index.html</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1156">https://github.com/schemaorg/schemaorg/issues/1156</a>
 * @see <a href="https://schema.org/LegalValueLevel">https://schema.org/LegalValueLevel</a>
 */
@JsonLdTypeName("schema:LegalValueLevel")
public enum LegalValueLevelEnum implements LegalValueLevel {
    DEFINITIVE_LEGAL_VALUE("DefinitiveLegalValue"),
    UNOFFICIAL_LEGAL_VALUE("UnofficialLegalValue"),
    OFFICIAL_LEGAL_VALUE("OfficialLegalValue"),
    AUTHORITATIVE_LEGAL_VALUE("AuthoritativeLegalValue");

    private final String enumValue;

    LegalValueLevelEnum(String enumValue) {
        this.enumValue = enumValue;
    }

    @Override
    public String toString() {
        return enumValue;
    }

    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    @Override
    public void setSupersededBy(Object fSupersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public Text getAlternateName() {
        return null;
    }

    @Override
    public void setAlternateName(Text fAlternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public Text getName() {
        return null;
    }

    @Override
    public void setName(Text fName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public Action getPotentialAction() {
        return null;
    }

    @Override
    public void setPotentialAction(Action fPotentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public <T> T getImage() {
        return null;
    }

    @Override
    public void setImage(Object fImage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public URL getUrl() {
        return null;
    }

    @Override
    public void setUrl(URL fUrl) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public Text getDescription() {
        return null;
    }

    @Override
    public void setDescription(Text fDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    @Override
    public void setSubjectOf(Object fSubjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public URL getAdditionalType() {
        return null;
    }

    @Override
    public void setAdditionalType(URL fAdditionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public URL getSameAs() {
        return null;
    }

    @Override
    public void setSameAs(URL fSameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum LegalValueLevelEnum");
    }
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    @Override
    public void setIdentifier(Object fIdentifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum LegalValueLevelEnum");
    }
}
