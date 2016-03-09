package org.freethemalloc.ui.handler;

import org.freethemalloc.ui.annotation.html.element.head.*;

import java.lang.annotation.Annotation;

/**
 * Head tag handler class
 */
public class HeadHandler implements Handler {

    @Override
    public String processTag(Annotation tag) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<head>");
        Head head = (Head)tag;
        Link[] links = head.link();
        Script[] scripts = head.script();
        Title title = head.title();
        Base base = head.base();
        Meta[] meta = head.meta();
        Style[] style = head.style();

        TitleHandler titleHandler = new TitleHandler();
        for (Link link : links){
            stringBuilder.append(titleHandler.processTag(link));
        }

        return "";
    }
}
