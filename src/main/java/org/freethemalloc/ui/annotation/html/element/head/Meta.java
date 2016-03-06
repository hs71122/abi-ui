package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

/**
 * Metadata is data (information) about data.
 *The <meta> tag provides metadata about the HTML document. Metadata will not be displayed on the page, but will be machine parsable.<br />
 *Meta elements are typically used to specify page description, keywords, author of the document, last modified, and other metadata.<br />
 *The metadata can be used by browsers (how to display content or reload page), search engines (keywords), or other web services.<br />
 * &lt meta &gt tags always go inside the &lt head &gt element.<br />
 * Metadata is always passed as name/value pairs.<br />
 * The content attribute MUST be defined if the name or the http-equiv attribute is defined. If none of these are defined, the content attribute CANNOT be defined
 */
public @interface Meta {

    GlobalAttribute attribute() default @GlobalAttribute();

    /**
     * Specifies the character encoding for the HTML document
     */
    String charset() default "";

    /**
     * Gives the value associated with the http-equiv or name attribute
     */
    String content() default "";

    /**
     * Provides an HTTP header for the information/value of the content attribute
     */
    String httpEquiv() default "";

    /**
     * Specifies a name for the metadata
     */
    String name() default "";

}
