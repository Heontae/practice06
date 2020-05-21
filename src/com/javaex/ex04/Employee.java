package com.javaex.ex04;

public class Employee extends User {
	private int salary;

	// 생성자
	public Employee() {

	}

	public Employee(int salary) {
		this.salary = salary;
	}

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	// g/s
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// showInfo()
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password + ", #이름: " + name + ", #월급:" + salary);
		if (super.name.equals("운영자")) {
			System.out.println("운영자의 월급은 " + this.salary + "원 입니다.");
		}

	}

}
