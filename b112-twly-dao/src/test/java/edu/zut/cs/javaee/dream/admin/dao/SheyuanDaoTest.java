package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Sheyuan;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
/*测试dao*/
public class SheyuanDaoTest extends GenericDaoTestCase<Long, Sheyuan, SheyuanDao> {

	@Autowired
	SheyuanDao sheyuanDao;
	/*查找方法*/

	@Test
	public void testFindAll() {

		List<Sheyuan> result = this.sheyuanDao.findAll();

	}
}
