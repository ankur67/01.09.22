package com.oops.bll;

public class TestAuthor {

	public static void main(String[] args) {
		Author author=new Author();
		System.out.println(author);

	Author kailashMishra= new Author("Kailash","Mishra");
	
	Author contentWriter=new Author("Sikha","Dayal","Content Writer");
	
	System.out.println(contentWriter);
	
	System.out.println("\n firstname is:"+kailashMishra.getFirstName());
	System.out.println("\n lastname is :"+kailashMishra.getLastName());
	System.out.println("\n bookname is:"+kailashMishra.getBookName());
//	
	System.out.println("\n Content Writer details: "+contentWriter);
//	
	System.out.println("\n Author firstname: "+author.getFirstName());
	System.out.println("\n Author lastname: "+author.getLastName());
	System.out.println("\n Author bookname: "+author.getBookName());
	
	Author author2;
	author2= new Author();
	System.out.println("\n Author-2 reference:"+author2.toString());
	
	
	
	}

}
