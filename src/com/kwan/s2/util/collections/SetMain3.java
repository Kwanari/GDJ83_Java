package com.kwan.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {
	public static void main(String[] args) {
		HashSet<Integer> ar = new HashSet<Integer>();
		ar.add(10);
		ar.add(8);
		ar.add(16);

		Iterator<Integer> ir = ar.iterator();

		while (ir.hasNext()) {
			Integer num = ir.next();
			System.out.println(num);
		} // 하나의 값 출력

	}
}
