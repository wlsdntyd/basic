package com.jino.basic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jino.basic.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(
			
			User user, // @ModelAttribute("user") User user
			HttpSession session) {
		// 세션은 어디서든지
		session.setAttribute("user", user);
		// 지정된 주소로 이동
		return "redirect:/main";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}