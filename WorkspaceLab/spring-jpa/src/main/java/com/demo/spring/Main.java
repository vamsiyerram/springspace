package com.demo.spring;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		//EmpService service = ctx.getBean(EmpService.class);

		EmpService service1 = (EmpService) ctx.getBean("app");

		System.out.println(service1.registerEmployee(300, "Yerram1", "Hyderabad", 10000));
		
		java.util.List<Employee> emps=new ArrayList<>();
		
		emps.add(new Employee(206, "A", "Hyderabad", 35000));
		emps.add(new Employee(207, "B", "Hyderabad", 45000));
		emps.add(new Employee(208, "C", "Hyderabad", 55000));
		emps.add(new Employee(204, "D", "Hyderabad", 65000));
		emps.add(new Employee(209, "E", "Hyderabad", 75000));
		
		//service1.saveEmployeeCollection(emps);
		
		//System.out.println(service1.getEmployee(101));

	}

}
