package edu.zut.cs.javaee.dream.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.admin.domain.Sheyuan;
import edu.zut.cs.javaee.dream.admin.service.SheyuanManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
/*映射社员*/
@Controller
@RequestMapping("/sheyuan")
public class SheyuanController extends GenericController<Sheyuan,Long,SheyuanManager>{
	SheyuanManager sheyuanManager;
	@Autowired
	/*社员setPoroprieterManager*/
	public void setPoroprieterManager(SheyuanManager sheyuanManager) {
		this.sheyuanManager = sheyuanManager;
		this.manager  =this.sheyuanManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/sheyuan/index";
		return result;
	}
	
}
