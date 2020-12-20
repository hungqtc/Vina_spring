package edu.vinaenter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.models.User;

@Controller
@RequestMapping("auth")
public class AuthController {

	@GetMapping("login")
	public String add() {
		return "auth/login";
	}
	
	@PostMapping("login")
	public String login(@ModelAttribute("user") User user, 
			HttpSession session, RedirectAttributes ra) {
		if ("admin".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			User userInfo = new User(user.getUsername(), user.getPassword(), "Hung");
			session.setAttribute("userInfo", userInfo);
			return "redirect:/football/index";
		} 
		//Thông báo bỏ trong file properties, lấy ra giá trị
		ra.addFlashAttribute("msg", "Bạn đã sai tên đăng nhập hoặc mật khẩu");
		return "redirect:/auth/login";
	}
}
