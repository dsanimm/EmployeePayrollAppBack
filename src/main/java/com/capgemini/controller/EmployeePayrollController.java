package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.EmployeePayrollDTO;
import com.capgemini.dto.ResponseDTO;
import com.capgemini.model.EmployeePayrollData;
import com.capgemini.service.EmailService;
import com.capgemini.service.IEmployeePayrollService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	@Autowired
	private IEmployeePayrollService employeePayrollService;
	@Autowired
	private EmailService emailService;

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = null;
		empDataList = employeePayrollService.getEmployeeData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Success !", empDataList);
		
		//System.out.println("heehoo");
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/getall")
	public List<EmployeePayrollData> getAllEmployeePayrollList() {
		return employeePayrollService.getEmployeeData();
	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.getEmployeePayrollDataById(empId);
		ResponseDTO respDTO = new ResponseDTO("Get Call Success For Id : " + empId, empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully !", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId,
			@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData empData = null;
		empData = employeePayrollService.updateEmployeePayrollData(empId, employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully !", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		employeePayrollService.deleteEmployeePayrollDataById(empId);
		ResponseDTO respDTO = new ResponseDTO("Deleted Employee Payroll Data Successfully !", "Deleted Id : " + empId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
