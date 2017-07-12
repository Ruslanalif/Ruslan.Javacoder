package com.xsis.ruslan.javacode;

public class Employee {

	String id;
	String nama;
	String address;
	Double salary;
	
	public void info(){
		System.out.println("Name : " + this.nama);
		System.out.println("Addres : " + this.address);
		System.out.println("Salary : " + this.salary);
	} 
}
