package edu.zut.cs.javaee.dream.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.TeacherDao;
import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.admin.service.TeacherManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
/*继承GenericManagerImpl和接口TeacherManager*/
@Component
public class TeacherManagerImpl extends GenericManagerImpl<Teacher, Long> implements TeacherManager{

	/*定义TeacherDao实体*/
	TeacherDao teacherDao;

	@Autowired
	public void setUserDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
		this.dao = this.teacherDao;
	}

	@Override
	public Teacher findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}