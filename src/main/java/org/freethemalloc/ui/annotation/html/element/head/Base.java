package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

/**
 * Created by Harshana Samaranayake on 3/6/2016.
 */
public @interface Base {

    GlobalAttribute atrribute() default @GlobalAttribute();
    /**
     * Specifies the base URL for all relative URLs in the page
     */
    String href() default "";

    /**
     * Specifies the default target for all hyperlinks and forms in the page
     */
    String target() default "";
}
