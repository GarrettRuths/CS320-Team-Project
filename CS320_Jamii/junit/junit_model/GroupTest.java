package junit_model;

import static org.junit.Assert.*;
import object.group_object;
import object.post_object;
import object.user_object;
import java.util.ArrayList;

import org.junit.Test;

public class group_objectTest {
	
	@Test
	public void test() {
		//does NOT test for requests, requests not complete yet.
		
		//testing variables
		group_object group = new group_object("a group", "0", "the group name");
		user_object testuser = new user_object();
		ArrayList<user_object> userlist = new ArrayList<user_object>(); 
		userlist.add(testuser);
		post_object testpost = new post_object("a post", testuser);
		ArrayList<post_object> testposts = new ArrayList<post_object>();
		testposts.add(testpost);
		
		//actual tests
		org.junit.Assert.assertEquals(group.getDescription(), "a group");
		org.junit.Assert.assertEquals(group.getRaiting(), 0);
		group.setDescription("a new group");
		org.junit.Assert.assertEquals(group.getDescription(), "a new group");
		group.setRaiting(11);
		org.junit.Assert.assertEquals(group.getRaiting(), 11);
		group.setID("asd16");
		org.junit.Assert.assertEquals(group.getID(), "asd16");
		group.addUser(testuser);
		org.junit.Assert.assertEquals(group.getMembers(), userlist);
		org.junit.Assert.assertFalse(group.userisMod(testuser));
		group.addMod(testuser);
		org.junit.Assert.assertTrue(group.userisMod(testuser));
		org.junit.Assert.assertEquals(group.getModerators(), userlist);
		group.createPost("a post", testuser);
		org.junit.Assert.assertFalse(group.getPosts().isEmpty());
		
	}

}
