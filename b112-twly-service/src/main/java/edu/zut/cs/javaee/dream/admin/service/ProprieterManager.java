package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.base.service.GenericManager;


public interface ProprieterManager extends GenericManager<Proprieter, Long>{
	List<Proprieter> findAll();

	Proprieter findbyUsername(String username);
}
