package com.working.hour.counter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.working.hour.counter.model.Register;
import com.working.hour.counter.repositoy.RegisterRepository;

@Repository
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository repository;

	@Override
	public List<Register> findAllRegisters() {
		return (List<Register>) this.repository.findAll();
	}

}
