package org.freethemalloc.ui.annotation.html.element;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface Page {
	/**
	 * css frameworks 
	 * @author Harshana Samaranayake
	 *
	 */
	public enum FrameworkType{
		BOOTSTRAP,
		ANGULAR;
	}
	FrameworkType framework() default FrameworkType.BOOTSTRAP;
	String title();
	Bootstrap bootstrap();
	@interface Bootstrap{
		String bsCssMin();
		String bsJsMin();
		String jqMin();
	}
}
