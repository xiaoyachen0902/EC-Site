package dto;

public class Orderdetail {
	
private String order_id;
private String foodorderid ;
private int orderquantity ;
private int orderprice ;

public String getOrder_id() {
	return order_id;
}
public void setOrder_id(String order_id) {
	this.order_id = order_id;
}
public String getFoodorderid() {
	return foodorderid;
}
public void setFoodorderid(String foodorderid) {
	this.foodorderid = foodorderid;
}
public int getOrderquantity() {
	return orderquantity;
}
public void setOrderquantity(int orderquantity) {
	this.orderquantity = orderquantity;
}
public int getOrderprice() {
	return orderprice;
}
public void setOrderprice(int orderprice) {
	this.orderprice = orderprice;
}

}
