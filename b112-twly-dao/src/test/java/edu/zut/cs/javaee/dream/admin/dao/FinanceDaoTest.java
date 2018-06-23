package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Finance;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;

public class FinanceDaoTest extends GenericDaoTestCase<Long, Finance, FinanceDao> {

	@Autowired
	FinanceDao financeDao;

	@Test
	public void testFindAll() {

		List<Finance> result = this.financeDao.findAll();

	}
}
