package com.care.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("myCookie","쿠키생성");
		cookie.setMaxAge(5);
		response.addCookie(cookie);
		
		return "cookie";
	}
}
