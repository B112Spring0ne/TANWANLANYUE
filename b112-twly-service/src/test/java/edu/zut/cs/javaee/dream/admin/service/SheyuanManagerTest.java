package edu.zut.cs.javaee.dream.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Sheyuan;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class SheyuanManagerTest extends GenericGenerator{

	@Autowired
	SheyuanManager sheyuanManager;
	@Test
	public void testFindAll() {
		List<Sheyuan> all = this.sheyuanManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String sheyuanname = "world";
		Sheyuan expected_sheyuan = new Sheyuan();
		// expected_user.setUsername(username);
		Sheyuan sheyuan = this.sheyuanManager.findbyUsername(sheyuanname);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(sheyuan, expected_sheyuan);
	}
	@Test
	public void testSave() {
		List<Sheyuan> sheyuanList = new ArrayList<Sheyuan>();
		for (int i = 0;i<10;i++) {
			Sheyuan sheyuan = new Sheyuan();
			sheyuan.setEmail("987645"+i+".qq.com");
			sheyuan.setName("sheyuanname"+i);
			sheyuan.setPassword("password00"+i);
			sheyuan.setPost("sheyuanmass_"+i);
			sheyuanList.add(sheyuan);
		}
		this.sheyuanManager.save(sheyuanList);
	}
}
