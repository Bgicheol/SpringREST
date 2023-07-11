package com.ezen.springrest.service;

import java.util.List;

import com.ezen.springrest.dto.Employee;

public interface EmployeeEventService {
	List<Employee> initEventPage();
	
	List<Employee> getRandomEmployees(int size);

	
}
