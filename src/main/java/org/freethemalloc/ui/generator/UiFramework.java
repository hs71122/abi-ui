package org.freethemalloc.ui.generator;

public abstract class UiFramework {

	public String getUiTemplate(String header,String title,String body){
		String htmlTemplate = "<!DOCTYPE html>"+
		"<html>"+
		"<head>"+
		"<meta charset=\"UTF-8\">"+
		"<title>"+title+"</title>"+
		header+
		"</head>"+
		"<body>"+
		body+
		"</body>"+
		"</html>";
		return htmlTemplate;
	}
}
