package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Order;

public class orderDAO {
	public int insert(Order order)  throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "INSERT INTO ORDERS(ORDERSID, ORDERUSERID, ORDERDATE, TOTALPRICE,ORDERQUANTITY,ORDERSINGLEPRICE,DELIVERYFEE,ORDERFOODNAME,ORDERADDRESS) VALUES(?, ?, ?, ?,?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, order.getOrdersid());
			pstmt.setString(2, order.getOrderuserid());
			pstmt.setDate(3, new java.sql.Date(order.getOrderdate().getTime()));
			pstmt.setInt(4, order.getTotalprice());
			pstmt.setInt(5, order.getOrderquantity());
			pstmt.setString(6, order.getOrdersingleprice());
			pstmt.setString(7, order.getDeliveryfee());
			pstmt.setString(8, order.getOrderfoodname());
			pstmt.setString(9, order.getOrderaddress());

			int r = pstmt.executeUpdate();
			pstmt.close();
			return r;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	public Order select(String orderid) throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM ORDERS WHERE ORDERSID=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, orderid);
			ResultSet rs = pstmt.executeQuery();
			Order orders = null;
			if (rs.next()) {
				orders = new Order();
				orders.setOrdersid(rs.getString("ordersid"));
				orders.setOrderuserid(rs.getString("orderuserid"));
				orders.setOrderdate(rs.getDate("orderdate"));
				orders.setTotalprice(rs.getInt("totalprice"));
				orders.setOrderquantity(rs.getInt("orderquantity"));
				orders.setOrdersingleprice(rs.getString("ordersingleprice"));
				orders.setDeliveryfee(rs.getString("deliveryfee"));
				orders.setOrderfoodname(rs.getString("orderfoodname"));
				orders.setOrderaddress(rs.getString("orderaddress"));

			}
			pstmt.close();
			return orders;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	
	
	public List<Order> selectAll() throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM ORDERS";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			List<Order> orderlist = new ArrayList<>();
			while(rs.next()) {
				Order orders = new Order();
				orders.setOrdersid(rs.getString("ordersid"));
				orders.setOrderuserid(rs.getString("orderuserid"));
				orders.setOrderdate(rs.getDate("orderdate"));
				orders.setTotalprice(rs.getInt("totalprice"));
				orderlist.add(orders);
			}
			pstmt.close();
			return orderlist;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
//	public int update(Order order)  throws SQLException {
//		DBUtil db = new DBUtil(); /* 追加 */
//		Connection con = null;
//		try {
//			/* STEP 1:データベースの接続 */
//			con = db.getConnection(); /* 変更 */
//			/* STEP 2:SQL送信処理 */
//			String sql = "UPDATE ORDER SET  DELIVERYSTATE WHERE ORDERSID=?";
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, order.getDeliverystate());
//			int r = pstmt.executeUpdate();
//			pstmt.close();
//			return r;
//		} finally {
//			/* STEP 3:データベースとの接続を切断 */
//			db.closeConnection(con); /* 変更 */
//		}
//	}
	public int delete(String ordersid)  throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "DELETE FROM ORDERS WHERE ORDERSID=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ordersid);
			int r = pstmt.executeUpdate();
			pstmt.close();
			return r;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	
	
	public List<Order> selectByuserid(String orderuserid) throws SQLException  {

		/* STEP 0:JDBCドライバの有効化 */
		DBUtil db = new DBUtil();
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection();
			
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM ORDERS WHERE ORDERUSERID LIKE ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + orderuserid + "%");


			ResultSet rs = pstmt.executeQuery();
			List<Order> orderlist = new ArrayList<Order>();
			while(rs.next()) {
				Order orders = new Order();
				orders.setOrdersid(rs.getString("ordersid"));
				orders.setOrderuserid(rs.getString("orderuserid"));
				orders.setOrderdate(rs.getDate("orderdate"));
				orders.setTotalprice(rs.getInt("totalprice"));
				orders.setOrderquantity(rs.getInt("orderquantity"));
				orders.setOrdersingleprice(rs.getString("ordersingleprice"));
				orders.setDeliveryfee(rs.getString("deliveryfee"));
				orders.setOrderfoodname(rs.getString("orderfoodname"));
				orders.setOrderaddress(rs.getString("orderaddress"));
				orderlist.add(orders);
			}
			pstmt.close();
			return orderlist;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con);
		}
	}
}
