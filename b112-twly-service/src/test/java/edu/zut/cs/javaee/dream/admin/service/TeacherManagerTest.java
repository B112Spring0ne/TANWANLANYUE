package edu.zut.cs.javaee.dream.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class TeacherManagerTest extends GenericGenerator{

	@Autowired
	TeacherManager TeacherManager;
	@Test
	public void add_teacher()
	{
		for(int i=0;i<10;i++)
		{
			Teacher t = new Teacher();
			t.setTeacherName("liuqi"+i);
			t.setTeacherpassword("q5254235"+i);
			TeacherManager.save(t);
		}
	}

}