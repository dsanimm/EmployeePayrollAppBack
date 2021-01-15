package com.capgemini;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.model.EmployeePayrollData;
import com.capgemini.service.IEmployeePayrollService;
import static org.junit.Assert.assertEquals;


@SpringBootTest
class EmployeePayrollAppApplicationTests {
	@Autowired
	private IEmployeePayrollService employeePayrollService;
	
	@Test
	public void No_of_employees_match() {
		List<EmployeePayrollData> list =employeePayrollService.getEmployeeData();
		Assert.assertEquals(3, list.size());
	}

}
