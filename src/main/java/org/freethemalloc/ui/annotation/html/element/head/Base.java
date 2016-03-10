package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Harshana Samaranayake on 3/6/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
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
