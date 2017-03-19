package object;

public class user_object {
	

	private String id, biography, firstName, lastName, email, password;  //all the string values for a user
	private Boolean isActive, isBanned, isSuspended;					 //all the boolean values for user

	public user_object (String id, String biography, String firstName, String lastName, String email, String password){	//constructor for all the string values
		this.id = id;
		this.biography = biography;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.isActive = true;
		this.isBanned = false;
		this.isSuspended = false;
	}
	
	public user_object(){	//constructor for when none of the information is known but the object needs to be created
		this.id = "";
		this.biography = "";
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.password = "";
		this.isActive = true;
		this.isBanned = false;
		this.isSuspended = false;
		
	}


	public void setId(String id){			// Begining of setters
		this.id = id;	
	}

	public void setBiography(String biography){
		this.biography = biography;
	}

	public void setfirstName(String firstName){
		this.firstName = firstName;
	}

	public void setlastName(String lastName){
		this.lastName = lastName;
	}

	public void setemail (String email){
		this.email = email;
	}

	public void setpassword (String password){
		this.password = password;
	}

	public String getId(){		// Begining of getters
		return this.id;
	}

	public String getBiography(){
		return this.biography;
	}

	public String getfirstName(){
		return this.firstName;
	}

	public String getlastName(){
		return this.lastName;
	}

	public String getemail (){
		return this.email;
	}

	public String getpassword (){
		return this.password;
	}

	public Boolean getisActive(){
		return this.isActive;
	}
	
	public Boolean getisBanned(){
		return this.isBanned;
	}
	
	public Boolean getisSuspended(){
		return this.isSuspended;
	}
	
	public void banUser(){			// Begining of other methods
		this.isBanned = true;
	}

	public void suspendUser(){
		this.isSuspended = true;
	}

	public void userisInactive(){
		this.isActive = false;
	}
	
	



}