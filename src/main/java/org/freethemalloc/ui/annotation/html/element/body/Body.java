package org.freethemalloc.ui.annotation.html.element.body;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;
import org.freethemalloc.ui.annotation.html.attribute.GlobalEventAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * The &lt body &gt tag defines the document's body.
 * The &lt body &gt element contains all the contents of an HTML document, such as text, hyperlinks, images, tables, lists, etc.
 */
@Target(ElementType.TYPE)
public @interface Body {
    GlobalAttribute[] attribute() default @GlobalAttribute();
    GlobalEventAttribute[] events() default @GlobalEventAttribute();
}
