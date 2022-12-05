/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.datatype;

import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.datatype.Text;
import org.schema.model.Language;

/**
 * Data type: PronounceableText.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
 * @see <a href="https://schema.org/PronounceableText">https://schema.org/PronounceableText</a>
 */
@JsonLdTypeName("PronounceableText")
public class PronounceableText extends Text {

    PronounceableText(java.lang.String value) {
        super(value);
    }

    public static PronounceableText of(java.lang.String value) {
        return new PronounceableText(value);
    }


    private Text phoneticText;

    /**
     * Representation of a text [[textValue]] using the specified [[speechToTextMarkup]]. For example the city name of Houston in IPA: /ˈhjuːstən/.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
     */
    public Text getPhoneticText() {
        return phoneticText;
    }

    /**
     * Representation of a text [[textValue]] using the specified [[speechToTextMarkup]]. For example the city name of Houston in IPA: /ˈhjuːstən/.
     *
     * @param phoneticText Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
     */
    public void setPhoneticText(Text phoneticText) {
        this.phoneticText = phoneticText;
    }

    private Text speechToTextMarkup;

    /**
     * Form of markup used. eg. [SSML](https://www.w3.org/TR/speech-synthesis11) or [IPA](https://www.wikidata.org/wiki/Property:P898).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
     */
    public Text getSpeechToTextMarkup() {
        return speechToTextMarkup;
    }

    /**
     * Form of markup used. eg. [SSML](https://www.w3.org/TR/speech-synthesis11) or [IPA](https://www.wikidata.org/wiki/Property:P898).
     *
     * @param speechToTextMarkup Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
     */
    public void setSpeechToTextMarkup(Text speechToTextMarkup) {
        this.speechToTextMarkup = speechToTextMarkup;
    }

    private Text textValue;

    /**
     * Text value being annotated.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
     */
    public Text getTextValue() {
        return textValue;
    }

    /**
     * Text value being annotated.
     *
     * @param textValue Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2108">https://github.com/schemaorg/schemaorg/issues/2108</a>
     */
    public void setTextValue(Text textValue) {
        this.textValue = textValue;
    }

    private Object inLanguage;

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     *
     * @return {@link Text} or {@link Language}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2382">https://github.com/schemaorg/schemaorg/issues/2382</a>
     */
    public <T> T getInLanguage() {
        return (T) inLanguage;
    }

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     *
     * @param inLanguage Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2382">https://github.com/schemaorg/schemaorg/issues/2382</a>
     */
    public void setInLanguage(Text inLanguage) {
        this.inLanguage = inLanguage;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     *
     * @param inLanguage Language value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2382">https://github.com/schemaorg/schemaorg/issues/2382</a>
     */
    public void setInLanguage(Language inLanguage) {
        this.inLanguage = inLanguage;
    }
}
