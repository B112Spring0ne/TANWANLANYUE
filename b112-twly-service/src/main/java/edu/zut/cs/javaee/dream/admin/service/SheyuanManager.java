package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.Sheyuan;
import edu.zut.cs.javaee.dream.base.service.GenericManager;



public interface SheyuanManager extends GenericManager<Sheyuan, Long>{

	List<Sheyuan> findAll();

	Sheyuan findbyUsername(String Sheyuan);
}
