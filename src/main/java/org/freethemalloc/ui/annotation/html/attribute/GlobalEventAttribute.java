package org.freethemalloc.ui.annotation.html.attribute;

/**
 * ability to let events trigger actions in a browser, like starting a JavaScript when a user clicks on an element.
 */
public @interface GlobalEventAttribute {

    WindowEventAttributes windowEventAttribute() default @WindowEventAttributes();
}
