package com.oops.bll;

public class TestAuthor {

	public static void main(String[] args) {
		Author a1=new Author();
		System.out.println(a1);

	Author a2= new Author("ramesh","singh");
	
	Author a3=new Author("vidya","sinha","storybook");
	System.out.println(a3);
	
	System.out.println("\n firstname is:"+a2.getFirstName());
	System.out.println("\n lastname is :"+a2.getLastName());
	System.out.println("\n bookname is:"+a2.getBookName());
	
	System.out.println("\n detail"+a3.tostring());
	
	System.out.println("\n firstname:"+a1.getFirstName());
	System.out.println("\n lastname:"+a1.getLastName());
	System.out.println("\n bookname:"+a1.getBookName());
	
	Author a4;
	a4= new Author();
	System.out.println("\n reference:"+a4.tostring());
	
	
	
	}

}
