package com.kwan.s1.lang;

public class S3Main {

	public static void main(String[] args) {
		String name = "finfl.pdf";

		int a = 0;
		int num = 0;

		while (a != -1) {
			a = name.indexOf("f", num);
			if (a > -1) {
				System.out.println(a);
				num = num + a + 1;
			} else {
				break;
			}
		}
	}

}
