package Logic;

import java.sql.SQLException;
import java.util.List;

import dao.orderDAO;
import dto.Order;

public class ordersselectLogic {
	public List<Order> process(String orderuserid) throws SQLException{
		orderDAO dao = new orderDAO();
		
		return dao.selectByuserid(orderuserid);
}
}
