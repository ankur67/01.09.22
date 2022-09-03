package com.oops.bll;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;


	public Employee(int id, String firstName, String lastName, int salary ){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		}
	public int getId() {
		return id;
	}
	public String getfirstName() {
	return firstName;	
	}
	public String getlastName() {
		return lastName;
	}
	public String getName() {
		return firstName+""+lastName;
		
	}
	public int getSalary() {
		return salary;	
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	public int RaiseSalary(int percent) {
		int newsalary=salary+(salary*percent/100);
		return newsalary;
	}

	public String tostring() {
		return "\n id:"+id+"\n name:"+firstName+lastName+"\n salary:"+salary;
		
	}

}
