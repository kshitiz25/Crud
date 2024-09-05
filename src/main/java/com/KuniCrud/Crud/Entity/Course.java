package com.KuniCrud.Crud.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
//@Getter
//@Setter
@Entity
@Table(name= "Course_DTLS")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name ="empName")
	private String employeeName;
	@Column
	private Double salary;
	@Column
	private String designation;
	@Column(name ="emp_Type")
	private String employementType;


	
	
	public Integer getId() {
		return id;
	}

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

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}
	
}
