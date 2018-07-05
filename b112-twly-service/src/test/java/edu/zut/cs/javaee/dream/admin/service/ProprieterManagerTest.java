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
	/*测试类的找到所有*/
	public void testFindAll() {
		List<Proprieter> all = this.proprieterManager.findAll();
		assertEquals(all.size(), 100);
	}
	/*查询函数*/

	@Test
	public void testFindbyUsername() {
		String proprietername = "world";
		Proprieter expected_proprieter = new Proprieter();
		Proprieter proprieter = this.proprieterManager.findbyUsername(proprietername);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(proprieter, expected_proprieter);
	}
	/*保存数据*/
	@Test
	public void testSave() {
		List<Proprieter> proprieterList = new ArrayList<Proprieter>();
		/*一次插入十条数据*/
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
