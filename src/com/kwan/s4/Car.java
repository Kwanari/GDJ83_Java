package com.kwan.s4;

public class Car {

	// 접근지정자 [그외지정자] 데이터타입 변수명

	// 클래스변수 선언
	public static String company;

	// 멤버변수 선언
	public int price;

	// 클래스메서드 선언
	public static void info() {
		System.out.println(Car.company);
//		System.out.println(this.price);
		// 멤버변수가 힙영역에 객체의 주소로 만들어지기 전 메서드영역이 먼저 있기때문에 오류
		System.out.println("스태틱 메서드");
//		this.info2();
	}

	public void info2() {
		Car.info();

	}

}
