package org.freethemalloc.ui.generator;

@SuppressWarnings("unused")
public class AngularMaterial {

	private final FrameWorkLink FRAMEWORK_LINKS = new FrameWorkLink();
	
	private class FrameWorkLink{
		String angular_material_layouts_css = "https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.0.1/angular-material.layouts.min.css";
		String angular_material_css = "https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.0.1/angular-material.min.css";
		String angular_material_js = "https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.0.1/angular-material.min.js";
	}
	
	private class AButton{
		String cssClass;
		String[] properties;
		String title;
		public String getCssClass() {
			return cssClass;
		}
		public void setCssClass(String cssClass) {
			this.cssClass = cssClass;
		}
		public String[] getProperties() {
			return properties;
		}
		public void setProperties(String[] properties) {
			this.properties = properties;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	public String makeButton(AButton button){
	
		return "<md-button class=\""+button.cssClass+"\" "+button.properties+">"+button.title+"</md-button>";
	}
	
	public String makePage(String content){
		
		String page = "<!DOCTYPE html>"+
						"<html>"+
						"<head>"+
						"<title>Title of the document</title>"+
						"</head>"+	
						"<body>"+
						content+
						"</body>"+
						"</html>";
		return page;
	}
}
