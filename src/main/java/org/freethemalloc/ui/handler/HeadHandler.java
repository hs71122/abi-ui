package org.freethemalloc.ui.handler;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;
import org.freethemalloc.ui.annotation.html.element.head.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        ScriptHandler scriptHandler = new ScriptHandler();
        LinkHandler linkHandler = new LinkHandler();

        stringBuilder.append(titleHandler.processTag(title)); //set title tag
        for (Link link : links){
            stringBuilder.append(linkHandler.processTag(link));//set link tags
        }
        for (Script script : scripts){
            stringBuilder.append(scriptHandler.processTag(script));//set script tags
        }

        return stringBuilder.append("</head>").toString();
    }
}
