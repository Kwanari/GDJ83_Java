package com.kwan.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer Science";

		String result = name.substring(2, 7);

		System.out.println(result);

		System.out.println("파일명 입력하세요. 확장자포함");
		name = sc.next();

		int a = name.indexOf(".", 0);

		System.out.println(name.substring(a + 1));
	}

}
