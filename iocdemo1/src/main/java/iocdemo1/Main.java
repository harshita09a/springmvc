package iocdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//Address add = context.getBean("address", Address.class);

		// Get Bean of Type Employee AND ID emp
		Employee emp = context.getBean("emp", Employee.class);

		// Get Bean with ID emp, but DON'T assign Type
		Employee emp2 = (Employee) context.getBean("emp");
System.out.println(emp.getAddress().getCity());
		//System.out.println("Emp :" + emp.hashCode());
		//System.out.println("Emp2 :" + emp2.hashCode());
		//System.out.println("First Phone: "+emp.getContacts().get(0));
	}
}
