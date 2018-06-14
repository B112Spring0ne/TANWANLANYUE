package edu.zut.cs.javaee.dream.admin.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;

public class TeacherDaoTest extends GenericDaoTestCase<Long,Teacher,TeacherDao>{
	
	TeacherDao teacherDao;
	
	@Autowired
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
		this.dao=this.teacherDao;
	}
	
	@Test
	public void daoTest()
	{
		Teacher teacher=new Teacher();
		teacher.setTeacherName("0");
		this.teacherDao.save(teacher);
	}
	

}
