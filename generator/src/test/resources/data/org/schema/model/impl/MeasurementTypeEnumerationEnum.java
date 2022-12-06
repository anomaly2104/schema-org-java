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
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.MeasurementTypeEnumeration;
import com.weedow.schemaorg.commons.model.JsonLdSubTypes;

/**
 * Enumeration of common measurement types (or dimensions), for example "chest" for a person, "inseam" for pants, "gauge" for screws, or "wheel" for bicycles.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
 * @see <a href="https://schema.org/MeasurementTypeEnumeration">https://schema.org/MeasurementTypeEnumeration</a>
 */
@JsonLdTypeName("MeasurementTypeEnumeration")
@JsonLdSubTypes({ "BodyMeasurementTypeEnumerationEnum", "WearableMeasurementTypeEnumerationEnum" })
public enum MeasurementTypeEnumerationEnum implements MeasurementTypeEnumeration {
    ;

    private final String enumValue;

    MeasurementTypeEnumerationEnum(String enumValue) {
        this.enumValue = enumValue;
    }

    public static MeasurementTypeEnumerationEnum from(String value) {
        for (MeasurementTypeEnumerationEnum item : values()) {
            if (item.enumValue.equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return enumValue;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getContext() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getId() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setContext(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setContext' not allowed for enum MeasurementTypeEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setId(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setId' not allowed for enum MeasurementTypeEnumerationEnum");
    }


    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Enumeration supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Class supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Property supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(CreativeWork mainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(URL mainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getAlternateName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAlternateName(Text alternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setName(Text name) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Action getPotentialAction() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setPotentialAction(Action potentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getImage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(URL image) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(ImageObject image) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getUrl() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setUrl(URL url) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDescription(Text description) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(Event subjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(CreativeWork subjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getAdditionalType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAdditionalType(URL additionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDisambiguatingDescription(Text disambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getSameAs() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSameAs(URL sameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(URL identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(Text identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(PropertyValue identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum Enum");
    }
}
