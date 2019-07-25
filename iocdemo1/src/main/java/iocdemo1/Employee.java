package iocdemo1;

import java.util.List;

public class Employee {
	private String firstname,lastname;
	private double salary;
	private String designation;
	private Address address;

	public Employee(String firstname, String lastname, double salary, String designation, Address address,
			List<String> contacts) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
		this.contacts = contacts;
	}
	private List<String> contacts;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

}
