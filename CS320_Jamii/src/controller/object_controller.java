package controller;
import java.util.ArrayList;


import model.Account;
import model.Group;
import model.Post;



public class object_controller {
	
	private ArrayList<Account> users;
	private ArrayList<Group> groups;
	
	
	public object_controller(){
		this.users = new ArrayList<Account>();
		this.groups = new ArrayList<Group>();
		this.users.add(new Account("admin", "admiralalonzoghostpenis420YOLO", 1234, "Admin McAdmin", "admin@admin.admin", "555-555-5555", false ));
		this.groups.add(new Group("Admin Test Group", "Admin", "Admin"));
		this.groups.get(0).addAccount(this.users.get(0));
	}
	
	
	public boolean credentials(String username, String password){
		for(int x = 0; x < users.size(); x++){
			if(users.get(x).getUsername().equals(username) && users.get(x).getPassword().equals(password)){
				System.out.println("Found match");
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	

}
