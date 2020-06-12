package com.care.mvc_ex02;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //경로를 받아주는 역할
public class MyController {
	
	public MyController() {
	System.out.println("=====객체가 만들어 지나요=====");
	}
	
	@RequestMapping("index")
	public String memberIndex() {
		return "member03/index";
	}
}



//@Component //의미없는 (객체)를 생성
//@Repository //저장공간 보통 dao 빈을 생성
//@Service// 서비스 빈을 생성