package com.cg.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//This class is REPLACEMENT for web.xml
public class MyInitializer implements WebApplicationInitializer{

  
  public void onStartup(ServletContext container) throws ServletException {
      AnnotationConfigWebApplicationContext context = 
              new AnnotationConfigWebApplicationContext();
 		context.setServletContext(container);

      context.register(AppConfig.class);
      //container.addListener(new ContextLoaderListener());	
      System.out.println("Initializing the Web Context");
	    ServletRegistration.Dynamic dispatcher = container.addServlet(
				"dispatcher",new DispatcherServlet(context)
	    );
	    dispatcher.setLoadOnStartup(1);
	    dispatcher.addMapping("/");
  }
  
}