package org.freethemalloc.ui.handler;

import org.freethemalloc.ui.annotation.html.element.head.Head;
import org.freethemalloc.ui.annotation.html.element.head.Link;
import org.freethemalloc.ui.annotation.html.element.head.Title;

import java.lang.annotation.Annotation;

/**
 * Created by Harshana Samaranayake on 3/9/2016.
 */
public class TitleHandler implements Handler {
    @Override
    public String processTag(Annotation tag) {

        Title title = (Title)tag;

        return "<title>"+title.value()+"</title>";
    }
}
