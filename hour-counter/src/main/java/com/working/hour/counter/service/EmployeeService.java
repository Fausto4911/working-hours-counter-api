package com.working.hour.counter.service;

import java.util.List;

import com.working.hour.counter.CustomException.EmployeeNotFoundException;
import com.working.hour.counter.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee findById(Long id) throws EmployeeNotFoundException;
	List<Employee> findAllByDepartment(String department);
	List<Employee> findAllByBranch(String branch);
	Employee save(Employee employee);
	Employee update(Employee employee, Long id);
	void delete(Long id); 

}
