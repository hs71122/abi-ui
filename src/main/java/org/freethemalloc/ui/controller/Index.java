package org.freethemalloc.ui.controller;

import org.freethemalloc.ui.generator.UiGenerator;
import org.freethemalloc.ui.uimodel.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		Test test = new Test();
		model.addAttribute("html", genarator.build(test));
		return "test";
	}
}
