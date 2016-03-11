package org.freethemalloc.ui.annotation.html.element.body;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

/**
 * The &lt a &gt tag defines a hyperlink, which is used to link from one page to another.
 * The most important attribute of the &lt a &gt element is the href attribute, which indicates the link's destination.<br />
 * By default, links will appear as follows in all browsers:
 * <ul>
 * <li>An unvisited link is underlined and blue</li>
 * <li>A visited link is underlined and purple</li>
 * <li>An active link is underlined and red</li>
 * </ul>
 */
public @interface A {
    /**
     * Global attributes
     * @see GlobalAttribute
     */
    GlobalAttribute atrribute() default @GlobalAttribute();

    /**
     * Specifies that the target will be downloaded when a user clicks on the hyperlink
     */
    String download() default "";

    /**
     * Specifies the URL of the page the link goes to
     */
    String href() default "";

    /**
     * Specifies the language of the linked document
     */
    String hreflang() default "";

    /**
     * Specifies what media/device the linked document is optimized for
     */
    String media() default "";

    /**
     * Specifies the relationship between the current document and the linked document
     */
    String rel() default "";

    /**
     * Specifies where to open the linked document
     */
    String target() default "";

    /**
     * Specifies the media type of the linked document
     */
    String type() default "";
}
