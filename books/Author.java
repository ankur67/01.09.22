package com.oops.books;

public class Author {
	private String name;
	private char gender;
	private String email;
	
	public Author(String name, char gender, String email) {
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Author [name=" + name.toUpperCase() + ", gender=" + String.valueOf(gender).toUpperCase() + ", email=" + email.toLowerCase() + "]";
	}
	
	

	
	

}
