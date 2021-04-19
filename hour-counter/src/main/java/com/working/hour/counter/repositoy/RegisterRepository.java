package com.working.hour.counter.repositoy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.working.hour.counter.model.Register;

@Repository
public interface RegisterRepository extends CrudRepository<Register, Long> {

}
