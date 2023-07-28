package dto;


import java.util.Date; 

public class Order {
	private String ordersid ;
	private String orderuserid; 
	
	public String getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(String ordersid) {
		this.ordersid = ordersid;
	}
	public String getOrderuserid() {
		return orderuserid;
	}
	public void setOrderuserid(String orderuserid) {
		this.orderuserid = orderuserid;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	private Date orderdate;
	private int totalprice; 
	private int orderquantity;
	private String ordersingleprice;
	private String deliveryfee; 
	private String orderfoodname;

	public int getOrderquantity() {
		return orderquantity;
	}
	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}
	public String getOrdersingleprice() {
		return ordersingleprice;
	}
	public void setOrdersingleprice(String ordersingleprice) {
		this.ordersingleprice = ordersingleprice;
	}
	public String getDeliveryfee() {
		return deliveryfee;
	}
	public void setDeliveryfee(String deliveryfee) {
		this.deliveryfee = deliveryfee;
	}
	public String getOrderfoodname() {
		return orderfoodname;
	}
	public void setOrderfoodname(String orderfoodname) {
		this.orderfoodname = orderfoodname;
	} 
	private String orderaddress;

	public String getOrderaddress() {
		return orderaddress;
	}
	public void setOrderaddress(String orderaddress) {
		this.orderaddress = orderaddress;
	}


}
