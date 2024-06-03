package com.kwan.s1.lang;

public class S3Main {

	public static void main(String[] args) {
		String name = "finfl.fdf";

		int a = 0;

		while (a != -1) {
			a = name.indexOf("f", a);
			if (a > -1) {
				System.out.println(a);
				a++;
			} else {
				break;
			}
		}
		System.out.println("끝");
	}

}
