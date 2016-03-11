package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *The ClipboardEvent interface represents events providing information related to modification of the clipboard, that is cut, copy, and paste events.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ClipboardEventAttributes {
    /**
     *The oncopy attribute fires when the user copies the content of an element.
     */
    String onCopy() default "";

    /**
     *The oncut attribute fires when the user cuts the content of an element.
     */
    String onCut() default "";

    /**
     *The onpaste attribute fires when the user pastes some content in an element.
     */
    String onPaste() default "";


}
