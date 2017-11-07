package Backbone;

public class User {
	
	private String email;
	private String name;
	private String lastName;
	private String pass;
	private String ID;
	
	
	User(String email, String name, String last, String pass, String ID){
		
		this.email = email;
		this.name = name;
		this.lastName = last;
		this.pass = pass;
		this.ID = ID;
		
	}
	
	
	
	
//--------------------------------------------------------------------------------------------------
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}

	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
