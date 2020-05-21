package com.javaex.ex05;

public class Employee {

	private String name;
	private int salary;

	// 생성자
	public Employee() {
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// showInfo
	public void showInformation() {
		System.out.println("이름:" + name + "연봉:" + salary);
	}

}
