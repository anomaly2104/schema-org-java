/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.datatype;

import com.weedow.schemaorg.commons.model.JsonLdTypeName;

/**
 * Text representing a CSS selector.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1672">https://github.com/schemaorg/schemaorg/issues/1672</a>
 * @see <a href="https://schema.org/CssSelectorType">https://schema.org/CssSelectorType</a>
 */
@JsonLdTypeName("schema:CssSelectorType")
public class CssSelectorType extends Text {

    CssSelectorType(java.lang.String value) {
        super(value);
    }

    public static CssSelectorType of(java.lang.String value) {
        return new CssSelectorType(value);
    }

}
