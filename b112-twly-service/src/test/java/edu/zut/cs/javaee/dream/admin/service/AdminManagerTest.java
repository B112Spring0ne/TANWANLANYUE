package edu.zut.cs.javaee.dream.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Admin;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class AdminManagerTest extends GenericGenerator{

	@Autowired
	AdminManager adminManager;
	@Test
	public void testFindAll() {
		List<Admin> all = this.adminManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String adminname = "world";
		Admin expected_admin = new Admin();
		// expected_user.setUsername(username);
		Admin admin = this.adminManager.findbyUsername(adminname);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(admin, expected_admin);
	}
	@Test
	public void testSave() {
		List<Admin> adminList = new ArrayList<Admin>();
		for (int i = 0;i<10;i++) {
			Admin admin = new Admin();
			admin.setNum("00"+i);
			admin.setPassword("adminpassword"+i);
			adminList.add(admin);
		}
		this.adminManager.save(adminList);
	}
}
