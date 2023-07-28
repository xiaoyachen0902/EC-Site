package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Orderdetail;



	public class orderdetailDAO {
		public int insert(Orderdetail orderdetail)  throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "INSERT INTO ORDERDETAIL(ORDER_ID, FOODORDERID, ORDERQUANTITY, ORDERPRICE) VALUES(?, ?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, orderdetail.getOrder_id());
				pstmt.setString(2, orderdetail.getFoodorderid());
				pstmt.setInt(3, orderdetail.getOrderquantity());
				pstmt.setInt(4, orderdetail.getOrderprice());

				int r = pstmt.executeUpdate();
				pstmt.close();
				return r;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}
		public Orderdetail select(String order_id) throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "SELECT * FROM ORDERDETAIL WHERE ORDER_ID=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, order_id);
				ResultSet rs = pstmt.executeQuery();
				Orderdetail orderdetail = null;
				if (rs.next()) {
					orderdetail = new Orderdetail();
					orderdetail.setOrder_id(rs.getString("order_id"));
					orderdetail.setFoodorderid(rs.getString("foodorderid"));
					orderdetail.setOrderquantity(rs.getInt("orderquantity"));

					orderdetail.setOrderprice(rs.getInt("orderprice"));
				}
				pstmt.close();
				return orderdetail;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}
		public List<Orderdetail> selectAll() throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "SELECT * FROM ORDERDETAIL";
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				List<Orderdetail> orderdetaillist = new ArrayList<>();
				while(rs.next()) {
					Orderdetail orderdetail = new Orderdetail();
					orderdetail.setOrder_id(rs.getString("ordersid"));
					orderdetail.setFoodorderid(rs.getString("orderuserid"));
					orderdetail.setOrderquantity(rs.getInt("orderdate"));
					orderdetail.setOrderprice(rs.getInt("totalprice"));
					orderdetaillist.add(orderdetail);
				}
				pstmt.close();
				return orderdetaillist;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}
		
		public int delete(String order_id)  throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "DELETE FROM ORDERDETAIL WHERE ORDER_ID=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, order_id);
				int r = pstmt.executeUpdate();
				pstmt.close();
				return r;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}
	}

	
	
	

