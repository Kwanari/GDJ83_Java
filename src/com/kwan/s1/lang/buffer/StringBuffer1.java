package com.kwan.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {

		// 문자열 누적하고 싶을 때
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		sb2.append(false);

		// winter + iu
		sb.append("winter");
		sb.append("iu");
		sb.append(10);
		String result = sb.toString();

		System.out.println(sb);
		System.out.println(result);

	}

}
