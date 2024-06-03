package com.kwan.s1.lang;

public class S5Main {

	public static void main(String[] args) {
		String name = "     	 kw         an          ";
		System.out.println(name);
		System.out.println(name.length());

		name = name.strip();
		System.out.println(name);
		System.out.println(name.length());

		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name.length());

		name = "kwan-32*인천";
		// parsing
		name = name.replace("*", "-");
		String[] datas = name.split("-");
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}

		String n = "";

		n = n.valueOf(32);

		System.out.println(n);

	}

}
