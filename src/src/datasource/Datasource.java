package src.datasource;

import java.util.ArrayList;
import java.util.List;

import src.account.Account;
import src.person.IPerson;

public class Datasource {
	private static List<Account> accountList = new ArrayList<Account>();
	private static List<IPerson> userList = new ArrayList<IPerson>();
	
	public static void addAccount(Account acc){
		accountList.add(acc);
	}
	public static void removeAccount(Account acc){
		accountList.remove(acc);
	}
	public static void AddUser(IPerson person){
		userList.add(person);
	}
}