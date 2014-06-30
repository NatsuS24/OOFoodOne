package src.account;
import src.datasource.Datasource;
import src.person.*;

public class Account  {
	private Membership membership;
	private IPerson accountHolder;
	
	public Account(){
		
	}
	public static IPerson Register(IPerson person){
		//Datasource.addAccount(person);
	}
	public void addMembership(Membership membership){
		this.membership = membership;
	}
}
