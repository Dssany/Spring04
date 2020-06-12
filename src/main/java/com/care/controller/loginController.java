package com.care.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
	//@RequestMapping(value="login", method=RequestMethod.GET)
	@GetMapping //4.3.4 버전이상부터가능하다
	public String loginGet() {
		
		return "login";
	}
}
