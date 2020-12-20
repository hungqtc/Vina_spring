package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("bai2")
public class TinhTongController {
	
	@GetMapping ("index")
	public String index() {
		return "bai2/tinhtong";
	}
	
	
	@PostMapping("index") 
	public String cauchao(ModelMap model, @RequestParam("name") int[] number) {
		
		int tong = 0;
		for (int i = 0; i < number.length; i++) {
			tong += number[i];
		}
		
		model.addAttribute("tong", tong);
		
		return "bai2/tinhtong";
		
	}
	
}
