package org.freethemalloc.ui.annotation.html.attribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * HTML attributes give elements meaning and context.
 * The global attributes below can be used on any HTML element.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GlobalAttribute {

    /**
     * The accesskey attribute specifies a shortcut key to activate/focus an element.
     */
    String accesskey() default "";

    /**
     * The class attribute specifies one or more classnames for an element.
     * The class attribute is mostly used to point to a class in a style sheet. However, it can also be used by a JavaScript (via the HTML DOM) to make changes to HTML elements with a specified class.
     */
    String classs() default "";

    /**
     * The contenteditable attribute specifies whether the content of an element is editable or not
     */
    boolean contenteditable() default true;

    /**
     * The contextmenu attribute specifies a context menu for an element. The context menu appears when a user right-clicks on the element
     * The value of the contextmenu attribute is the id of the &lt menu &gt element to open.
     */
    String contextmenu() default "";

    @Target(ElementType.ANNOTATION_TYPE)
    public @interface data {
        String dataName() default "";

        String value() default "";
    }

    /**
     * The data-* attributes is used to store custom data private to the page or application.
     * The data-* attributes gives us the ability to embed custom data attributes on all HTML elements.
     * The stored (custom) data can then be used in the page's JavaScript to create a more engaging user experience (without any Ajax calls or server-side database queries).
     * The data-* attributes consist of two parts:
     * The attribute name should not contain any uppercase letters, and must be at least one character long after the prefix "data-"
     * The attribute value can be any string
     * Note: Custom attributes prefixed with "data-" will be completely ignored by the user agent.
     */
    data data() default @data();

    public enum DirType {
        LTR, RTR, AUTO;
    }

    /**
     * The dir attribute specifies the text direction of the element's content.
     * values :
     * <table style="border: 1px solid gray; margin: 1em 2.5em; padding: 0em 0.5em">
     * <tbody><tr>
     * <th >Value</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>ltr</td>
     * <td>Default. Left-to-right text direction</td>
     * </tr>
     * <tr>
     * <td>rtl</td>
     * <td>Right-to-left text direction</td>
     * </tr>
     * <tr>
     * <td>auto</td>
     * <td>Let the browser figure out the text direction, based on the content
     * (only recommended if the text direction is unknown)</td>
     * </tr>
     * </tbody></table>
     */
    DirType dir() default DirType.AUTO;

    /**
     * Specifies whether an element is draggable or not<br />
     * <div style="border: 1px solid gray; margin: 1em 2.5em; padding: 0em 0.5em">
     * value = {@link Boolean}
     * </div>
     */
    boolean draggable() default false;

    public enum DropZoneType {
        COPY, MOVE, LINK, NONE;
    }

    /**
     * The dropzone attribute specifies whether the dragged data is copied, moved, or linked, when it is dropped on an element.<br />
     * <table>
     * <tbody><tr>
     * <th style="width:20%">Value</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>copy</td>
     * <td>Dropping the data will result in a copy of the dragged data</td>
     * </tr>
     * <tr>
     * <td>move</td>
     * <td>Dropping the data will result in that the dragged data is moved to
     * the new location</td>
     * </tr>
     * <tr>
     * <td>link</td>
     * <td>Dropping the data will result in a link to the original data</td>
     * </tr>
     * </tbody></table>
     *
     * @see DropZoneType
     */
    DropZoneType dropZone() default DropZoneType.NONE;

    /**
     * The hidden attribute is a boolean attribute.<br />
     *When present, it specifies that an element is not yet, or is no longer, relevant.<br />
     *Browsers should not display elements that have the hidden attribute specified.<br />
     *The hidden attribute can also be used to keep a user from seeing an element until some other condition has been met (like selecting a checkbox, etc.).
     * Then, a JavaScript could remove the hidden attribute, and make the element visible.<br />
     *
     * default value : false;
     */
    boolean hidden() default false;
}
