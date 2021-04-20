package com.working.hour.counter;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.working.hour.counter.model.Department;
import com.working.hour.counter.model.Employee;
import com.working.hour.counter.model.Register;
import com.working.hour.counter.repositoy.DepartmentRepository;
import com.working.hour.counter.repositoy.EmployeeRepository;
import com.working.hour.counter.repositoy.RegisterRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(DepartmentRepository departmentRepo, RegisterRepository registerRepo, EmployeeRepository employeeRepo) {
	  Department department1 = new Department();
	  department1.setName("Administracion");
	  department1.setCreateAt(new Date());
	  Department department2 = new Department();
	  department2.setName("Limpieza");
	  department2.setCreateAt(new Date());
	  Department department3 = new Department();
	  department3.setName("Departamento de Ebanisteria");
	  department3.setCreateAt(new Date());
	  Department department4 = new Department();
	  department4.setName("Departamento de corte");
	  department4.setCreateAt(new Date());
	  Department department5 = new Department();
	  department5.setName("Departamento de ensamble");
	  department5.setCreateAt(new Date());
	  List<Department> departmentList = new ArrayList<>();
	  departmentList.add(department1);
	  departmentList.add(department2);
	  departmentList.add(department3);
	  departmentList.add(department4);
	  departmentList.add(department5);
	  departmentRepo.saveAll(departmentList);
	  
	  Employee employee1= new Employee();
	  employee1.setName("Fausto");
	  employee1.setLastName("Torres");
	  employee1.setDepartment(department1);
	  employee1.setCreateAt(new Date());
	  Employee employee2= new Employee();
	  employee2.setName("Nahara");
	  employee2.setLastName("Rosario");
	  employee2.setDepartment(department2);
	  employee2.setCreateAt(new Date());
	  Employee employee3= new Employee();
	  employee3.setName("Rumarda");
	  employee3.setLastName("Peluca");
	  employee3.setDepartment(department3);
	  employee3.setCreateAt(new Date());
	  Employee employee4= new Employee();
	  employee4.setName("Belkis");
	  employee4.setLastName("Ajo");
	  employee4.setDepartment(department4);
	  employee4.setCreateAt(new Date());
	  Employee employee5= new Employee();
	  employee5.setName("Fred");
	  employee5.setLastName("Jefe");
	  employee5.setDepartment(department5);
	  employee5.setCreateAt(new Date());
	  List<Employee> employeeList = new ArrayList<>();
	  employeeList.add(employee1);
	  employeeList.add(employee2);
	  employeeList.add(employee3);
	  employeeList.add(employee4);
	  employeeList.add(employee5);
	  employeeRepo.saveAll(employeeList);
	  
	  Register register1 = new Register();
	  register1.setEmployee(employee1);
	  register1.setDay(new Date());
	  register1.setCheckIn(new Date());
	  register1.setCheckOut(new Date());
	  register1.setCreateAt(new Date());
	  Register register2 = new Register();
	  register2.setEmployee(employee2);
	  register2.setDay(new Date());
	  register2.setCheckIn(new Date());
	  register2.setCheckOut(new Date());
	  register2.setCreateAt(new Date());
	  Register register3 = new Register();
	  register3.setEmployee(employee3);
	  register3.setDay(new Date());
	  register3.setCheckIn(new Date());
	  register3.setCheckOut(new Date());
	  register3.setCreateAt(new Date());
	  Register register4 = new Register();
	  register4.setEmployee(employee4);
	  register4.setDay(new Date());
	  register4.setCheckIn(new Date());
	  register4.setCheckOut(new Date());
	  register4.setCreateAt(new Date());
	  Register register5 = new Register();
	  register5.setEmployee(employee1);
	  register5.setDay(new Date());
	  register5.setCheckIn(new Date());
	  register5.setCheckOut(new Date());
	  register5.setCreateAt(new Date());
	  List<Register> registerList = new ArrayList<>();
	  registerList.add(register1);
	  registerList.add(register2);
	  registerList.add(register3);
	  registerList.add(register4);
	  registerList.add(register5);
	  registerRepo.saveAll(registerList);
	  
	 
	  

    return args -> {
      log.info("Preloading " + employeeList);
      log.info("Preloading " + registerList);
      log.info("Preloading " + departmentList);;
    };
  }
}