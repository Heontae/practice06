package com.javaex.ex04;

public class User {
	protected String id, password, name;

	// 생성자
	public User() {

	}

	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	// g/s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	// showInfo()
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password + ",# 이름: " + name);
	}

	// to String
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

}