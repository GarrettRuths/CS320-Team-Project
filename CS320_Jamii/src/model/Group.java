package model;


import java.util.ArrayList;

import model.Account;

public class Group {
	
	private String description, id, name;
	private int rating;
	private ArrayList<Account> members;
	private ArrayList<Account> moderators;
	private ArrayList<Account> requests;
	private ArrayList<Post> posts;
	
	public Group(String description, String id, String name){
		this.description = description;
		this.id = id;
		this.name = name;
		this.rating = 0;
		this.members = new ArrayList<Account>();
		this.moderators = new ArrayList<Account>();
		this.requests = new ArrayList<Account>();
		this.posts = new ArrayList<Post>();
	}
	
	// setters
	
	public void setDescription(String description){
		this.description = description;
	}

	public void setID(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setRating(int rating){
		this.rating = rating;
	}
	
	//getters
	
	public String getDescription(){
		return this.description;
	}

	public String getID(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}
	
	public int getRating(){
		return this.rating;
	}
	
	public ArrayList<Account> getMembers(){
		return this.members;
	}
	
	public ArrayList<Account> getModerators(){
		return this.moderators;
	}
	
	public ArrayList<Account> getRequests(){
		return this.requests;
	}
	
	public ArrayList<Post> getPosts(){
		return this.posts;
	}
	
	//other methods
	
	public void createPost(String text, Account account){
		this.posts.add(new Post(text, account));
	}
	
	public void addAccount(Account account){
		this.members.add(account);
	}
	
	public void addMod(Account account){
		this.moderators.add(account);
	}
	
	public Boolean userisMod(Account account){
		if(this.moderators.contains(account)){
			return true;
		}
		else
			return false;
	}

	
	// need discussion on how to remove posts, edit posts, remove user, accept user
	
	
	
	
	
	
}
