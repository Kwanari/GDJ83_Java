package com.kwan.s4;

public class S4Main {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.brand = "Samsung";
		tv.price = 5000000;
		tv.point = 50;
		tv.size = 100;

		Computer com = new Computer();
		com.brand = "Apple";
		com.price = 3000000;
		com.point = 30;
		com.cpu = "M3";

		Phone phone = new Phone();
		phone.brand = "LG";
		phone.price = 1500000;
		phone.point = 15;
		phone.color = "gray";

		Customer customer = new Customer();
		customer.money = 10000000;
		customer.point = 0;

		customer.buy(0, 0);

	}

}
