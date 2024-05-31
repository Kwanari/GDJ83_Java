package com.jang.s1;

public class S1Main {
	public static void main(String[] args) {
		Object obj = new Object();
		
		Test test = new Test();
		String str = test.toString();
		System.out.println(str);
		
		String name = new String("jang");
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		System.out.println(name.toString());
	}
}
