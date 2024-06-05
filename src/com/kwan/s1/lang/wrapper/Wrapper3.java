package com.kwan.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호입력");
		String jumin = sc.next();

		// 1. 성별 검증
		char s = jumin.charAt(8);

		if (s == '1' || s == '3') {
			System.out.println("성별: 남");
		} else if (s == '2' || s == '4') {
			System.out.println("성별: 여");
		} else {
			System.out.println("입력 잘못됨");
		}

		// 2. 나이 계산 2024-출생년

		int age = Integer.parseInt(jumin.substring(0, 2));
		int r = 1900;
		System.out.println(age);

		if (s == '3' || s == '4') {
			r = 2000;
		}

		age = 2024 - age - r;

		System.out.println("나이: " + age);

		// 3. 주민번호 유효성 검증
		// 1 2 3 4 5 6 - 1 2 3 4 5 6 7(검증용 숫자)
		// 2 3 4 5 6 7 - 8 9 2 3 4 5
		// 총합을 11로 나눈 나머지 구하기
		// 나머지 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		// 11로뺀 결과값이 두자리수 라면 결과값을 10으로 나눈 나머지를 검증용 숫자와 비교

		int c = 2;
		int sum = 0;
//		jumin.replace("-",""); 미리 -를 빼도됨.
		for (int i = 0; i < jumin.length() - 1; i++) {
			char n1 = jumin.charAt(i);
			if (i == 6) {
				continue;
			}
			String n2 = String.valueOf(n1);
			int num1 = Integer.parseInt(n2);
			sum = num1 * c;
			c++;
			if (c > 9) {
				c = 2;
			}
		}
		sum = 11 - sum % 11;

		if (sum > 9) {
			sum = sum % 10;
		}

		int sum2 = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length() - 1)));

		if (sum == sum2) {
			System.out.println("go");
		} else {
			System.out.println("다시");
		}

//		String a = jumin.substring(0, 6);
//		String b = jumin.substring(7, 13);
//
//		int result = 0;
//
//		for (int i = 0; i < a.length(); i++) {
//			int num = Integer.parseInt(a.substring(i, i + 1));
//			result += num * (i + 2);
//		}
//
//		for (int i = 0; i < b.length(); i++) {
//			int num = Integer.parseInt(b.substring(i, i + 1));
//			if (i < 2) {
//				result += num * (i + 8);
//			} else {
//				result += num * i;
//			}
//
//		}
//
//		int fin = 11 - result % 11;
//
//		if (fin == Integer.parseInt(jumin.substring(13))) {
//			System.out.println("정상");
//		} else if (fin % 10 == Integer.parseInt(jumin.substring(13))) {
//			System.out.println("정상");
//		} else {
//			System.out.println("다시");
//		}

//		if (fin > 9) {
//			fin = fin % 10;
//			if (fin == Integer.parseInt(jumin.substring(13))) {
//				System.out.println("정상");
//			}
//		} else if (fin < 9) {
//			if (fin == Integer.parseInt(jumin.substring(13))) {
//				System.out.println("정상");
//			}
//		} else {
//			System.out.println("다시");
//		}

	}
}
