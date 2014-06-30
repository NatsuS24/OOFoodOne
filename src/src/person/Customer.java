package src.person;

import src.account.Account;

public class Customer implements IPerson{

	private String fName;
	private String lName;
	private String address;
	private Account account;
	public Customer(String fname, String lname, String address){
		
	}
	@Override
	public Account getAccount() {
		// TODO Auto-generated method stub
		return this.account;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.address;
	}
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.fName;
	}
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lName;
	}
	@Override
	public void setAddress(String str) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLastName(String lName) {
		// TODO Auto-generated method stub
		this.lName = lName;
	}
	@Override
	public void setFirstName(String fName) {
		// TODO Auto-generated method stub
		this.fName = fName;
	}
}
