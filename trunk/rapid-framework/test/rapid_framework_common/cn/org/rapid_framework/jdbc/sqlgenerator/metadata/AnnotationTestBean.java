package cn.org.rapid_framework.jdbc.sqlgenerator.metadata;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ann_test_bean")
public class AnnotationTestBean {
	private String userName;
	private int age;
	private String password;
	@Id
	@Column(name="ann_id")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="ann_age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
