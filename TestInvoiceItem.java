package com.oops.bll;

public class TestInvoiceItem {

	public static void main(String[] args) {

				InvoiceItem item1=new InvoiceItem("474","Laptop",21,5800);
				System.out.println(item1);
				
				//getting invoice id
				System.out.println("\n id;"+item1.getID());
				System.out.println("\n desc:"+item1.getDesc());
				System.out.println("\n qty:"+item1.getQuantity());
				//print all the invoice details
				System.out.println("\n details:"+item1.tostring());
				//find total price
				System.out.println("\n total price:"+item1.getTotal());
				//using setters
				item1.setQuantity(47);
				System.out.println(item1);
				

	}

}
