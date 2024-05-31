package com.kwan.s4;

public final class Car {

	// 접근지정자 [그외지정자] 데이터타입 변수명

	// 클래스변수 선언
	public static String company;

	// 멤버변수 선언
	public final int PRICE; // final선언했을 때 변수명 대문자로 선언
	{
		this.PRICE = 30;
	}

	// 클래스메서드 선언
	public static void info() {
		System.out.println(Car.company);
//		System.out.println(this.price);
		// 멤버변수가 힙영역에 객체의 주소로 만들어지기 전 메서드영역이 먼저 있기때문에 오류
		System.out.println("스태틱 메서드");
//		this.info2();
	}

	public final void info2() {
		Car.info();
		final int num; // 변수>상수로바뀜
	}

}
