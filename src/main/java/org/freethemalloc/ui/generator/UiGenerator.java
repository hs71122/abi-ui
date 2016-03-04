package org.freethemalloc.ui.generator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.freethemalloc.ui.component.*;
import org.freethemalloc.ui.stereotype.Container;
import org.freethemalloc.ui.stereotype.Page;


public class UiGenerator extends UiFramework{

	public <T> String build(T generatorType) {
		
		Class<? extends Object> classType = generatorType.getClass();
		
		if(classType.isAnnotationPresent(Page.class)){
			System.out.println("present..");
			Page page = classType.getAnnotation(Page.class);
			if(page.framework() == Page.FrameworkType.BOOTSTRAP){
				out("Bootsrap");
				buildBootstrap(classType);
			}else if(page.framework() == Page.FrameworkType.ANGULAR){
				out("Anugular");
			}else{
				out("not define");
			}
			
		}else{
			System.out.println("not present");
		}
		System.out.println("Done");
		return this.getUiTemplate("", "Test", "<h1>Hello Generator</h>");
	}
	
	/**
	 * 
	 * @param classType
	 */
	private String buildBootstrap(Class<? extends Object> classType) {
		Bootstrap bootstrap;
		Page page = classType.getDeclaredAnnotation(Page.class);
		Page.Bootstrap bs = page.bootstrap();
		String title = page.title();
		String bsCssMin = bs.bsCssMin();
		String bsJsMin = bs.bsJsMin();
		String jqMin = bs.jqMin();
		
		if(!bsCssMin.equals("") && !bsJsMin.equals("") && !jqMin.equals("")){
			out("Bootsrap framework dependence found");
			String header = buildHeader(bsCssMin,bsJsMin,jqMin);
			String body;
			
			Class[] classes = classType.getDeclaredClasses();
			out("classes : "+classes.toString());
			for(Class _class : classes){
				out("inner class : "+_class.toString());
				Annotation[] annotations = _class.getDeclaredAnnotations();
				for(Annotation annotation : annotations){
					out("inner class annotation : "+annotation.toString());
					if(annotation.annotationType().equals(Container.class)){
						BootstrapContainer container = new BootstrapContainer();
						Field[] fields = _class.getDeclaredFields();
						out("Field count : "+fields.length);
						for(Field field : fields){
							Annotation[] fAnnotations = field.getDeclaredAnnotations();
							for(Annotation fAnnotation : fAnnotations){
								out(fAnnotation.annotationType().getName());
							}
						}
						
					}
				}
			}
			out("end");
		}else{
			out("Bootsrap framework dependence not found");
		}
		return null;
		
		//bootstrap = new Bootstrap(bsCssMin, bsJsMin, jqMin);
	}
	private String buildHeader(String bsCssMin, String bsJsMin, String jqMin) {
		
		return "<link rel=\"stylesheet\" href=\""+bsCssMin+"\">"+
				"<script src=\""+jqMin+"\"></script>"+
				"<script src=\""+bsJsMin+"\"></script>";
	}

	public void out(String str){
		System.out.println(str);
	}

}
