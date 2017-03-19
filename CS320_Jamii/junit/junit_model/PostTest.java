package junit_model;

import static org.junit.Assert.*;
import object.post_object;
import object.user_object;
import org.junit.Test;

public class post_objectTest {

	@Test
	public void test() {
		//testing variables
		String text = "this is a post";
		user_object testuser = new user_object();
		user_object newuser = new user_object();
		post_object post = new post_object(text, testuser);
		org.junit.Assert.assertEquals(post.getText(), "this is a post");
		org.junit.Assert.assertEquals(post.getUser(), testuser);
		post.setText("new post");
		post.setUser(newuser);
		org.junit.Assert.assertEquals(post.getText(), "new post");
		org.junit.Assert.assertEquals(post.getUser(), newuser);
		
	}

}
