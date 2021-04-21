package com.working.hour.counter.CustomException;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(Long id) {
		 super("Could not find employee " + id);
	}
}
