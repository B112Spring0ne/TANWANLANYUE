package edu.zut.cs.javaee.dream.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.FinanceDao;
import edu.zut.cs.javaee.dream.admin.domain.Finance;
import edu.zut.cs.javaee.dream.admin.service.FinanceManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
/*继承GenericManagerImpl和接口TeacherManager*/
@Component
public class FinanceManagerImpl extends GenericManagerImpl<Finance, Long> implements FinanceManager{
	/*定义FinanceDao实体*/
	FinanceDao financeDao;

	@Autowired
	public void setUserDao(FinanceDao financeDao) {
		this.financeDao = financeDao;
		this.dao = this.financeDao;
	}

	@Override
	public Finance findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
