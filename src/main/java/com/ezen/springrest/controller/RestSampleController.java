package com.ezen.springrest.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.EmployeeDTO;
import lombok.extern.log4j.Log4j;
@RequestMapping("/restful")
@RestController
@Log4j
public class RestSampleController {
	// @RestControoler를 추가한 컨트롤러는 일반 스트링 리턴
	// 내부 메서드의 리턴 타입의 이미가 @Controller와 달라진다 경로값 리턴
	
	@GetMapping(value="/value1", produces="text/plain; charset=UTF-8")
	public String value1() {
		log.info("hello");
		return "Hello, world! 한글도 잘 갑니다";
	}
	
	@GetMapping(value="/value2", produces="text/html; charset=UTF-8")
	public String value2() {
		log.info("hello");
		return "<h1>Hello, world! 한글도 잘 갑니다</h1>";
	
	}@GetMapping(value="/value3", produces="application/json; charset=UTF-8")
	public String value3() {
		EmployeeDTO emp = new EmployeeDTO();

		emp.setFirst_name("steven");
		emp.setLast_name("king");
		emp.setSalary(12000);
		
		JSONObject obj = new JSONObject();
		
		obj.put("first_name", emp.getFirst_name());
		obj.put("last_name", emp.getLast_name());
		obj.put("salary", emp.getSalary());
		
		return obj.toJSONString();
	}		
	
	@GetMapping(value = "/employee/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDTO emp1() {
		EmployeeDTO e = new EmployeeDTO();
			
		e.setFirst_name("철수");
		e.setLast_name("김");
		e.setSalary(5000);
			
		return e;
	}
	
	@GetMapping(value = "/employee/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public EmployeeDTO emp2() {
		EmployeeDTO e = new EmployeeDTO();
			
		e.setFirst_name("철수");
		e.setLast_name("김");
		e.setSalary(5000);
			
		return e;
	}
	
	@GetMapping(value="/resp1")
	public ResponseEntity<String> resp1(){
		
		// ResponsEntity.ok() : 상태코드 200인 응답 인스턴스를 생성한다 (마저 만들어야 함)
		ResponseEntity<String> myResponse = ResponseEntity
				.ok()
				.contentType(MediaType.TEXT_HTML)
				.body("<h1>My Response</h1>");
		// ResponseEntity.ok(T body) : 상태코드 200의 응답 인스턴스를 반환한다
		
	 // 	ResponseEntity<String> myResponse = ResponseEntity.ok("<h1>data~</h1>");
			
		return myResponse;
	}
	@GetMapping(value="/resp2")
	public ResponseEntity<String> resp2(){
		ResponseEntity<String> myResponse = ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.contentType(MediaType.parseMediaType("text/plain;charset=UTF-8"))
				.body("<h3>한글 잘 갈듯</h3>");
	
		return myResponse;
	}
	
	@GetMapping(value="/resp3")
	public ResponseEntity<String> resp3() throws ParseException{
		ResponseEntity<String> myResponse = ResponseEntity
				.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(new JSONParser()
					.parse("{\"name\":\"박민수\",\"age\":22}")
					.toString());
	
		return myResponse;
	}
}
