package edu.vinaenter.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.vinaenter.constants.UrlConstants;

@Controller
@RequestMapping(UrlConstants.URL_AUTH)
public class AuthController {
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping(UrlConstants.URL_LOGIN)
	public String login() {
		return "cland.auth.login";
	}
	
	@GetMapping("get-pass")
	@ResponseBody
	public String getPassword() {
		return bCryptPasswordEncoder.encode("123456");
	}
	
	@GetMapping("403")
	@ResponseBody
	public String err403() {
		return "Khong co quyen truy cap";
	}
}
