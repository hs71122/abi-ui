package org.freethemalloc.ui.uimodel;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;
import org.freethemalloc.ui.annotation.html.element.Button;
import org.freethemalloc.ui.annotation.html.element.Container;
import org.freethemalloc.ui.annotation.html.element.Label;
import org.freethemalloc.ui.annotation.html.element.Page;
import org.freethemalloc.ui.annotation.html.element.Page.FrameworkType;
import org.freethemalloc.ui.annotation.html.element.head.Head;
import org.freethemalloc.ui.annotation.html.element.head.Link;
import org.freethemalloc.ui.annotation.html.element.head.Script;
import org.freethemalloc.ui.annotation.html.element.head.Title;

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
public class Test {

    @Container
    public class TestForm {
        @Label(_for = "me1")
        String firstName = "";
        @Label(_for = "me2")
        @GlobalAttribute(hidden = true)
        String lastName = "";
        @Button(classes = "", text = "submit", properties = {})
        String submit = "Submit";

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSubmit() {
            return submit;
        }

        public void setSubmit(String submit) {
            this.submit = submit;
        }
    }
}
