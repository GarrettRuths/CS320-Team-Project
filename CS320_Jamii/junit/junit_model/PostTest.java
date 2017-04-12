package junit_model;

import static org.junit.Assert.*;

import model.Account;
import org.junit.Test;

import model.Post;

public class PostTest {

	@Test
	public void test() {
		//testing variables
		String text = "this is a post";
		Account testaccount = new Account(null, null, 0, null, null, null, false);
		Account newaccount = new Account(null, null, 0, null, null, null, false);
		Post post = new Post(text, testaccount);
		org.junit.Assert.assertEquals(post.getText(), "this is a post");
		org.junit.Assert.assertEquals(post.getAccount(), testaccount);
		post.setText("new post");
		post.setAccount(newaccount);
		org.junit.Assert.assertEquals(post.getText(), "new post");
		org.junit.Assert.assertEquals(post.getAccount(), newaccount);
		
	}

}
