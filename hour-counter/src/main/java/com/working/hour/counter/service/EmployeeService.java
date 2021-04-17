package com.working.hour.counter.service;

import java.util.List;

import com.working.hour.counter.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee findById(Long id);
	List<Employee> findAllByDepartment(String department);
	List<Employee> findAllByBranch(String branch);

}
