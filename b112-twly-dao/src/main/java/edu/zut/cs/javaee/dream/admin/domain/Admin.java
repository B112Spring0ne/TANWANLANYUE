package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;
@Entity
@Table(name="admin")
public class Admin extends BaseEntity {

	private static final long serialVersionUID = -1L;
	@Column(name="admin_id")
	String Admin_ID;
	@Column(name="admin_id")
	String password;
	public String getAdmin_ID() {
		return Admin_ID;
	}
	public void setAdmin_ID(String admin_ID) {
		Admin_ID = admin_ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
