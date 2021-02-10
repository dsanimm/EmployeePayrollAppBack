package com.capgemini.dto;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exceptions.ValidationException;

public class EmployeePayrollDTO {
		public String name;
		public String profilePic;
		public String gender;
		public String[] department;
		public double salary;
		public String note;
		public String startDate;

		public EmployeePayrollDTO(String name, String profilePic, String gender, String[] department, double salary,
				String note, String startDate) throws ValidationException {
			super();
			this.setName(name);
			this.profilePic = profilePic;
			this.gender = gender;
			this.department = department;
			this.salary = salary;
			this.note = note;
			this.setStartDate(startDate);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) throws ValidationException {
			String namePattern = "^[A-Z]{1}[a-zA-Z\\s]{2,}$";
			Pattern p1 = Pattern.compile(namePattern);
			Matcher matcher = p1.matcher(name);
			boolean b = matcher.matches();
			if (!b)
				throw new ValidationException("Name is Incorrect !");
			else
				this.name = name;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) throws ValidationException {
			this.startDate = startDate;
		}

		@Override
		public String toString() {
			return "";
		}

	}

