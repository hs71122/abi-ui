package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MiscEventAttributes {
    /**
     *Fires when an error occurs while loading an external file(e.g. a document or an image).
     */
    String onError() default "";

    /**
     *Fires when a &lt menu &gt element is shown as a context menu
     */
    String onShow() default "";

    /**
     *The ontoggle attribute fires when the user opens or closes the &lt details &gt element.
     *The &lt details &g telement specifies additional details that the user can view or hide on demand.
     */
    String onToggle() default "";
}
