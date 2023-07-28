package Logic;
import java.sql.SQLException;
import java.util.List;

import dao.foodDAO;
import dto.food;
public class categorysearchLogic {
	public List<food> process(String keyword,String category) throws SQLException {
		foodDAO dao = new foodDAO();
		List<food> foods = dao.searchByBoth(keyword, category);
		return foods;
	}
}