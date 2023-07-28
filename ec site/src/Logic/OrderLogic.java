package Logic;


import java.sql.SQLException;
import java.util.Date;

import dao.orderDAO;
import dto.Order;

public class OrderLogic {
	public Order process(String Ordersid, String Orderuserid, Date Orderdate, int Totalprice,int Orderquantity,String Ordersingleprice,String Deliveryfee,String Orderfoodname,String Orderaddress) throws SQLException {
		Order Orderes = new Order();
		Orderes.setOrdersid(Ordersid);
		Orderes.setOrderuserid(Orderuserid);
		Orderes.setOrderdate(Orderdate);
		Orderes.setTotalprice(Totalprice);
		Orderes.setOrderquantity(Orderquantity);
		Orderes.setOrdersingleprice(Ordersingleprice);
		Orderes.setDeliveryfee(Deliveryfee);
		Orderes.setOrderfoodname(Orderfoodname);
		Orderes.setOrderaddress(Orderaddress);


		orderDAO adao = new orderDAO();
		int r = adao.insert(Orderes);
		return Orderes;
	}
	

}

