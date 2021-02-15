package com.capgemini.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.dto.EmployeePayrollDTO;


@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int employeeId;
	@Column(name = "Name")
	private String name;
	@Column(name = "profilePic")
	private String profilePic;
	@Column(name = "gender")
	private String gender;
	@Column(name = "department")
	private String[] department;
	@Column(name = "salary")
	private double salary;
	@Column(name = "note")
	private String note;
	@Column(name = "start")
	private String startDate;


	public EmployeePayrollData() {

	}

	public EmployeePayrollData(EmployeePayrollDTO employeePayrollDto) {
		super();
		this.name = employeePayrollDto.name;
		this.salary = employeePayrollDto.salary;
		this.profilePic = employeePayrollDto.profilePic;
		this.gender = employeePayrollDto.gender;
		this.department = employeePayrollDto.department;
		this.note = employeePayrollDto.note;
		this.startDate =  employeePayrollDto.startDate;
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDto) {
		super();
		this.employeeId = employeeId;
		this.name = employeePayrollDto.name;
		this.salary = employeePayrollDto.salary;
		this.profilePic = employeePayrollDto.profilePic;
		this.gender = employeePayrollDto.gender;
		this.department = employeePayrollDto.department;
		this.note = employeePayrollDto.note;
		this.startDate =  employeePayrollDto.startDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getDepartment() {
		return department;
	}

	public void setDepartment(String[] department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
}