package org.freethemalloc.ui.controller;

import org.freethemalloc.ui.generator.UiGenerator;
import org.freethemalloc.ui.uimodel.Test;
import org.freethemalloc.ui.uimodel.Test2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Annotation;

@Controller
public class Index {
    /*
        String bCss = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css";
        String jq = "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js";
        String bJs = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js";
    */
    @RequestMapping("/h")
    public String hello(Model model) {
        System.out.println("index method called");
        UiGenerator genarator = new UiGenerator();
        Test2 test2 = new Test2();
        String html = genarator.build(test2);
        model.addAttribute("html", html);
        System.out.println(html);
        return "test";
    }
}
