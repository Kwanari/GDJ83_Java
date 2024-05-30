package com.kwan.study3.ex3;

public class Car {
	String color;
	String Brand;
	String company;

	// 참조변수 this > 자신의 객체에 주소담고있음
	// 객체 생성시 값이 대입되는 변수
	// 각각의 객체 내에서만 사용가능
	// 생략가능

	public void info() {
		System.out.println("info 입니다.");
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(Brand);

		go(); // this. 생략 자기자신의 go라는 메서드 실행
	}

	public void go() {
		System.out.println(this.company);
	}
}
