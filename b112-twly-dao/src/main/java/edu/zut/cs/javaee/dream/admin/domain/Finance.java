package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "Finances")
@Entity
public class Finance extends BaseEntity {
	private static final long serialVersionUID = -1L;
	@Column(name="finance_name")
	String financename;
	@Column(name="finance_pass")
	String password;
	public String getFinancename() {
		return financename;
	}
	public void setFinancename(String financename) {
		this.financename = financename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}