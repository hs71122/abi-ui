package org.freethemalloc.ui.handler;

import java.lang.annotation.Annotation;

/**
 * Created by Harshana Samaranayake on 3/9/2016.
 */
public class BaseHandler implements Handler {
    @Override
    public String processTag(Annotation tag) {
        return null;
    }
}
