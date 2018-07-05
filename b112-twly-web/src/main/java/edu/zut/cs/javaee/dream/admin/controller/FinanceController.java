package edu.zut.cs.javaee.dream.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.admin.domain.Finance;
import edu.zut.cs.javaee.dream.admin.service.FinanceManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
/*财务管理员控制器*/
@Controller
@RequestMapping("/finance")
public class FinanceController extends GenericController<Finance,Long,FinanceManager>{
	FinanceManager financeManager;
	@Autowired
	public void setPoroprieterManager(FinanceManager financeManager) {
		this.financeManager = financeManager;
		this.manager  =this.financeManager;
	}
	/*用get方法*/
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	/*后缀方法展示*/
	public String index() {
		String result = "/finance/index";
		return result;
	}
	
}
