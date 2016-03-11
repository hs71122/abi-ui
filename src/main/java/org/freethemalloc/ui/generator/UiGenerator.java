package org.freethemalloc.ui.generator;

import java.lang.annotation.Annotation;

import org.freethemalloc.ui.handler.HeadHandler;


public class UiGenerator {

    public <T> String build(T generatorType) {
        out("Called Build");
        out("Class Name : " + generatorType.getClass().getName());

        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html>");


        Annotation[] annotations = generatorType.getClass().getDeclaredAnnotations();

        for (Annotation annotation : annotations) {
            out("Annotation Type" + annotation.annotationType().toString());
            if (annotation.annotationType().getSimpleName().equals("Head")) {
                HeadHandler handler = new HeadHandler();
                htmlBuilder.append(handler.processTag(annotation));
            }
        }
        String body = "<body>" +
                "<div class=\"container\">" +
                "  <div class=\"jumbotron\">" +
                "    <h1>My First Bootstrap Page</h1>" +
                "    <p>Resize this responsive page to see the effect!</p>" +
                "  </div></div>" +
                "</body>";
        htmlBuilder.append(body);
        htmlBuilder.append("</html>");
        return htmlBuilder.toString();
    }

    public void out(String str) {
        System.out.println(str);
    }

}
