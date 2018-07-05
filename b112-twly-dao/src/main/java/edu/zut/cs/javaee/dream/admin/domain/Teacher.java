package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;
@Table(name="Teacher")
@Entity

public class Teacher extends BaseEntity {
	
	private static final long serialVersionUID = -1751952224371998469L;
	
	@Column(name = "TeacherName")
	private String teacherName;
	
	@Column(name = "Teacherpassword")
	private String teacherpassword;
	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherpassword() {
		return teacherpassword;
	}

	public void setTeacherpassword(String teacherpassword) {
		this.teacherpassword = teacherpassword;
	}
}
