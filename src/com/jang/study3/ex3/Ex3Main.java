package com.jang.study3.ex3;

public class Ex3Main {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.color = "Red";
		car.brand = "카니발";
		car.company = "현대";
		
		Car car2 = new Car();
		car2.color = "Balck";
		car2.brand = "a7";
		car2.company = "audi";
		
//		System.out.println(car);
//		car.info();
//		
//		System.out.println(car2);
//		car2.info();
		
		Cal cal = new Cal();
		cal.hap(3, 3L);
		
	}
}
