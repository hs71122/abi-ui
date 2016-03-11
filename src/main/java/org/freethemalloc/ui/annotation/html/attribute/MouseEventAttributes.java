package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *A mouse event occurs when a user moves the mouse in the user interface of an application.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MouseEventAttributes {

    /**
     *The onclick attribute fires on a mouse click on the element.
     */
    String onClick() default "";

    /**
     *The ondblclick attribute fires on a mouse double-click on the element.
     */
    String onDblClick() default "";

    /**
     *The ondrag attribute fires when an element or text selection is being dragged.
     */
    String onDrag() default "";

    /**
     *The ondragend attribute fires when the user has finished dragging an element or text selection.
     */
    String onDragend() default "";

    /**
     *The ondragenter attribute fires when a draggable element or text selection enters a valid drop target.
     */
    String onDragenter() default "";

    /**
     * The ondragleave attribute fires when a draggable element or text selection leaves a valid drop target.
     *
     * The ondragenter and ondragleave events can help the user to understand that a draggable element is about to enter
     * or leave a drop target. This can be done by, for example, setting a background color when the draggable element
     * enters the drop target, and removing the color when the element is moved out of the target.
     */
    String onDragleave() default "";

    /**
     *The ondragover attribute fires when a draggable element or text selection is being dragged over a valid drop target.
     *
     *By default, data/elements cannot be dropped in other elements. To allow a drop, we must prevent the default handling of the element.
     *This is done by calling the event.preventDefault() method for the ondragover attribute.
     */
    String onDragover() default "";

    /**
     *The ondragstart attribute fires when the user starts to drag an element or text selection.
     */
    String onDragstart() default "";

    /**
     *The ondrop attribute fires when a draggable element or text selection is dropped on a valid drop target.
     */
    String onDrop() default "";

    /**
     *The onmousedown attribute fires when a mouse button is pressed down on the element.
     */
    String onMousedown() default "";

    /**
     *The onmousemove attribute fires when the pointer is moving while it is over an element.
     */
    String onMousemove() default "";

    /**
     *The onmouseout attribute fires when the mouse pointer moves out of an element.
     */
    String onMouseout() default "";

    /**
     *The onmouseover attribute fires when the mouse pointer moves over an element.
     */
    String onMouseover() default "";

    /**
     *The onmouseup attribute fires when a mouse button is released over the element.
     */
    String onMouseup() default "";

    /**
     *The onwheel attribute fires when the wheel of a pointing device is rolled up or down over an element.
     *The onwheel atttribute also fires when the user scrolls or zooms on an element by using a touchpad (like the "mouse" of a laptop).
     */
    String onWheel() default "";

    /**
     *The onscroll attribute fires when an element's scrollbar is being scrolled.
     */
    String onScroll() default "";
}
