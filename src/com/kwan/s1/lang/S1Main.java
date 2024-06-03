package com.kwan.s1.lang;

import java.util.Scanner;

public class S1Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// import
		// 1. 같은 패키지 내에 있는 클래스는 생략
		// 2. java.lang 패키지 내의 클래스 사용 때 생략
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj == obj2);
		String n = "winter";
		String n2 = "winter";

		System.out.println(n == n2);

		System.out.println(n.charAt(1));

		n = sc.next();
		int l = n.length();

		for (int i = 0; i < l; i++) {
			System.out.println(n.charAt(i));
		}

		System.out.println(n.length() * 1000 + "원입니다");
	}
}
