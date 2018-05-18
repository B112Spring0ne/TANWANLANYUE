package edu.zut.cs.javaee.dream.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.admin.domain.Proprieter;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class ProprieterManagerTest extends GenericGenerator{

		@Autowired
		ProprieterManager proprieterManager;
		@Test
		public void test()
		{
			for(int i=0;i<100;i++)
			{
				 Proprieter p= new Proprieter();
				 p.setName("hxw"+i);
				 p.setEmail(i+"@qq.com");
				 p.setPassword("1234"+i);
				 p.setPost("社长");
				 proprieterManager.save(p);
			}
		}
		

	

}
