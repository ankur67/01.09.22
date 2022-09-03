package com.oops.books;


public class TestBook {

	public static void main(String[] args) {
		
		Author ajay=new Author("ajay k panday",'m',"ajaykpanday567@gmail.com");
		Book nobel=new Book("i wish i could tell her",250,5,ajay);
		System.out.println(nobel);
	}

}
