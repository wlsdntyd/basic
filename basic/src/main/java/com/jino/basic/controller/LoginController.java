package com.jino.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String loginPost(
			@RequestParam("id") String id,
			@RequestParam("pw") String pw) {
		
		String dbID = "boot";
		String dbPW = "1234";
		
		if(dbID.equals(id) && dbPW.equals(pw)) {
			return "로그인 성공";
		}
			
		return "로그인 실패";
	}
}



