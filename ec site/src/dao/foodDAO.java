package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.food;

public class foodDAO {

	

	public List<food> selectByname(String foodkana) throws SQLException  {

		/* STEP 0:JDBCドライバの有効化 */
		DBUtil db = new DBUtil();
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection();
			
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM FOOD WHERE FOODKANA LIKE ? OR FOODNAME LIKE ? OR COMMENT LIKE ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + foodkana + "%");
			pstmt.setString(2, "%" + foodkana + "%");
			pstmt.setString(3, "%" + foodkana+ "%");

			ResultSet rs = pstmt.executeQuery();
			List<food> foodlist = new ArrayList<food>();
			while(rs.next()) {
				food FOOD = new food();
				FOOD.setFoodid(rs.getString("foodid"));				
				FOOD.setCategory_id(rs.getString("category_id"));
				FOOD.setFoodkana(rs.getString("FOODKANA"));
				FOOD.setFoodname(rs.getString("foodname"));
				FOOD.setFoodprice(rs.getInt("foodprice"));
				
				FOOD.setFoodpath(rs.getString("foodpath"));

				FOOD.setComment(rs.getString("comment"));
				foodlist.add(FOOD);
			}
			pstmt.close();
			return foodlist;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con);
		}
	}
	public List<food> selectAll() throws SQLException  {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM FOOD";
			PreparedStatement pstsbook = con.prepareStatement(sql);
			ResultSet rss = pstsbook.executeQuery();
			List<food> alllist = new ArrayList<food>();
			while(rss.next()) {
				food food = new food();
				food.setFoodid(rss.getString("foodid"));				
				food.setCategory_id(rss.getString("category_id"));
				food.setFoodkana(rss.getString("foodkana"));
				food.setFoodname(rss.getString("foodname"));
				food.setFoodprice(rss.getInt("foodprice"));
				food.setFoodpath(rss.getString("foodpath"));

				alllist.add(food);
			}
			pstsbook.close();
			return alllist;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	public int delete(String foodid)  throws SQLException {
		Connection con = null;
		DBUtil db = new DBUtil(); /* 追加 */
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "DELETE FROM FOOD WHERE ID=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, foodid);
			int r = pstmt.executeUpdate();
			pstmt.close();
			return r;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	public int insert(food food)  throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "INSERT INTO FOOD(FOODID, CATEGORY_ID, FOODKANA,FOODNAME, FOODPRICE, COMMENT) VALUES(?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, food.getFoodid());
			pstmt.setString(2, food.getCategory_id());
			pstmt.setString(3, food.getFoodkana());
			pstmt.setString(4, food.getFoodname());
			pstmt.setInt(5, food.getFoodprice());
			pstmt.setString(6, food.getComment());
			
			int r = pstmt.executeUpdate();
			pstmt.close();
			return r;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	} 
	public int update(food food)  throws SQLException {
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "UPDATE FOOD SET  CATEGORY_ID=?, FOODKANA=?, FOODNAME=?,  FOODPRICE=? ,COMMENT=? WHERE FOODID=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, food.getFoodid());
			pstmt.setString(2, food.getCategory_id());
			pstmt.setString(3, food.getFoodkana());
			pstmt.setString(4, food.getFoodname());
			pstmt.setInt(5, food.getFoodprice());
			pstmt.setString(6, food.getComment());
			int r = pstmt.executeUpdate();
			pstmt.close();
			return r;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}
	public food select(String foodid) throws SQLException {

		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM FOOD WHERE FOODID=?";//ここ
			PreparedStatement pstsbook = con.prepareStatement(sql);
			pstsbook.setString(1, foodid);//ここ
			ResultSet rss = pstsbook.executeQuery();
			food food = null;//ここから28行目　情報
			if (rss.next()) {
				food = new food();
				food.setFoodid(rss.getString("foodid"));				
				food.setCategory_id(rss.getString("category_id"));
				food.setFoodkana(rss.getString("foodkana"));
				food.setFoodname(rss.getString("foodname"));
				food.setFoodprice(rss.getInt("foodprice"));
				food.setComment(rss.getString("comment"));
				food.setFoodpath(rss.getString("foodpath"));
			}
			pstsbook.close();
			return food;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); /* 変更 */
		}
	}

	public List<food> searchByBoth( String keyword,String category) throws SQLException {//selectallの改造版みたいなもの
		DBUtil db = new DBUtil(); /* 追加 */
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection(); /* 変更 */
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM FOOD WHERE (FOODKANA LIKE ?) AND (CATEGORY_ID = ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, category);
			ResultSet rs = pstmt.executeQuery();
			List<food> list = new ArrayList<food>();
			while(rs.next()) {
				food food = new food();
				food.setFoodid(rs.getString("foodid"));				
				food.setCategory_id(rs.getString("category_id"));
				food.setFoodkana(rs.getString("foodkana"));
				food.setFoodname(rs.getString("foodname"));
				food.setFoodprice(rs.getInt("foodprice"));
				food.setFoodpath(rs.getString("foodpath"));

				list.add(food);
			}
			pstmt.close();
			return list;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con); }/* 変更 */
		}

	public List<food> selectBycategory(String categoryid) throws SQLException  {

		/* STEP 0:JDBCドライバの有効化 */
		DBUtil db = new DBUtil();
		Connection con = null;
		try {
			/* STEP 1:データベースの接続 */
			con = db.getConnection();
			
			/* STEP 2:SQL送信処理 */
			String sql = "SELECT * FROM FOOD WHERE CATEGORY_ID LIKE ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + categoryid + "%");


			ResultSet rs = pstmt.executeQuery();
			List<food> foodlist = new ArrayList<food>();
			while(rs.next()) {
				food FOOD = new food();
				FOOD.setFoodid(rs.getString("foodid"));				
				FOOD.setCategory_id(rs.getString("category_id"));
				FOOD.setFoodkana(rs.getString("FOODKANA"));
				FOOD.setFoodname(rs.getString("foodname"));
				FOOD.setFoodprice(rs.getInt("foodprice"));
				FOOD.setFoodpath(rs.getString("foodpath"));


				FOOD.setComment(rs.getString("comment"));
				foodlist.add(FOOD);
			}
			pstmt.close();
			return foodlist;
		} finally {
			/* STEP 3:データベースとの接続を切断 */
			db.closeConnection(con);
		}
	}


}