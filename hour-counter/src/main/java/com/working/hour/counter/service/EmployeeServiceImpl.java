package com.working.hour.counter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.working.hour.counter.model.Employee;
import com.working.hour.counter.repositoy.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Employee> findAll() {
		return (List<Employee>) this.employeeRepository.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Employee findById(Long id) {
		return this.employeeRepository.findById(id).get();
	}


	@Override
	@Transactional(readOnly = true)
	public List<Employee> findAllByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@Transactional(readOnly = true)
	public List<Employee> findAllByBranch(String branch) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee save(Employee employee) {
		Employee saved = this.employeeRepository.save(employee);
		return saved;
	}
	

}
