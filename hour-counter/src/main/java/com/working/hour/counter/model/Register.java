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

@Entity(name = "register")
@Table(name = "register")
public class Register implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1868836376494830099L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id")
	private Employee employee;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date day;

	@Column(name = "check_in")
	@Temporal(TemporalType.TIME)
	private Date checkIn;

	@Column(name = "check_out")
	@Temporal(TemporalType.TIME)
	private Date checkOut;

	@Temporal(TemporalType.DATE)
	@Column(name = "create_at")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date createAt;

	public Register() {

	}

	public Register(Long id, Employee employee, Date checkIn, Date checkOut, Date day, Date createAt) {
		super();
		this.id = id;
		this.employee = employee;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.day = day;
		this.createAt = createAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", employee=" + employee + ", day=" + day + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + ", createAt=" + createAt + "]";
	}

}
