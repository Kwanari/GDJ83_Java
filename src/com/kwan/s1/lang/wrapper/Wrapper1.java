package com.kwan.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {

		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		Integer i = new Integer(10);
		int a = Integer.parseInt("10");

		System.out.println(a);

		// wrapper
		int num = 10;

		// auto boxing
		Integer n1 = num;

		// auto unboxing
		num = n1;

	}

}
