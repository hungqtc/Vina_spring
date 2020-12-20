package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("bai1")
public class InCauChaoController {
	
	@GetMapping ("index")
	public String index() {
		return "bai1/cauchao";
	}
	
	@PostMapping("index") 
	public String cauchao(ModelMap model, @RequestParam("name") String name) {
		model.addAttribute("name", name);
		
		return "bai1/cauchao";
		
	}
	
}
