package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;

import edu.zut.cs.javaee.dream.admin.domain.Finance;
import edu.zut.cs.javaee.dream.base.service.GenericManager;



public interface FinanceManager extends GenericManager<Finance, Long>{

	List<Finance> findAll();

	Finance findbyUsername(String Finance);
}
