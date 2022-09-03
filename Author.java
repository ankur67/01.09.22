package com.oops.bll;

public class Author {
	private String firstName;
	private String lastName;
	private String bookName;
	
	public Author() {

}
	public Author(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public Author(String firstName, String lastName, String bookName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.bookName=bookName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public void setbookName(String bookName) {
		this.bookName=bookName;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getbookName() {
		return bookName;
	}
	
	public String tostring() {
	
		return "firstName:"+firstName+"\n lastName:"+lastName+"\nbookName:"+bookName;
	}
	
	

}
