package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

/**
 * The &lt script &gt tag is used to define a client-side script (JavaScript).
 * The &lt script &gt element either contains scripting statements, or it points to an external script file through the src attribute.
 * Common uses for JavaScript are image manipulation, form validation, and dynamic changes of content.
 */
public @interface Script {

    GlobalAttribute attribute() default @GlobalAttribute();

    /**
     * Specifies that the script is executed asynchronously (only for external scripts)
     */
    boolean async() default false;

    /**
     * Specifies the character encoding used in an external script file
     */
    String charset() default "";

    /**
     * Specifies that the script is executed when the page has finished parsing (only for external scripts)
     */
    boolean defer() default false;

    /**
     * Specifies the URL of an external script file
     */
    String src() default "";

    /**
     * Specifies the media type of the script
     */
    String type() default "";

    /**
     * Inner HTML value
     */
    String value() default "";
}
