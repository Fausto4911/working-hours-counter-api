package com.working.hour.counter.repositoy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.working.hour.counter.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
