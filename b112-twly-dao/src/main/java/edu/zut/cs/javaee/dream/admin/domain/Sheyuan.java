package edu.zut.cs.javaee.dream.admin.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;
/*社员表名字*/
@Table(name="T_ADMIN_USER")
@Entity
public class Sheyuan extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	/*社员密码*/
	@Column(name = "password")
	String password;
	/*社员姓名*/
	@Column(name = "usename")
	String name;
	/*社员所在社团*/
	@Column(name = "mass")
	String post;
	/*社员电子邮件*/
	@Column(name = "Email")
	String email;
	/*实体类的get set方法*/

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