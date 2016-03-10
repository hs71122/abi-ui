package org.freethemalloc.ui.annotation.html.element.head;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *The &lt head &gt element is a container for metadata (data about data).<br />
 *HTML metadata is data about the HTML document. Metadata is not displayed.<br />
 *Metadata typically define document title, styles, links, scripts, and other meta information.<br />
 *The following tags describe metadata: &lt title &gt, &lt style &gt, &lt meta &gt, &lt link &gt, &lt script &gt, and &lt base &gt.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Head {

    /**
     * The &lt title &gt tag is required in all HTML documents and it defines the title of the document.
     *The &lt title &gt element:
     * <ul>
     *<li>defines a title in the browser toolbar</li>
     *<li>provides a title for the page when it is added to favorites</li>
     *<li>displays a title for the page in search-engine results</li>
     *</ul>
     * @see Title
     */
    Title title() default @Title();

    /**
     * The &lt style &gt tag is used to define style information for an HTML document.<br />
     *Inside the &lt style &gt element you specify how HTML elements should render in a browser.<br />
     *Each HTML document can contain multiple &lt style &gt tags.
     */
    Style[] style() default @Style();

    Meta[] meta() default @Meta();
    Link[] link() default @Link();
    Script[] script() default @Script();
    Base base() default @Base();
}
