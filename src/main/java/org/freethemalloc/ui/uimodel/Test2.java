package org.freethemalloc.ui.uimodel;

import org.freethemalloc.ui.annotation.html.element.head.Head;
import org.freethemalloc.ui.annotation.html.element.head.Link;
import org.freethemalloc.ui.annotation.html.element.head.Script;
import org.freethemalloc.ui.annotation.html.element.head.Title;

/**
 * Created by Harshana Samaranayake on 3/10/2016.
 */
@Head(
        link = {
                @Link(rel = "stylesheet", href = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")
        },
        script = {
                @Script(src = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"),
                @Script(src = "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js")
        },
        title = @Title(value = "First Page")
)
public class Test2 {
}
