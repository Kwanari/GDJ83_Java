package com.jang.study3.ex4;

public class Car {
	String color ;
	String brand;
	String company;
	int price = 1000;
	
	{
		//인스턴스 초기화 블럭
		price = 200;
	}
	
	
	//생성자 (Counsructor)
	
	//기본 생성자
	public Car() {
//		System.out.println("자동차가ㅣ만들어 집니다.");
//		this.color = "Black";
//		this.brand = "k3";
//		this.company = "kia";
//		this.price = 2500;
		// this() => 자기자신의 또 다른 생성자를 호출
		// this() 생성자 내에서 제일 첫줄에 위치 해야 함
		this(2500);
	}
	
	//생성자 오버로딩
	public Car(int price) {
		//멤버변수   =  지역변수 
//		this.price = price;
//		this.color = "Black";
//		this.brand = "k3";
//		this.company = "kia";
		this(price, "Black");
	}
	
	public Car(int price, String color) {
//		this.price = price;
//		this.color = color;
//		this.brand = "k3";
//		this.company = "kia";
		this(price,color,"k3");
	}
	
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "kia";
	}
	
	
	public void info() {
		System.out.println("info");
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(price);
	}	
}
