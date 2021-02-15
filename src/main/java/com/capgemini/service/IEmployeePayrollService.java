package com.capgemini.service;

import java.util.List;

import com.capgemini.dto.EmployeePayrollDTO;
import com.capgemini.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeeData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDto);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empDto);

	void deleteEmployeePayrollDataById(int empId);
}
