package org.freethemalloc.ui.annotation.html.attribute;

/**
 * HTML attributes give elements meaning and context.
 *The global attributes below can be used on any HTML element.
 */
public @interface GlobalAttribute {

    String accesskey() default "";
    String classs() default "";
    boolean contenteditable() default true;

    /**
     * The contextmenu attribute specifies a context menu for an element. The context menu appears when a user right-clicks on the element
     *The value of the contextmenu attribute is the id of the &lt menu &gt element to open.
     */
    String contextmenu() default "";

    public @interface data{
        String dataName() default "";
        String value() default "";
    }

    /**
     * The data-* attributes is used to store custom data private to the page or application.
     *The data-* attributes gives us the ability to embed custom data attributes on all HTML elements.
     *The stored (custom) data can then be used in the page's JavaScript to create a more engaging user experience (without any Ajax calls or server-side database queries).
     *The data-* attributes consist of two parts:
     *The attribute name should not contain any uppercase letters, and must be at least one character long after the prefix "data-"
     *The attribute value can be any string
     *Note: Custom attributes prefixed with "data-" will be completely ignored by the user agent.
     */
    data data() default @data();

    public enum DirType{
        ltr,rtl,auto;
    }

    /**
     * The dir attribute specifies the text direction of the element's content.
     * values :
     * <table>
     *<tbody><tr>
     *<th >Value</th>
     *<th>Description</th>
     *</tr>
     *<tr>
     *<td>ltr</td>
     *<td>Default. Left-to-right text direction</td>
     *</tr>
     *<tr>
     *<td>rtl</td>
     *<td>Right-to-left text direction</td>
     *</tr>
     *<tr>
     *<td>auto</td>
     *<td>Let the browser figure out the text direction, based on the content
     *(only recommended if the text direction is unknown)</td>
     *</tr>
     *</tbody></table>
     */
    DirType dir() default DirType.auto;

}
