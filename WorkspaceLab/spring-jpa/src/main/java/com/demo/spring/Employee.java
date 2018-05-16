package com.demo.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class Employee {

	@Id
	@Column(name="EMPNO")
	private Integer empId;
	
	@Column(name="NAME")
	private String empName;
	
	@Column(name="ADDRESS")
	private String city;
	
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String city, double salary) {
		this.empId = id;
		this.empName = name;
		this.city = city;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
