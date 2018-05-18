package edu.zut.cs.javaee.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/proprieter")
public class ProprieterController extends GenericController<Proprieter, Long, ProprieterManager>{
	ProprieterManager proprieterManager;

	@Autowired
	public void setUserManager(ProprieterManager proprieterManager) {
		this.proprieterManager = proprieterManager;
		this.manager = this.proprieterManager;
	}

	@RequestMapping("/index")
	public String index() {
		return "user/index";
	}

}
