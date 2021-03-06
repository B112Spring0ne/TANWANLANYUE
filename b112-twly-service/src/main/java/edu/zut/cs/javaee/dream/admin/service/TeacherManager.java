package edu.zut.cs.javaee.dream.admin.service;

import java.util.List;


import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.base.service.GenericManager;

public interface TeacherManager extends GenericManager<Teacher,Long>{
	List<Teacher> findAll();

	Teacher findbyUsername(String Teacher);

}