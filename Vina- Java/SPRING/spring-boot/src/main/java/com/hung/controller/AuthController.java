
package com.hung.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hung.jwt.JwtTokenProvider;
import com.hung.payload.LoginRequest;
import com.hung.payload.LoginResponse;
import com.hung.payload.RandomStuff;
import com.hung.security.CustomUserDetails;
import com.hung.service.UserService;

@RestController
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenProvider tokenProvider;

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public LoginResponse createAuthenticationToken(@Valid @RequestBody LoginRequest loginRequest) throws Exception {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getName(), loginRequest.getPassword()));

		UserDetails userDetails = userService.loadUserByUsername(loginRequest.getName());

		final String jwt = tokenProvider.generateToken((CustomUserDetails) userDetails);

		return new LoginResponse(jwt);
	}

	@GetMapping("/random")
	public RandomStuff randomStuff() {
		return new RandomStuff("JWT Hợp lệ mới có thể thấy được message này");
	}

	@GetMapping("/auth")
	public String process() {
		return "login success";
	}

}
