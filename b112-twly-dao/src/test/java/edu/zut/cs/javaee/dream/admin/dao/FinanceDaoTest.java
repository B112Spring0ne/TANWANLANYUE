package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Finance;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
/*测试类*/
public class FinanceDaoTest extends GenericDaoTestCase<Long, Finance, FinanceDao> {

	@Autowired
	FinanceDao financeDao;
/*查找方法*/
	@Test
	public void testFindAll() {

		List<Finance> result = this.financeDao.findAll();

	}
}
