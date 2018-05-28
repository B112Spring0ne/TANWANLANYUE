package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name="bmyorg")
@Entity
public class Proprieter extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "password")
	String password;
	
	@Column(name = "usename")
	String name;
	
	@Column(name = "mass")
	String post;
	
	@Column(name = "Email")
	String email;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
