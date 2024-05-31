package com.kwan.s4;

public class Customer {
	int money;
	int point;

	public void buy(Electronics e) {
		// 가진 돈에서 물건의 가격 차감
		// 가진 포인트에 물건의 포인트 적립

		this.money = this.money - e.price;
		this.point = this.point + e.point;

		System.out.println(money);
		System.out.println(point);

	}
}
