package com.kwan.s1;

public class S1Main {

	public static void main(String[] args) {

		QueStudy que = new QueStudy();
		int[] ar = { 1, 2, 3 };
		ar = que.add(ar);

		System.out.println(ar.length);
	}

}
