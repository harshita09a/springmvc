package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.app.AppConfig;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
EmployeeDAO dao=context.getBean("dao",EmployeeDAO.class);
EmployeeService service=context.getBean(EmployeeService.class);

System.out.println("dao: "+dao);
System.out.println("service: "+service);
	}

}
