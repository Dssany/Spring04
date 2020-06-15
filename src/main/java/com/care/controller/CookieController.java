package com.care.controller;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response,
@CookieValue(value="myCookie", required=false) Cookie cook,
								HttpServletRequest request) {
		Cookie[] cs = request.getCookies();
		if(cs.length != 0) {
			for(Cookie c : cs) {
			System.out.println(c.getValue()+":"+c.getName());
			}
		}
		System.out.println("cook : "+cook);
		Cookie cookie = new Cookie("myCookie","쿠키생성");
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		return "cookie";
	}
	
	@RequestMapping("cookie01")
	public String myCookie(HttpServletResponse response, Model model,
			@CookieValue(value="myCookie",required=false) Cookie cook){
		if(cook == null ) {
			System.out.println("쿠키 생성");
			cook = new Cookie("myCookie","나의쿠키");
			cook.setMaxAge(5);
			response.addCookie(cook);
			return "cookie";
		}
		model.addAttribute("cook",cook.getValue());
		return "cookie";
	}
	@RequestMapping("popup")
	public String popup() {
		return "popup";
	}
	
	@RequestMapping("cookie02")
	public String myCookie02(HttpServletResponse response, Model model,
			@CookieValue(value="myCookie",required=false) Cookie cook){
		if(cook != null )
			model.addAttribute("cook",cook.getValue());
		System.out.println(cook);
		return "cookie";
	}
	@RequestMapping("cookieChk")
	public void cookieChk(HttpServletResponse response) {
		Cookie cook = new Cookie("myCookie", "나의쿠키");
		cook.setMaxAge(10000);
		cook.setPath("/");
		response.addCookie(cook);
//		return "popup";
	}


	
}












