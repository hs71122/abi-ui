package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Events triggered for the window object (applies to the <body> tag).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface WindowEventAttributes {

    /**
     * The onafterprint attribute fires when a page has started printing, or if the print dialogue box has been closed.
     */
    String onAfterPrint() default "";

    /**
     * The onbeforeprint attribute fires when a page is about to be printed (before the print dialogue box appears).
     */
    String onBeforePrint() default "";

    /**
     * The onbeforeunload event fires when the document is about to be unloaded.<br />
     * This event allows you to display a message in a confirmation dialog box to inform the user whether he/she wants to stay or leave the current page.<br />
     * The default message that appears in the confirmation box, is different in different browsers. However, the standard message is something like "Are you sure you want to leave this page?". You cannot remove this message.<br />
     * However, you can write a custom message together with the default message. See the first example on this page.
     */
    String onBeforeUnload() default "";

    /**
     * Script to be run when an error occurs
     */
    String onError() default "";

    /**
     * The onhashchange attribute fires when there has been changes to the anchor part (begins with a '#' symbol) of the current URL.
     */
    String onhashchange() default "";

    /**
     * The onload attribute fires when an object has been loaded.<br />
     * onload is most often used within the &lt body &gt element to execute a script once a web page has completely loaded all content (including images, script files, CSS files, etc.). However, it can be used on other elements as well (see "Supported HTML tags" below).
     */
    String onLoad() default "";

    /**
     * Script to be run when the message is triggered
     */
    String onMessage() default "";

    /**
     * The onoffline attribute fires when the browser starts to work offline.
     */
    String onOffline() default "";

    /**
     * The ononline attribute fires when the browser starts to work online.
     */
    String onOnline() default "";

    /**
     * Script to be run when a user navigates away from a page
     */
    String onPageHide() default "";

    /**
     * Script to be run when a user navigates to a page
     */
    String onPageShow() default "";

    /**
     * Script to be run when the window's history changes
     */
    String onPopState() default "";

    /**
     * Fires when the browser window is resized
     */
    String onResize() default "";

    /**
     * Script to be run when a Web Storage area is updated
     */
    String onStorage() default "";

    /**
     * Fires once a page has unloaded (or the browser window has been closed)
     */
    String onUnload() default "";


}
