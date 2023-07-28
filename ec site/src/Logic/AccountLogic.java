package Logic;
import java.sql.SQLException;

import dao.accountDAO;
import dto.account;
public class AccountLogic {
	public account process(String accountid) throws SQLException {
		accountDAO adao = new accountDAO();
		account users = adao.select(accountid);
		return users;
	}
}