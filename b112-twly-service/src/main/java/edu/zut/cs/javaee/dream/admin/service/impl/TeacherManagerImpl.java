package edu.zut.cs.javaee.dream.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.TeacherDao;
import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.TeacherManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;

@Component
public class TeacherManagerImpl extends GenericManagerImpl<Teacher, Long> implements TeacherManager{

	TeacherDao teacherDao;

	@Autowired
	public void setUserDao(TeacherDao TeacherDao) {
		this.TeacherDao = TeacherDao;
		this.dao = this.TeacherDao;
	}

	@Override
	public Teacher findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}