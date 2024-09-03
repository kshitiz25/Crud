package com.KuniCrud.Crud.Entity;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class CourseRequestBody {

	String EmployeeName;
	double Salary;
	String Designation;
	String EmployementType;

	public String getEmployeeName() {
		return EmployeeName;
	}

	public double getSalary() {
		return Salary;
	}

	public String getDesignation() {
		return Designation;
	}

	public String getEmployementType() {
		return EmployementType;
	}

}
