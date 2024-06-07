package com.kwan.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터 핸들링
		// 숫자형, 문자열, 논리형

		ProductService ps = new ProductService();
		ArrayList<ProductDTO> ar = ps.init();
//		ps.addProduct(ar);
		int result = ps.removeProduct(ar);

		if (result > 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

//		for (int i = 0; i < ar.size(); i++) {
//			System.out.print("가격 ");
//			System.out.println(ar.get(i).getPrice());
//			System.out.print("제품명 ");
//			System.out.println(ar.get(i).getName());
//			System.out.print("재고 ");
//			System.out.println(ar.get(i).getStock());
//			System.out.println("=====================");
//		}
	}

}
