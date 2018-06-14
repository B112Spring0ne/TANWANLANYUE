package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

public class Admin extends BaseEntity {

	 private String name;
	 
	    private String password;
	 
	    public Admin(String name, String password) {
	        this.name = name;
	        this.password = password;
	    }
	 
	    public void show() {
	        System.out.println("姓名：" + name + "，密码：" + password);
	    }
	     
	    public static void main(String[] args) {
	        Admin admin1 = new Admin("admin1", "111111");
	        admin1.show();
	        Admin admin2 = new Admin("admin2", "222222");
	        admin2.show();
	    }

}
