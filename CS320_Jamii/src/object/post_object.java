package object;



public class post_object {

	private String text;
	private user_object user;
	// date time at later date
	// image or picture
	
	public post_object(String text, user_object user /*Date date*/){
		this.text = text;
		this.user = user;
		//this.datetime = date;
	}
	
	// Setter
	
	public void setText(String text){
		this.text = text;
	}
	
	public void setUser(user_object user){
		this.user = user;
	}
	
	//getters
	public String getText(){
		return this.text;
	}
	
	public user_object getUser(){
		return this.user;
	}
}
