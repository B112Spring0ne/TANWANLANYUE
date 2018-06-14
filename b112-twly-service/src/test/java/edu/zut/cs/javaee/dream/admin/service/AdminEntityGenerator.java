package edu.zut.cs.javaee.dream.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {

	@Autowired
	GroupManager groupManager;

	@Autowired
	UserManager userManager;

	@Autowired
	RoleManager roleManager;
	
	@Autowired
	ProprieterManager proprieterManager;
	
	

	@Test
	public void gen_proprieter() {
		for (int i = 0; i < 10; i++) {
			Proprieter g = new Proprieter();
			g.setName("proprieter_" + i);
			this.proprieterManager.save(g);
			for (int j = 0; j < 10; j++) {
				Proprieter group = new Proprieter();
				group.setName("proprieter_" + i + "_" + j);
				group.setPassword("1010"+i+j);
				group.setEmail("123"+i+j+"@qq.com");
				group.setPost("2");
				g = this.proprieterManager.save(group);
			}
		}
	}
	@Test
	public Proprieter find_proprieter(long yzid)
	{
		Proprieter g = new Proprieter();
		int i;
		boolean flag=true;
		for(i=0;i<100;i++)
		{
			if(g.getId()==yzid)
			{
				return g;	
			}
		}
		return null;
		
	}

}
