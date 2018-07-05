package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;
@Entity
@Table(name="admin")
public class Admin extends BaseEntity {

	private static final long serialVersionUID = -1L;
	
	@Column(name="num")
	String num;
	@Column(name="password")
	String password;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}