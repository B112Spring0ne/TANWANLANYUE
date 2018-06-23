package edu.zut.cs.javaee.dream.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class ProprieterManagerTest extends GenericGenerator{

	@Autowired
	ProprieterManager proprieterManager;
	@Test
	public void testFindAll() {
		List<Proprieter> all = this.proprieterManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String proprietername = "world";
		Proprieter expected_proprieter = new Proprieter();
		// expected_user.setUsername(username);
		Proprieter proprieter = this.proprieterManager.findbyUsername(proprietername);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(proprieter, expected_proprieter);
	}
	@Test
	public void testSave() {
		List<Proprieter> proprieterList = new ArrayList<Proprieter>();
		for (int i = 0;i<10;i++) {
			Proprieter proprieter = new Proprieter();
			proprieter.setEmail("123456789"+i+".qq.com");
			proprieter.setName("usename_"+i);
			proprieter.setPassword("password_i"+i);
			proprieter.setPost("mass_"+i);
			proprieterList.add(proprieter);
		}
		this.proprieterManager.save(proprieterList);
	}
}
