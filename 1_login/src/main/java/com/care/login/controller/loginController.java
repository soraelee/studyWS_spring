package com.care.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	@GetMapping("login")
	public String login() {
		System.out.println("�α��� ������");
		
		return "login/login_form";
	}
	
	@PostMapping("login_check")
	public String loginChk(
			@RequestParam String id,
			@RequestParam String pwd
			) {
		
		
		return "home";
	}
}
