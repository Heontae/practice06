package com.javaex.ex05;

public class Depart extends Employee {

	// 코드작성
	private String department;

	// 생성자
	public Depart() {

	}

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	// g/s
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// showInfo()
	public void showInformation() {
		System.out.println("이름:" + super.getName() + "   연봉:" + super.getSalary() + "   부서:" + department);
	}

}
