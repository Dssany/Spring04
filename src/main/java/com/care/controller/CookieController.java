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
	public String myCookie(HttpServletRequest request,HttpServletResponse response,@CookieValue(value="myCookie",required = false)//required = 객체가 존재하지 않아 값이 없으면 널값으로 처리해준다
	Cookie cook,Model model) {
//		Cookie[] cs = request.getCookies();
//		if(cs.length !=0) {
//			for(Cookie c : cs) {
//				System.out.println(c.getValue() + ":" + c.getName());
//			}
//		}
		
		
		
		
		if(cook == null) {
			Cookie cookie = new Cookie("myCookie","쿠키생성");
			cookie.setMaxAge(5);
			response.addCookie(cookie);
			System.out.println("쿠키생성");
			return "cookie";
		}
		
		model.addAttribute("cook",cook.getValue());
		return "cookie";
		
		
		
	}
	
	@RequestMapping("cookie02")
	public String myCookie02(HttpServletResponse response, Model model,
			@CookieValue(value="myCookie",required=false) Cookie cook){
		if(cook != null )
			model.addAttribute("cook",cook.getValue());
		System.out.println(cook);
		return "cookie";
	}
	
	
	@RequestMapping("pop")
	public String popup() {
		return "pop";
	}
	@RequestMapping("cookiechk")
	public String popupclose(HttpServletResponse response) {
		Cookie cooki = new Cookie("cooki", "cooki");
		cooki.setMaxAge(10000);
		response.addCookie(cooki);
		
		return "pop";
	}
	
	
	
	
	
}
