package src.person;

import src.account.Account;

public interface IPerson {
	public Account getAccount();
	public String getAddress();
	public String getFirstName();
	public String getLastName();
	public void setAddress(String str);
	public void setLastName(String lName);
	public void setFirstName(String fName);
}
