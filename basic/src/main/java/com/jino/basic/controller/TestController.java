package com.jino.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Shift + Ctrl + O : ��ü import

@RestController
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "<h1>Hello~</h1>";
	}
}
