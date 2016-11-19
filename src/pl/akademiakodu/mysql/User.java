package pl.akademiakodu.mysql;

public class User {
		
	private String name;
	private String lastname;
	private int telephone;
	
	public User(String name, String lastname, int telephone) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
	
	
}
