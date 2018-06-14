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
	private String TeacherName;
	@Column(name = "Teacherpassword")
	private String Teacherpassword;
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getTeacherpassword() {
		return Teacherpassword;
	}
	public void setTeacherpassword(String teacherpassword) {
		Teacherpassword = teacherpassword;
	}
	

}
