package com.kwan.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호입력");
		String jumin = sc.next();

		// 1. 성별 검증

		int mid = jumin.lastIndexOf("-") + 1;

		if (jumin.charAt(mid) == '1' || jumin.charAt(mid) == '3') {
			System.out.println("남");
		} else if (jumin.charAt(mid) == '2' || jumin.charAt(mid) == '4') {
			System.out.println("여");
		} else {
			System.out.println("입력 잘못됨");
		}

	}
}
