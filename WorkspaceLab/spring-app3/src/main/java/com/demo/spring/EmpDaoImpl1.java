package com.demo.spring;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl1 implements EmpDao {

	public String saveEmp(Employee e) {
		// TODO Auto-generated method stub
		return "saved";
	}

}
