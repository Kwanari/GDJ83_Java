package com.kwan.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// Generic : 타입에 제한
		// E : 변수

		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Integer> ar2 = new ArrayList(); // 뒤의 generic 생략가능

		ar.add("first");
//		ar.add(2);
//		ar.add('c');
//		ar.add(false);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		String name = (String) ar.get(0);// get메소드 return값은 object타입으로 나옴

	}

}
