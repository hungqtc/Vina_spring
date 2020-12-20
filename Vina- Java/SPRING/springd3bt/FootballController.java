package edu.vinaenter.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	private FootballDAO footballDAO;
	
	public FootballController() {
		footballDAO = new FootballDAO();
	}
	
	@GetMapping("index")
	public String index(Model model) {
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
			@RequestParam("dateCreate") Date dateCreate
			) {
		System.out.println("Date: "+name);
		System.out.println("Date: "+dateCreate);
		return "football/add";
	}
	
	@PostMapping("add-model")
	public String add(@ModelAttribute("football") Football football) {
		System.out.println("Date: "+football.getName());
		System.out.println("Date: "+football.getDateCreate());
		return "football/add";
	}
	
	//football/info?id=1&name=hihi
	@GetMapping("info")
	@ResponseBody // ap dung cho ajax
	public String getParamUrl(@RequestParam(name="id", defaultValue="1") int id, 
			@RequestParam(name="name", defaultValue="No value", required=true) String name) {
		return "id :"+id+" Name :"+name;
	}
	
	//football/url/1/hihi
	@GetMapping("url/{id}/{name}")
	@ResponseBody // ap dung cho ajax
	public String getParamUrl(@PathVariable Integer id, @PathVariable String name) {
		return "id_:"+id+" Name_:"+name;
	}
}
