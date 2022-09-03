package com.oops.bll;

public class TestEmployee {

	public static void main(String[] args) {
		Employee elliotAnderson = new Employee(78,"Elliot","Anderson",6700);
		System.out.println(elliotAnderson);
		//set salary to employee
		elliotAnderson.setSalary(999);
		System.out.println(elliotAnderson);
	
		System.out.println("id is:"+elliotAnderson.getId());
		System.out.println("Employee firstname is: "+elliotAnderson.getfirstName());
		System.out.println("Employee lastname is: "+elliotAnderson.getlastName());
		System.out.println("Employee salary is : "+elliotAnderson.getSalary());
		System.out.println("Employee name is: "+elliotAnderson.getName());
		System.out.println("Employee annual salary is: "+elliotAnderson.getAnnualSalary());
		//raise a employee salary
		System.out.println(elliotAnderson.RaiseSalary(79));
		System.out.println(elliotAnderson);

	}

}
