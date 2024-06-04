package com.kwan.s1.lang.wrapper;

import java.util.Scanner;

public class wrapper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("비밀번호 입력");
			String pw = sc.next();
			for (int i = 0; i < pw.length(); i++) {
				flag = Character.isUpperCase(pw.charAt(i));
				if (flag) {
					flag = false;
					break;
				} else {
					flag = true;
					System.out.println("다시");
					break;
				}
			}

		}

	}

}
