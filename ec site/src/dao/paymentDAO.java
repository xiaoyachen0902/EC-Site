package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.payment;
public class paymentDAO {
	
	public int insert(payment payment)  throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "INSERT INTO PAYMENT(PAYMENTID,PAYUSERID) VALUES(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, payment.getPaymentid());
			pstmt.setString(2, payment.getPayuserid());
			
			int r = pstmt.executeUpdate();
			pstmt.close();
			return r;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	public payment select(String paymentid) throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM PAYMENT WHERE PAYMENTID=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, paymentid);
			ResultSet rs = pstmt.executeQuery();
			payment payment = null;
			if (rs.next()) {
				payment = new payment();
				payment.setPaymentid(rs.getInt("paymentid"));
				payment.setPayuserid(rs.getString("payuserid"));
				
			}
			pstmt.close();
			return payment;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
}
