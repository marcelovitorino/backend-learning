package com.example.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class EmployeeModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId")
	private Long empId;
	
	@Column(name = "name", nullable = true)
	private String name;

	@Column(name = "department", nullable = true)
	private String department;

	@Column(name = "salary", nullable = true)
	private Long salary;

	
	
	public EmployeeModel(){
		
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {

		return this.empId + " | " + this.name + " | " + this.department + " | " + this.salary;
	}
}
