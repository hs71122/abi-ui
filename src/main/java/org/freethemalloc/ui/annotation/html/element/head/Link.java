package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The &lt link &gt tag defines a link between a document and an external resource.
 * The &lt link &gt tag is used to link to external style sheets.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Link {

    GlobalAttribute attribute() default @GlobalAttribute();

    /**
     * Specifies the character encoding of the linked document
     */
    String charset() default "";

    /**
     * Specifies how the element handles cross-origin requests
     */
    String crossorigin() default "";

    /**
     * Specifies the location of the linked document
     */
    String href() default "";

    /**
     * Specifies the language of the text in the linked document
     */
    String hreflang() default "";

    /**
     * Specifies on what device the linked document will be displayed
     */
    String media() default "";

    /**
     * Required. Specifies the relationship between the current document and the linked document
     */
    String rel() default "";

    /**
     * Specifies the relationship between the linked document and the current document
     */
    String rev() default "";

    /**
     * Specifies the size of the linked resource. Only for rel="icon"
     */
    String sizes() default "";

    /**
     * Specifies where the linked document is to be loaded
     */
    String target() default "";

    /**
     * 	Specifies the media type of the linked document
     */
    String type() default "";
}
