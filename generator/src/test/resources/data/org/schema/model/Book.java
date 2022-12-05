/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.Person;
import org.schema.model.datatype.Integer;
import org.schema.model.datatype.Boolean;
import org.schema.model.BookFormatType;

/**
 * A book.
 *
 * @see <a href="https://schema.org/Book">https://schema.org/Book</a>
 */
public interface Book extends CreativeWork {

    /**
     * The ISBN of the book.
     *
     * @return {@link Text}
     */
    Text getIsbn();

    /**
     * The ISBN of the book.
     *
     * @param isbn Text value to set.
     */
    void setIsbn(Text isbn);

    /**
     * The illustrator of the book.
     *
     * @return {@link Person}
     */
    Person getIllustrator();

    /**
     * The illustrator of the book.
     *
     * @param illustrator Person value to set.
     */
    void setIllustrator(Person illustrator);

    /**
     * The number of pages in the book.
     *
     * @return {@link Integer}
     */
    Integer getNumberOfPages();

    /**
     * The number of pages in the book.
     *
     * @param numberOfPages Integer value to set.
     */
    void setNumberOfPages(Integer numberOfPages);

    /**
     * Indicates whether the book is an abridged edition.
     *
     * @return {@link Boolean}
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    Boolean getAbridged();

    /**
     * Indicates whether the book is an abridged edition.
     *
     * @param abridged Boolean value to set.
     * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
     */
    void setAbridged(Boolean abridged);

    /**
     * The format of the book.
     *
     * @return {@link BookFormatType}
     */
    BookFormatType getBookFormat();

    /**
     * The format of the book.
     *
     * @param bookFormat BookFormatType value to set.
     */
    void setBookFormat(BookFormatType bookFormat);

    /**
     * The edition of the book.
     *
     * @return {@link Text}
     */
    Text getBookEdition();

    /**
     * The edition of the book.
     *
     * @param bookEdition Text value to set.
     */
    void setBookEdition(Text bookEdition);
}
