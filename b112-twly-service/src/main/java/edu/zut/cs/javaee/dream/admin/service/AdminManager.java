package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.Admin;

import edu.zut.cs.javaee.dream.base.service.GenericManager;

public interface AdminManager extends GenericManager<Admin, Long> {
	List<Admin> findAll();

	Admin findbyUsername(String Admin);

}