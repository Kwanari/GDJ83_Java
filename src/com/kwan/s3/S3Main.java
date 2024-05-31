package com.kwan.s3;

public class S3Main {

	public static void main(String[] args) {
		// 배열선언
		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;

		Animal animal = tiger; // animal is a tiger
		animal = (Penguin) penguin;

		// System.out.println(animal.power);
		System.out.println(animal.name);

//		Animal[] dropship = new Animal[8];
//
//		dropship[0] = tiger;
//		dropship[1] = penguin;
//
//		Tiger ani = (Tiger) dropship[0];
//		Penguin peng = (Penguin) dropship[1];

	}

}
