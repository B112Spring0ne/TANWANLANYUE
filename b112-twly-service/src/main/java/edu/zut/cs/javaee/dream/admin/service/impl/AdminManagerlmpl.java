package edu.zut.cs.javaee.dream.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.dream.admin.dao.AdminDao;
import edu.zut.cs.javaee.dream.admin.domain.Admin;
import edu.zut.cs.javaee.dream.admin.service.AdminManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericTreeManagerImpl;

@Service("adminManager")
@Transactional
public class AdminManagerImpl extends GenericTreeManagerImpl<Admin, Long> implements AdminManager {

	AdminDao adminDao;

	@Autowired
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
		this.treeDao = this.adminDao;
		this.dao = this.treeDao;
	}

}
