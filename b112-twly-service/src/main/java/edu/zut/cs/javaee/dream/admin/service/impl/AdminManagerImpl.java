package edu.zut.cs.javaee.dream.admin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.AdminDao;
import edu.zut.cs.javaee.dream.admin.domain.Admin;
import edu.zut.cs.javaee.dream.admin.service.AdminManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;

@Component
public class AdminManagerImpl extends GenericManagerImpl<Admin, Long> implements AdminManager{

	AdminDao adminDao;

	@Autowired
	public void setUserDao(AdminDao adminDao) {
		this.adminDao = adminDao;
		this.dao = this.adminDao;
	}

	@Override
	public Admin findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
