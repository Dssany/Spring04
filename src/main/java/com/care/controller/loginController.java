package com.care.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	//@RequestMapping(value="login", method=RequestMethod.GET)
	@GetMapping //4.3.4 버전이상부터가능하다
	public String loginGet() {
		return "login/login";
	}
	
	
	
	@PostMapping
	public String chkuser(@RequestParam(required = false) String id,@RequestParam(required = false) String pw,HttpSession session) {
		String saveId="1",savePw="1",nickName="홍길동";
		if(saveId.equals(id) && savePw.equals(pw)){
			session.setAttribute("loginUser", nickName);
			session.setMaxInactiveInterval(20);
			return "login/main";
		}else {
			return "redirect:login";
		}
				
	}
	
	@GetMapping("logout")
	public String logout(HttpSession se) {
		se.invalidate();
		return "login/logout";
	}
	
	@GetMapping("login")
	public String loginchk(HttpSession session) {
		session.getAttribute("loginUser");
		
		return "login/login";
	}
	@GetMapping("main")
	public String main(HttpSession session) {
		
		return "login/main";
	}
	
}
