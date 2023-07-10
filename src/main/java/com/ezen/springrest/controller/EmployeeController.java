package com.ezen.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/emplotee")
@Controller
public class EmployeeController {
	@GetMapping("/event")
	public void event(Model model) {
		
		// DB에서 모든 사원을 조회하여 이벤트 페이지에 표 형식으로 출력해주기
		// (Mybatis를 사용할 것)
	}
}
