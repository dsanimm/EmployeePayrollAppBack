package com.capgemini.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}
