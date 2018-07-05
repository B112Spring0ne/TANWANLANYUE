package edu.zut.cs.javaee.dream.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.SheyuanDao;
import edu.zut.cs.javaee.dream.admin.domain.Sheyuan;
import edu.zut.cs.javaee.dream.admin.service.SheyuanManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
/*继承GenericManagerImpl和接口SheyuanManager*/
@Component
public class SheyuanManagerImpl extends GenericManagerImpl<Sheyuan, Long> implements SheyuanManager{

	SheyuanDao sheyuanDao;

	@Autowired
	public void setUserDao(SheyuanDao sheyuanDao) {
		this.sheyuanDao = sheyuanDao;
		this.dao = this.sheyuanDao;
	}

	@Override
	public Sheyuan findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
