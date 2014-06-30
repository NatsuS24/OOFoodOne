package src.person;


public class Company {
	private Representative cotactPerson;
	String companyName;
	String companyAddress;

	public Company(){
		//sdfasdfas
	}
	public Representative getCotactPerson() {
		return cotactPerson;
	}

	public void setCotactPerson(Representative cotactPerson) {
		this.cotactPerson = cotactPerson;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
}
