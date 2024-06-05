package com.kwan.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비밀번호 길이 최소 6글자 이상
		// 대소문자, 숫자 1개이상
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("비밀번호 입력");
			String pw = sc.next();
			for (int i = 0; i < pw.length(); i++) {
				flag = Character.isUpperCase(pw.charAt(i));
//				flag = Character.isLowerCase(pw.charAt(i));
				if (flag) {
					break;
				} else {
					flag = false;
				}
			}
			if (!flag) {
				flag = true;
				System.out.println("다시");
			} else {
				flag = false;
			}

		}

	}

}
