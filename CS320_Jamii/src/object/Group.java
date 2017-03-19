package object;


import java.util.ArrayList;

public class group_object {
	
	private String description, id, name;
	private int rating;
	private ArrayList<user_object> members;
	private ArrayList<user_object> moderators;
	private ArrayList<user_object> requests;
	private ArrayList<post_object> posts;
	
	public group_object(String description, String id, String name){
		this.description = description;
		this.id = id;
		this.rating = 0;
		this.members = new ArrayList<user_object>();
		this.moderators = new ArrayList<user_object>();
		this.requests = new ArrayList<user_object>();
		this.posts = new ArrayList<post_object>();
	}
	
	// setters
	
	public void setDescription(String description){
		this.description = description;
	}

	public void setID(String id){
		this.id = id;
	}
	
	public void setRaiting(int raiting){
		this.rating = raiting;
	}
	
	//getters
	
	public String getDescription(){
		return this.description;
	}

	public String getID(){
		return this.id;
	}

	public int getRaiting(){
		return this.rating;
	}
	
	public ArrayList<user_object> getMembers(){
		return this.members;
	}
	
	public ArrayList<user_object> getModerators(){
		return this.moderators;
	}
	
	public ArrayList<user_object> getRequests(){
		return this.requests;
	}
	
	public ArrayList<post_object> getPosts(){
		return this.posts;
	}
	
	//other methods
	
	public void createPost(String text, user_object user){
		this.posts.add(new post_object(text, user));
	}
	
	public void addUser(user_object user){
		this.members.add(user);
	}
	
	public void addMod(user_object user){
		this.moderators.add(user);
	}
	
	public Boolean userisMod(user_object user){
		if(this.moderators.contains(user)){
			return true;
		}
		else
			return false;
	}
	
	// need discussion on how to remove posts, edit posts, remove user, accept user
	
	
	
	
	
	
}
