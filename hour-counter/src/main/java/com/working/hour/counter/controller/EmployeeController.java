package com.working.hour.counter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.working.hour.counter.model.Employee;
import com.working.hour.counter.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.findAll();
	}

	@GetMapping(value = "/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return this.employeeService.findById(id);
	}
	
	@PostMapping(value="/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.employeeService.save(employee);
	}
	
	@PutMapping(value="/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Long id) {
		return this.employeeService.update(employee, id);
	}
	
	@DeleteMapping("/employees/{id}")
	  void deleteEmployee(@PathVariable Long id) {
	    this.employeeService.delete(id);
	  }

}
