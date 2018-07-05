package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;

public class ProprieterDaoTest extends GenericDaoTestCase<Long, Proprieter, ProprieterDao> {

	@Autowired
	ProprieterDao proprieterDao;
	/*找到proprieter的方法*/

	@Test
	public void testFindAll() {

		List<Proprieter> result = this.proprieterDao.findAll();

	}
}
