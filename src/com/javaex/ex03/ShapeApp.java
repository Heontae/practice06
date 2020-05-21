package com.javaex.ex03;

public class ShapeApp {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(5, 5);
		t1.setFillColor("빨강");
		t1.setLineColor("파랑");
		t1.showInfo();

	}

}

//기본생성자 디폴트였는데 사라져서 다시만들어주고,
//private를 자식 클래스한테 공유하기위해 protected로 변경
