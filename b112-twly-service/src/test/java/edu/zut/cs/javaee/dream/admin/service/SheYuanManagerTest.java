package edu.zut.cs.javaee.dream.admin.service;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.UserManager;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;

public class SheYuanManagerTest extends GenericManagerTestCase<Long, User, UserManager>  {

	public SheYuanManagerTest() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	UserManager userManager;

	@Test
	public void testFindAll() {
		List<User> all = this.userManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String username = "world";
		User expected_user = new User();
		// expected_user.setUsername(username);
		User user = this.userManager.findbyUsername(username);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(user, expected_user);
	}

}
