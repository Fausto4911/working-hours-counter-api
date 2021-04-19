package com.working.hour.counter.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity(name = "employee")
@Table(name = "employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;

	@NotNull
	@Column(name = "last_name")
	private String LastName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id")
	private Department department;

	@Temporal(TemporalType.DATE)
	@Column(name = "create_at")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date createAt;

	public Employee() {

	}

	public Employee(Long id, String name, String lastName, Department department) {
		this.id = id;
		this.name = name;
		LastName = lastName;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", LastName=" + LastName + ", department=" + department
				+ ", createAt=" + createAt + "]";
	}

}
