package com.jang.study3.ex4;

public class Ex4Main {
	
	public static void main(String[] args) {
		
		//new 생성자를 호출
		Car car = new Car();
		car.info();	
		
		Car car2 = new Car(200);
		car2.info();
		
		// 지금 에러가 뜨는건 기본 생성자가 있는데 또 한번 오버로딩한 생성자를 만들어서
		// 프로그램이 오버로딩한 생성자를 가르켜 매개변수 값을 입력안했다고 에러가 뜬다.
		Bike bike = new Bike("",4);
	}
}
