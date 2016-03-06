package org.freethemalloc.ui.annotation.html.element.head;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The style annotation define the style information of the HTML page <br />
 * There are two properties :
 * <ul>
 *     <li>{@link GlobalAttribute} attribute</li>
 *     <li>{@link String} value</li>
 * </ul>
 * @see GlobalAttribute
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Style {

    GlobalAttribute attribute() default @GlobalAttribute();

    /**
     * Inner HTML value
     */
    String value() default "";

    /**
     * Specifies what media/device the media resource is optimized for
     */
    String media() default "";

    /**
     * Specifies that the styles only apply to this element's parent element and that element's child elements
     */
    boolean scoped() default false;

    /**
     * Specifies the media type of the &lt style &gt tag
     */
    String type() default "";
}
