package dto;

public class account {
	
	private String accountid;
	private String accountpw;
	private String accountname;
	private String accountmail;
	private String accountpostno;
	private String accountaddress;
	private String phoneno;
	
	
	
public account() {}
	
	public account(String accountid, String accountpw,String accountname, String accountmail,String accountpostno,String accountaddress, String phoneno ) {
		this.setAccountid(accountid);
		this.setAccountpw(accountpw);
		this.setAccountname(accountname);
		this.setAccountmail(accountmail);
		this.setAccountpostno(accountpostno);
		this.setAccountaddress(accountaddress);
		this.setPhoneno(phoneno);
	}
	
	
	
	
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getAccountpw() {
		return accountpw;
	}
	public void setAccountpw(String accountpw) {
		this.accountpw = accountpw;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getAccountmail() {
		return accountmail;
	}
	public void setAccountmail(String accountmail) {
		this.accountmail = accountmail;
	}
	public String getAccountpostno() {
		return accountpostno;
	}
	public void setAccountpostno(String accountpostno) {
		this.accountpostno = accountpostno;
	}
	
	public String getAccountaddress() {
		return accountaddress;
	}
	public void setAccountaddress(String accountaddress) {
		this.accountaddress = accountaddress;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;

	}
	

}

