package com.kwan.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {
	public static void main(String[] args) {

		String n = "123";

		Object obj = n;

		System.out.println(obj instanceof String);

		// 로또 번호 1 - 45 : 6개

		Random random = new Random();
//		int num = random.nextInt(45) + 1;// 6

		ArrayList<Integer> list = new ArrayList<Integer>();

		while (list.size() != 6) {

		}

		int[] ar = new int[6]; // 중복있음

		for (int i = 0; i < ar.length; i++) {
			ar[i] = random.nextInt(45) + 1;
			System.out.println(ar[i]);
		}

		HashSet<Integer> hs = new HashSet<Integer>(); // 중복없음

		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}

	}
}
