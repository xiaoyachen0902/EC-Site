package Logic;

import java.sql.SQLException;
import java.util.List;

import dao.foodDAO;
import dto.food;

public class FoodListLogic {

	public List<food> process(String nameLike) throws SQLException{
		foodDAO fdao = new foodDAO();
		
		return fdao.selectByname(nameLike);
	}
	
	public List<food> process2(String category) throws SQLException{
		foodDAO fdao = new foodDAO();
		
		return fdao.selectByname(category);
	}
	public List<food> process3(String keyword,String category) throws SQLException {
		foodDAO dao = new foodDAO();
		List<food> foods = dao.searchByBoth(keyword, category);
		return foods;
	}
}
