package edu.vinaenter.controller.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("basic")
public class BasicController {
	
	@GetMapping
	public String index() {
		return "basic.basic.index";
	}
	
	@GetMapping("cat")
	public String cat() {
		return "basic.basic.cat";
	}
	
	@GetMapping("user")
	public String user() {
		return "basic.basic.user";
	}
}
