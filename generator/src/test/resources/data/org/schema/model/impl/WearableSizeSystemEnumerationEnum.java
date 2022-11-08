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
import org.schema.model.SizeSystemEnumeration;
import org.schema.model.WearableSizeSystemEnumeration;

/**
 * Enumerates common size systems specific for wearable products
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
 * @see <a href="https://schema.org/WearableSizeSystemEnumeration">https://schema.org/WearableSizeSystemEnumeration</a>
 */
@JsonLdTypeName("schema:WearableSizeSystemEnumeration")
public enum WearableSizeSystemEnumerationEnum implements WearableSizeSystemEnumeration {
    WEARABLE_SIZE_SYSTEM_JP("WearableSizeSystemJP"),
    WEARABLE_SIZE_SYSTEM_CN("WearableSizeSystemCN"),
    WEARABLE_SIZE_SYSTEM_DE("WearableSizeSystemDE"),
    WEARABLE_SIZE_SYSTEM_AU("WearableSizeSystemAU"),
    WEARABLE_SIZE_SYSTEM_BR("WearableSizeSystemBR"),
    WEARABLE_SIZE_SYSTEM_EUROPE("WearableSizeSystemEurope"),
    WEARABLE_SIZE_SYSTEM_GS1("WearableSizeSystemGS1"),
    WEARABLE_SIZE_SYSTEM_MX("WearableSizeSystemMX"),
    WEARABLE_SIZE_SYSTEM_EN13402("WearableSizeSystemEN13402"),
    WEARABLE_SIZE_SYSTEM_UK("WearableSizeSystemUK"),
    WEARABLE_SIZE_SYSTEM_US("WearableSizeSystemUS"),
    WEARABLE_SIZE_SYSTEM_IT("WearableSizeSystemIT"),
    WEARABLE_SIZE_SYSTEM_FR("WearableSizeSystemFR"),
    WEARABLE_SIZE_SYSTEM_CONTINENTAL("WearableSizeSystemContinental");

    private final String enumValue;

    WearableSizeSystemEnumerationEnum(String enumValue) {
        this.enumValue = enumValue;
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
        throw new java.lang.IllegalAccessError("Method 'setContext' not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setId(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setId' not allowed for enum WearableSizeSystemEnumerationEnum");
    }


    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Object fSupersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getAlternateName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAlternateName(Text fAlternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setName(Text fName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Action getPotentialAction() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getImage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(Object fImage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getUrl() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setUrl(URL fUrl) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDescription(Text fDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getAdditionalType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getSameAs() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSameAs(URL fSameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(Object fIdentifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum WearableSizeSystemEnumerationEnum");
    }

}
