package edu.zut.cs.javaee.dream.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.admin.domain.Admin;
import edu.zut.cs.javaee.dream.admin.service.AdminManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/admin")
public class AdminController extends GenericController<Admin,Long,AdminManager>{
	AdminManager adminManager;
	@Autowired
	public void setPoroprieterManager(AdminManager adminManager) {
		this.adminManager = adminManager;
		this.manager  =this.adminManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/admin/index";
		return result;
	}
	
}
