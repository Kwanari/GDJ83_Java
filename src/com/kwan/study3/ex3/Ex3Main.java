package com.kwan.study3.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		Car car = new Car();

		car.color = "aqua";
		car.Brand = "Genesis";
		car.company = "hyundai";

		Car car2 = new Car();

		car2.color = "Black";
		car2.Brand = "Spotage";
		car2.company = "kia";

//		System.out.println(car);
//		car.info();
//		System.out.println(car2);
//		car2.info();

		Cal cal = new Cal();

		cal.hap(10L, 3);

	}

}
