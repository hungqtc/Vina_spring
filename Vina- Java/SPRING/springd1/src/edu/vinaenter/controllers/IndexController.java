package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("title", "home");
		return "index";
	}
	//method cat return view: news/cat.jsp
	@RequestMapping(value = "cat", method = RequestMethod.GET)
	public String cat(ModelMap model) {
		model.addAttribute("title", "cat");
		return "news/cat";
	}
}
