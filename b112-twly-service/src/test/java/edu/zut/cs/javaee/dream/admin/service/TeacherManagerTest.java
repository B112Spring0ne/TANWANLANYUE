package edu.zut.cs.javaee.dream.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class TeacherManagerTest extends GenericGenerator{
	
	@Autowired
	TeacherManager teacherManager;
	@Test
	public void testFindAll() {
		List<Teacher> all = this.teacherManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String teachername = "world";
		Teacher expected_teacher = new Teacher();
		// expected_user.setUsername(username);
		Teacher teacher = this.teacherManager.findbyUsername(teachername);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(teacher, expected_teacher);
	}
	@Test
	public void testSave() {
		List<Teacher> teacherList = new ArrayList<Teacher>();
		for (int i = 0;i<10;i++) {
			Teacher teacher = new Teacher();
			teacher.setTeacherName("liuqi"+i);
			teacher.setTeacherpassword("password123"+i);
			teacherList.add(teacher);
		}
		this.teacherManager.save(teacherList);
	}

}
