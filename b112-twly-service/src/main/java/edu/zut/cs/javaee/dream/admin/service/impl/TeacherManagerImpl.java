package edu.zut.cs.javaee.dream.admin.service.impl;

import org.junit.Test;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.dao.TeacherDao;
import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.admin.service.TeacherManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
@Component
public class TeacherManagerImpl extends GenericManagerImpl<Teacher,Long> implements TeacherManager{
	TeacherDao teacherDao;
	@Test
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
		this.dao=this.teacherDao;
	}

	
}

