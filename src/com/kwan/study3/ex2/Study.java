package com.kwan.study3.ex2;

public class Study {
	public int[] remove(int[] ar) {

		int[] ar2 = new int[ar.length - 1];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = ar[i];
		}

		System.out.println("remove 후 길이 = " + ar2.length);
		return ar2;
	}

	public int[] add(int[] ar) {

		int[] ar2 = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}

		System.out.println("add 후 길이 = " + ar2.length);

		return ar2;
	}

}
