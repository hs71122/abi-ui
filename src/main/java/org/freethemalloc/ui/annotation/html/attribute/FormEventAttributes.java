package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Events triggered by actions inside a HTML form (applies to almost all HTML elements, but is most used in form elements)
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FormEventAttributes {
    /**
     *The onblur attribute fires the moment that the element loses focus.
     * Onblur is most often used with form validation code (e.g. when the user leaves a form field).
     */
    String onBlur() default "";

    /**
     * The onchange attribute fires the moment when the value of the element is changed.
     */
    String onChange() default "";

    /**
     *The oncontextmenu attribute fires when the user right-clicks on an element to open the context menu.
     */
    String onContextmenu() default "";

    /**
     * The onfocus attribute fires the moment that the element gets focus.
     * Onfocus is most often used with &lt input &gt , &lt select &gt, and &lt a &gt.
     */
    String onFocus() default "";

    /**
     * The oninput attribute fires when an element gets user input.
     * The oninput attribute fires when the value of an &lt input &gt or &lt textarea &gt element is changed.
     */
    String onInput() default "";

    /**
     * The oninvalid event occurs when a submittable &lt input &gt element is invalid.
     * For example, the input field is invalid if the required attribute is set and the field is empty (the required attribute specifies that the input field must be filled out before submitting the form).
     */
    String onInvalid() default "";

    /**
     * The onreset attribute fires when a form is reset.
     */
    String onReset() default "";

    /**
     * The onsearch attribute fires when a user presses the "ENTER" key or clicks the "x" button in an &lt input &gt element with type="search".
     */
    String onSearch() default "";

    /**
     * The onselect attribute fires after some text has been selected in an element.
     */
    String onSelect() default "";

    /**
     * The onsubmit attribute fires when a form is submitted.
     */
    String onSubmit() default "";


}