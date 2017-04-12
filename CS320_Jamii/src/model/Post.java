package model;

import model.Account;

public class Post {

	private String text;
	private Account account;
	// date time at later date
	// image or picture
	
	public Post(String text, Account account /*Date date*/){
		this.text = text;
		this.account = account;
		//this.datetime = date;
	}
	
	// Setter
	
	public void setText(String text){
		this.text = text;
	}
	
	public void setAccount(Account account){
		this.account = account;
	}
	
	//getters
	public String getText(){
		return this.text;
	}
	
	public Account getAccount(){
		return this.account;
	}
}
