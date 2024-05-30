package com.kwan.study3.ex4;

public class Car {
	String color;
	String brand;
	String company;
	int price = 1000;

	// 생성자 Conunstructor
	//
	// 밑으로 내려올수록 나중에 대입됨.

	{
		// 인스턴스 초기화 블럭
		price = 200;
	}

	// 기본생성자
	public Car() {
		// this() 자기자신의 또다른 생성자를 호출
		// this() 생성자 내에서 제일 첫줄에 위치해야함
		this(23500);
//		System.out.println("자동차가 만들어집니다");
//		this.color = "black";
//		this.brand = "제네시스";
//		this.company = "현대";
//		this.price = 23500; 

	}

	public Car(int price) { // 오버로딩
//		this.price = price;
//		this.color = "black";
//		this.brand = "제네시스";
//		this.company = "현대";
		this(price, "black");
	}

	public Car(int price, String color) {
//		this.price = price;
//		this.color = color;
//		this.brand = "제네시스";
//		this.company = "현대";
		this(price, color, "제네시스");
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "현대";
	}

	public void info() {
		System.out.println("info 입니다.");
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
	}
}
