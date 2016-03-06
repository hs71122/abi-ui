package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Title annotation define the title of the HTML page <br />
 * There are two properties :
 * <ul>
 *     <li>{@link GlobalAttribute} attribute</li>
 *     <li>{@link String} value</li>
 * </ul>
 * @see GlobalAttribute
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Title {

    GlobalAttribute attribute() default @GlobalAttribute();
    String value() default "";
}
