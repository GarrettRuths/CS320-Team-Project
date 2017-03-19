package junit_model;

import static org.junit.Assert.*;
import object.user_object;
import org.junit.Test;

public class user_objectTest {

	@Test
	public void test() {
		user_object user = new user_object();
		user.setBiography("i am a user");
		org.junit.Assert.assertEquals(user.getBiography(),"i am a user");
		user.setemail("user@usermail.com");
		org.junit.Assert.assertEquals(user.getemail(),"user@usermail.com");
		user.setfirstName("user");
		org.junit.Assert.assertEquals(user.getfirstName(),"user");
		user.setlastName("name");
		org.junit.Assert.assertEquals(user.getlastName(),"name");
		user.setId("abcde");
		org.junit.Assert.assertEquals(user.getId(), "abcde");
		user.setpassword("pass");
		org.junit.Assert.assertEquals(user.getpassword(),"pass");
		user.banUser();
		org.junit.Assert.assertTrue(user.getisBanned());
		user.suspendUser();
		org.junit.Assert.assertTrue(user.getisSuspended());
		user.userisInactive();
		org.junit.Assert.assertFalse(user.getisActive());
	}

}
