package com.ezen.springrest.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Integer salary;
	private Date hire_date;
	private Integer department_id;
}
