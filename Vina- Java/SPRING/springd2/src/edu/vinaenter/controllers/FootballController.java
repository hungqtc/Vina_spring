package edu.vinaenter.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vinaenter.daos.FootballDAO;
import edu.vinaenter.models.Football;

@Controller
@RequestMapping("football")
public class FootballController {
	@Autowired //DI: spring tu dong tao doi tuong trong filr config
	private FootballDAO footballDAO;
	/*
	 * //DI public FootballController() { footballDAO = new FootballDAO(); }
	 */
	
	
	@GetMapping("index")
	public String index(ModelMap model) {
		List<Football> listFootball = footballDAO.getItems();
		model.addAttribute("listFootball", listFootball);
		return "football/index";
	}
	
	@GetMapping("add")
	public String add() {
		
		return "football/add";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name") String name, 
			@RequestParam("dateCreate") Date date
			) {
		System.out.println(name + date);
		
		return "football/add";
	}
	
	@PostMapping("add-model")
	public String add(@ModelAttribute("football") Football football) {
		System.out.println(football.getName());
		return "football/add";
	}
	
	@GetMapping("info")
	@ResponseBody //khong tra ve view. ap dng cho ajax
	public String getParamUrl(@RequestParam(name="id", defaultValue = "1", required = true) int id,
			@RequestParam(name="name", defaultValue = "Hung") String name) {
		return "ID: " + id + "Name: " + name;
	} 
	//football/url/1/hung
	@GetMapping("url/{id}/{name}")
	@ResponseBody //khong tra ve view. ap dng cho ajax
	public String getParamUrl(@PathVariable("id") Integer id, 
			@PathVariable("name") String name) {
		return "ID : " + id + "Name : " + name;
	} 
}
