package edu.zut.cs.javaee.dream.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.admin.domain.Teacher;
import edu.zut.cs.javaee.dream.admin.service.TeacherManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;

/*教师控制器*/
@Controller
@RequestMapping("/teacher")
public class TeacherController extends GenericController<Teacher,Long,TeacherManager>{
	TeacherManager teacherManager;
	@Autowired
	public void setTeacherManager(TeacherManager teacherManager) {
		this.teacherManager = teacherManager;
		this.manager  =this.teacherManager;
	}
	/*用get方法*/
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	/*后缀方法展示*/
	public String index() {
		String result = "/teacher/index";
		return result;
	}
	
}
