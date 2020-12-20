package edu.vinaenter.controller.anews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("anews")
public class AnewsController {
	
	@GetMapping
	public String index() {
		return "anews.anews.index";
	}
	
	@GetMapping("add")
	public String add() {
		return "anews.anews.add";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "anews.anews.detail";
	}
	
	@GetMapping("cat")
	public String cat() {
		return "anews.anews.cat";
	}
}
