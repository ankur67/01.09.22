package com.oops.books;
import com.oops.books.Author;

public class Book {
	private String bookName;
	private int price;
	private int quantity;
	private Author author;
	
	
	
	public Book(String bookName, int price, int quantity, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.quantity = quantity;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName.toUpperCase()+ "," + author
				 + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
