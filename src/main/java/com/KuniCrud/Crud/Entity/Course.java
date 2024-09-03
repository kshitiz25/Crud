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
	private String EmployeeName;
	@Column
	private Double Salary;
	@Column
	private String Designation;
	@Column(name ="emp_Type ")
	private String EmployementType;
	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.EmployeeName = name2;
		
	}
	public void setPrice(double price2) {
		// TODO Auto-generated method stub
		this.Salary= price2;
		
	}
	public void setDesignation(String designation2) {
		// TODO Auto-generated method stub
		this.Designation= designation2;
		
	}
	public void setEmployementType(String employementType2) {
		// TODO Auto-generated method stub
		this.EmployeeName = employementType2;
		
	}

}
