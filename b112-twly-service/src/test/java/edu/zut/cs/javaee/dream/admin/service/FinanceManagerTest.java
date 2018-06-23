package edu.zut.cs.javaee.dream.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Finance;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class FinanceManagerTest extends GenericGenerator{

	@Autowired
	FinanceManager financeManager;
	@Test
	public void testFindAll() {
		List<Finance> all = this.financeManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String financename = "world";
		Finance expected_finance = new Finance();
		// expected_user.setUsername(username);
		Finance finance = this.financeManager.findbyUsername(financename);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(finance, expected_finance);
	}
	@Test
	public void testSave() {
		List<Finance> financeList = new ArrayList<Finance>();
		for (int i = 0;i<5;i++) {
			Finance finance = new Finance();
			finance.setFinancename("financename"+i);
			finance.setPassword("password"+i);
			financeList.add(finance);
		}
		this.financeManager.save(financeList);
	}
}
