package src.account;
import src.person.*;

public class Account  {
	private Membership membership;
	private IPerson accountHolder;
	
	
	public static IPerson Register(){
		IPerson returnObject = new Customer("Keepok");
		
		return returnObject;
	}
}
