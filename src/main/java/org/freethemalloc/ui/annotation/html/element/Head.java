package org.freethemalloc.ui.annotation.html.element;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;

/**
 *The &lt head &gt element is a container for metadata (data about data).<br />
 *HTML metadata is data about the HTML document. Metadata is not displayed.<br />
 *Metadata typically define document title, styles, links, scripts, and other meta information.<br />
 *The following tags describe metadata: &lt title &gt, &lt style &gt, &lt meta &gt, &lt link &gt, &lt script &gt, and &lt base &gt.
 */
public @interface Head {

    /**
     * The Title annotation define the title of the HTML page <br />
     * There are two properties :
     * <ul>
     *     <li>{@link GlobalAttribute} attribute</li>
     *     <li>{@link String} value</li>
     * </ul>
     * @see GlobalAttribute
     */
    @interface Title{
        GlobalAttribute attribute() default @GlobalAttribute();
        String value() default "";
    }

    /**
     * The <title> tag is required in all HTML documents and it defines the title of the document.
     *The <title> element:
     * <ul>
     *<li>defines a title in the browser toolbar</li>
     *<li>provides a title for the page when it is added to favorites</li>
     *<li>displays a title for the page in search-engine results</li>
     *</ul>
     * @see Title
     */
    Title title() default @Title();
    String style() default "";
    String meta() default "";
    String link() default "";
    String script() default "";
    String base() default "";
}
