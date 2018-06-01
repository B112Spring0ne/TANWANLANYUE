package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.service.GenericManager;

public interface SheYuanManager extends GenericManager<User, Long> {

	List<User> findAll();

	User findbyUsername(String username);
}
