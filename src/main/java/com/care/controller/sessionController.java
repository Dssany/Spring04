package com.care.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sessionController {
	@RequestMapping("makesession")
	public String makeSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("id", "test");
		session.setAttribute("name", "홍길동");
		session.setAttribute("age", "20");
		return "makeSession";
		
	}
	
	@RequestMapping("resultsession")
	public String resultSession() {
		return "resultSession";
	}
	
	@RequestMapping("delsession")
	public String delSession(HttpSession session) {
		session.invalidate();
		return "delSession";
	}
	
	
	
}
