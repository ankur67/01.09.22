package com.oops.bll;

public class TestAuthor {

	public static void main(String[] args) {
		Author author=new Author();
		System.out.println(author);

	Author kailashMishra= new Author("Kailash","Mishra");
	
	Author contentWriter=new Author("Sikha","Dayal","Content Writer");
	
	System.out.println(contentWriter);
	
	System.out.println("\n firstname is:"+kailashMishra.getfirstName());
	System.out.println("\n lastname is :"+kailashMishra.getlastName());
	System.out.println("\n bookname is:"+kailashMishra.getbookName());
//	
	System.out.println("\n Content Writer details: "+contentWriter.tostring());
//	
	System.out.println("\n Author firstname: "+author.getfirstName());
	System.out.println("\n Author lastname: "+author.getlastName());
	System.out.println("\n Author bookname: "+author.getbookName());
	
	Author author2;
	author2= new Author();
	System.out.println("\n Author-2 reference:"+author2.tostring());
	
	
	
	}

}
