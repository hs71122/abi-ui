package org.freethemalloc.ui.uimodel;

import org.freethemalloc.ui.stereotype.Button;
import org.freethemalloc.ui.stereotype.Container;
import org.freethemalloc.ui.stereotype.Label;
import org.freethemalloc.ui.stereotype.Page;
import org.freethemalloc.ui.stereotype.Page.FrameworkType;

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
		String lastName = "";
		@Button(classes = "", text = "submit", properties = {})
		String submit = "Submit";
	}
}
