package edu.zut.cs.javaee.dream.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
/*测试dao*/
public class TeacherDaoTest extends GenericDaoTestCase<Long, Teacher, TeacherDao> {

	@Autowired
	TeacherDao teacherDao;
	/*查找方法*/
	@Test
	public void testFindAll() {

		List<Teacher> result = this.teacherDao.findAll();

	}
}
