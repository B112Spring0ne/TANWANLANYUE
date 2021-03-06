package edu.zut.cs.javaee.dream.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.admin.service.ProprieterManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;

/*社长控制器*/
@Controller
@RequestMapping("/proprieter")
public class ProprieterController extends GenericController<Proprieter,Long,ProprieterManager>{
	ProprieterManager proprieterManager;
	@Autowired
	public void setPoroprieterManager(ProprieterManager proprieterManager) {
		this.proprieterManager = proprieterManager;
		this.manager  =this.proprieterManager;
	}
	/*用get方法*/
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	/*后缀方法展示*/
	public String index() {
		String result = "/proprieter/index";
		return result;
	}
	
}
