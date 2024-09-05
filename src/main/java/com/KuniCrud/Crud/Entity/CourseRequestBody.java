package com.KuniCrud.Crud.Entity;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class CourseRequestBody {

	
	String employeeName;
	double salary;
	String designation;
	String employementType;


	public String getEmployeeName() {
		return employeeName;
	}
	public Double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public String getEmployementType() {
		return employementType;
	}

}
