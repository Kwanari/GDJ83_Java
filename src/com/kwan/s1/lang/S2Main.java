package com.kwan.s1.lang;

import java.util.Scanner;

public class S2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean a = obj1.equals(obj2);

		System.out.println(a);

		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println(t1 == t2);

		a = t1.equals(t2);
		System.out.println(a);

		String name = "winter";
		String name2 = sc.next();
		String name3 = "winter";
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2));

	}

}
