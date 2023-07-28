package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.account;

public class accountDAO {

	
		public account select(String accountid) throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "SELECT * FROM ACCOUNT WHERE ACCOUNTID=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, accountid);
				ResultSet rs = pstmt.executeQuery();
				account account = null;
				if (rs.next()) {
					account = new account();
					account.setAccountid(rs.getString("accountid"));
					account.setAccountpw(rs.getString("accountpw"));
					account.setAccountname(rs.getString("accountname"));
					account.setAccountmail(rs.getString("accountmail"));
					account.setAccountpostno(rs.getString("accountpostno"));
					account.setAccountaddress(rs.getString("accountaddress"));
					account.setPhoneno(rs.getString("phoneno"));

					
					
				}
				pstmt.close();
				return account;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
	}
		public int insert(account account)  throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "INSERT INTO ACCOUNT(ACCOUNTID, ACCOUNTPW,ACCOUNTNAME, ACCOUNTMAIL, ACCOUNTPOSTNO, ACCOUNTADDRESS,PHONENO) VALUES(?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountid());
				pstmt.setString(2, account.getAccountpw());
				pstmt.setString(3, account.getAccountname());
				pstmt.setString(4, account.getAccountmail());
				pstmt.setString(5, account.getAccountpostno());
				pstmt.setString(6, account.getAccountaddress());
				pstmt.setString(7, account.getPhoneno());
				
				
				int r = pstmt.executeUpdate();
				pstmt.close();
				return r;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}
		public int update(account account)  throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "UPDATE ACCOUNT SET ACCOUNTNAME=?, ACCOUNTMAIL=?, ACCOUNTPOSTNO=?, ACCOUNTADDRESS=?, PHONENO=? WHERE ACCOUNTID=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(3, account.getAccountname());
				pstmt.setString(4, account.getAccountmail());
				pstmt.setString(5, account.getAccountpostno());
				pstmt.setString(6, account.getAccountaddress());
				pstmt.setString(7, account.getPhoneno());
				int r = pstmt.executeUpdate();
				pstmt.close();
				return r;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}
		public int delete(String accountid)  throws SQLException {
			DBUtil db = new DBUtil(); /* 追加 */
			Connection con = null;
			try {
				/* STEP 1:データベースの接続 */
				con = db.getConnection(); /* 変更 */
				/* STEP 2:SQL送信処理 */
				String sql = "DELETE FROM ACCOUNT WHERE ACCOUNTID=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, accountid);
				int r = pstmt.executeUpdate();
				pstmt.close();
				return r;
			} finally {
				/* STEP 3:データベースとの接続を切断 */
				db.closeConnection(con); /* 変更 */
			}
		}

}
		

