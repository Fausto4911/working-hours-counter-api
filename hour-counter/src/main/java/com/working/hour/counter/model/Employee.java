package com.working.hour.counter.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity(name="employee")
@Table(name="employee")
public class Employee implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	@Column(name="last_name")
	private String LastName;
	
	@NotNull
	private String branch;
	
	@NotNull
	private String department;
	
	public Employee() {
		
	}
	
	
	public Employee(Long id, String name, String lastName, String branch, String department) {
		this.id = id;
		this.name = name;
		LastName = lastName;
		this.branch = branch;
		this.department = department;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", LastName=" + LastName + ", branch=" + branch
				+ ", department=" + department + "]";
	}
	
		

}
