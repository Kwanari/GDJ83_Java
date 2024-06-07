package com.kwan.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "kwan,30,wa,12,go,20,ko,10";
		StringTokenizer st = new StringTokenizer(names, ",");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			String num = st.nextToken();
			System.out.println(name.trim());
			System.out.println(num.trim());
		}

	}

}
