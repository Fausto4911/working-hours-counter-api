package com.working.hour.counter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.working.hour.counter.model.Employee;
import com.working.hour.counter.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.findAll();
	}

}
