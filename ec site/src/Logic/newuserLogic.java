package Logic;

import java.sql.SQLException;

import dao.accountDAO;
import dto.account;

public class newuserLogic {
	public account process(String accountid, String accountpw,String accountname,String accountmail,String accountpostno,String accountaddress,String phoneno ) throws SQLException {
		account accounts = new account();
		accounts.setAccountid(accountid);
		accounts.setAccountpw(accountpw);
		accounts.setAccountname(accountname);
		accounts.setAccountmail(accountmail);
		accounts.setAccountpostno(accountpostno);
		accounts.setAccountaddress(accountaddress);
		accounts.setPhoneno(phoneno);
		
		accountDAO adao = new accountDAO();
		int r = adao.insert(accounts);
		return accounts;
	}
	

}
