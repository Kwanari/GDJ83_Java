package com.kwan.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		String name = "kwan";
		int num = 2;

		ar.add(name);
		ar.add(num); // Integer overboxing
		ar.add(3.12);
		ar.add('a');
		ar.add(false);
		ar.add(num);

		ar.add(1, "test"); // 인덱스번호에 값 대입

		ar.set(0, 'c'); // 인덱스번호의 값을 수정

		ar.remove(0); // 0번 인덱스 삭제

		ar.remove(num);

//		ar.clear();

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		LinkedList lk = new LinkedList(); // List클래스를 상속받아 메서드 같음
		lk.add("ad");

	}

}
