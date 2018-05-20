package edu.zut.cs.javaee.dream.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;

public class ProprieterManagerTest extends GenericManagerTestCase<Long, Proprieter, ProprieterManager>  {

	public ProprieterManagerTest() {
		super(Proprieter.class);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	ProprieterManager proprieterManager;

	@Test
	public void testFindAll() {
		List<Proprieter> all = this.proprieterManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String username = "world";
		Proprieter expected_user = new Proprieter();
		// expected_user.setUsername(username);
		Proprieter proprieter = this.proprieterManager.findbyUsername(username);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(proprieter, expected_user);
	}

}
