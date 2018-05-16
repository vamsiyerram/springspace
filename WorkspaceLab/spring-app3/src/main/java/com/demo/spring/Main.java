package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		EmpService service = ctx.getBean(EmpService.class);

		//EmpService service1 = (EmpService) ctx.getBean("app");

		System.out.println(service.registerEmployee(100, "Vamsi", "Hyd", 10000));
	}

}
