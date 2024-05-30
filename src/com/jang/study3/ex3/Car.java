package com.jang.study3.ex3;

public class Car {
	String color;
	String brand;
	String company;
	
	//참조변수(객체의 주소를 담고있는 변수) 
	//this => 자기자신의 객체의 주소를 담고 있다.
	//객체 생성시 값이 대입되는 변수
	//각각의 객체 내에서만 사용가능
	//this는 생략가능
	
	
	
	public void info() {
		System.out.println("info");
		System.out.println(this);
		// 여기서 this는 main에서 만든 객체의 주소를 가지고있다.
		System.out.println(this.color);
		System.out.println(this.color);
		System.out.println(brand);
		int result = this.go("df");
	
	}
	
	public int go(String name) {
		System.out.println(this.company);
		System.out.println(name);
		return 0;
	}
		
}
