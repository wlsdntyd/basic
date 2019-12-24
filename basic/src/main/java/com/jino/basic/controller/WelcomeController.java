package com.jino.basic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jino.basic.model.Member;


@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	//                    HTML Template 에게 넘겨줄 데이터
	public String welcome(Model model) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		model.addAttribute("key1", list);
		
		Map<String, Object> map = new HashMap<>();
		map.put("a", "value a");
		map.put("b", "value b");
		model.addAttribute("key2", map);
		
		Member member = new Member();
		member.setUserId("a");
		member.setName("spring");
		member.setUserPassword("1234");
		model.addAttribute("member", member);
		
		model.addAttribute("message", "thymeleaf");
		return "welcome";
	}
}
