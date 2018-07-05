package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;
/*教师表名字*/
@Table(name="Teacher")
@Entity

public class Teacher extends BaseEntity {
	
	private static final long serialVersionUID = -1751952224371998469L;
	/*教师名字*/
	@Column(name = "TeacherName")
	private String teacherName;
	/*教师密码*/
	@Column(name = "Teacherpassword")
	private String teacherpassword;
	/*实体类的get set方法*/
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
