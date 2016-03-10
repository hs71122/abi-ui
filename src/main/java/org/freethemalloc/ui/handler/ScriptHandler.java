package org.freethemalloc.ui.handler;

import org.freethemalloc.ui.annotation.html.element.head.Script;

import java.lang.annotation.Annotation;

/**
 * Created by Harshana Samaranayake on 3/9/2016.
 */
public class ScriptHandler implements Handler {
    @Override
    public String processTag(Annotation tag) {

        Script script = (Script)tag;
        return "<script src=\""+script.src()+"\" ></script>";
    }
}
