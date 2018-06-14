package edu.zut.cs.javaee.dream.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.ProprieterDao;
import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.ProprieterManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;

@Component
public class ProprieterManagerImpl extends GenericManagerImpl<Proprieter, Long> implements ProprieterManager{

	ProprieterDao proprieterDao;

	@Autowired
	public void setUserDao(ProprieterDao proprieterDao) {
		this.proprieterDao = proprieterDao;
		this.dao = this.proprieterDao;
	}

	@Override
	public Proprieter findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
