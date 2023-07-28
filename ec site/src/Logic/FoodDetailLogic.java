package Logic;

import java.sql.SQLException;

import dao.foodDAO;
import dto.food;

public class FoodDetailLogic {
	
	public food process(String foodid) throws SQLException{
		foodDAO fdao = new foodDAO();
		
		return fdao.select(foodid);
	}

}
