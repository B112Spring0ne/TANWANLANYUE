package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Admin;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;

public class AdminDaoTest extends GenericDaoTestCase<Long, Admin, AdminDao> {

	@Autowired
	AdminDao adminDao;

	@Test
	public void testFindAll() {

		List<Admin> result = this.adminDao.findAll();

	}
}
