package com.example.demo.entity;


/**
 *@author sujith
 *@created 21-April-2023
*
 */

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Employee")
public class Employee {

	
	@Id
	@Column(name = "Employee_ID")
	private long employeeID;

	@Column(name = "Employee_Name")
	private String employeeName;

	@Column(name = "Date_Of_Birth")
	private LocalDate dateOfBirth;

	public long getEmployeeID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

}
