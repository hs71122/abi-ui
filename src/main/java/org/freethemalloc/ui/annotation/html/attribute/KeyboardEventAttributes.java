package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *Keyboard events is one of wilder parts of frontend development which describe a user interaction with the keyboard.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface KeyboardEventAttributes {
    /**
     *The onkeydown attribute fires when the user is pressing a key on the keyboard.
     */
    String onKeydown() default "";

    /**
     *The onkeypress attribute fires when the user presses a key on the keyboard.
     */
    String onKeypress() default "";

    /**
     *The onkeyup attribute fires when the user releases a key on the keyboard.
     */
    String onKeyup() default "";
}
