package com.kwan.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb;
	private Scanner sc;

	public ProductService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20,");
	}

	// init

	public ArrayList<ProductDTO> init() {

		String info = sb.toString();
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		StringTokenizer st = new StringTokenizer(info, ",");

		while (st.hasMoreTokens()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setPrice(Integer.parseInt(st.nextToken()));
			productDTO.setName(st.nextToken().trim());
			productDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			ar.add(productDTO);
		}

		return ar;
	}

	// 기존의 가방에 새상품 추가

	public void addProduct(ArrayList<ProductDTO> ar) {
		System.out.println("새상품 추가");

		ProductDTO pdto = new ProductDTO();
		System.out.println("가격 입력");
		pdto.setPrice(sc.nextInt());
		System.out.println("제품명 입력");
		pdto.setName(sc.next());
		System.out.println("재고 입력");
		pdto.setStock(sc.nextInt());

		ar.add(pdto);

	}

	// 기존의 가방을 받아 제품 삭제
	// 일치하는 물건이름 입력받아 삭제

	public int removeProduct(ArrayList<ProductDTO> ar) {
		System.out.println("삭제할 제품명 입력");
		String name = sc.next();
		int result = 0;

		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 0;
			}
		}
		return result;
	}
}
