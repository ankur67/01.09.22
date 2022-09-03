package com.oops.bll;

public class InvoiceItem {
	private String id;
	private String desc;
	private int quantity;
	private double unitPrice;
	public InvoiceItem() {
		
	}
	 public InvoiceItem(String id,String desc,int quantity,double unitPrice) {
		 this.id=id;
		 this.desc=desc;
		 this.quantity=quantity;
		 this.unitPrice=unitPrice;
	 }
	 public String getID() {
	 return id;	 
	 }
	 public String getDesc() {
		 return desc;
	 }
	
	 

	 public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal() {
		 return unitPrice*12;
	 }
	 public String tostring() {
		 return "id:"+id+"\n desc:"+desc+"\nquantity:"+quantity+"\n unitPrice:"+unitPrice;
	 }
}
