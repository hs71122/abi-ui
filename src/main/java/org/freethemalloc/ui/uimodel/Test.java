package org.freethemalloc.ui.uimodel;

import org.freethemalloc.ui.annotation.html.attribute.GlobalAttribute;
import org.freethemalloc.ui.annotation.html.element.Button;
import org.freethemalloc.ui.annotation.html.element.Container;
import org.freethemalloc.ui.annotation.html.element.Label;
import org.freethemalloc.ui.annotation.html.element.Page;
import org.freethemalloc.ui.annotation.html.element.Page.FrameworkType;

@Page(	title = "Test", 
		framework = FrameworkType.BOOTSTRAP, 
		bootstrap = @Page.Bootstrap(
			bsCssMin = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css", 
			bsJsMin = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js", 
			jqMin = "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"
			) 
)
public class Test {

	@Container
	public class TestForm {
		@Label(_for="me1")
		String firstName = "";
		@Label(_for="me2")
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
