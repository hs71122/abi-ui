package org.freethemalloc.ui.handler;

import org.freethemalloc.ui.annotation.html.element.head.Link;

import java.lang.annotation.Annotation;

/**
 * Created by Harshana Samaranayake on 3/9/2016.
 */
public class LinkHandler implements Handler {
    @Override
    public String processTag(Annotation tag) {

        Link link = (Link)tag;

        return "<link href=\""+link.href()+"\" rel=\""+link.rel()+"\" />";
    }
}
