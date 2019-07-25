package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.demo.EmployeeDAO;
import com.cg.demo.EmployeeService;

@Configuration //This is Replacement of SPRING.XML
@ComponentScan("com.cg.demo")//
public class AppConfig {

	/*@Bean //Define a Bean
	//syntax :public<ClassName> <BeanID> {.....}
	
	public EmployeeDAO dao(){
		return new EmployeeDAO();
		
	}
	@Bean
	public EmployeeService service()
	{
		EmployeeService service=new EmployeeService();
		service.setDao(dao()); //Setter Injection with Java Syntax!!
		return service;*/
	}

