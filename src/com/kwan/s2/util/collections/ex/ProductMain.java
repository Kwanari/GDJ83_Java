package com.kwan.s2.util.collections.ex;

public class ProductMain {

	public static void main(String[] args) {

		ProductService ps = new ProductService();

		for (int i = 0; i < 3; i++) {
			System.out.println(ps.init().get(i).getName());
			System.out.println(ps.init().get(i).getPrice());
			System.out.println(ps.init().get(i).getStock());
		}

	}

}
