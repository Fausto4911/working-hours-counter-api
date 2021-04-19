package com.working.hour.counter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.working.hour.counter.model.Register;
import com.working.hour.counter.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@GetMapping(value = "/register")
	public List<Register> getAllRegister() {
		return registerService.findAllRegisters();
	}

}
