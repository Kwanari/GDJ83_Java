package com.kwan.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer Science";

		String result = name.substring(2, 7);

//		System.out.println(result);

		System.out.println("파일명 입력하세요. 확장자포함");
		name = sc.next();

		// 확장자만 분리
		// jpg, png, gif, jpeg, jiff

		String[] id2 = { "jpg", "png", "gif", "jpeg", "jiff" };

		int dot = name.indexOf(".");
		String id = name.substring(dot + 1);
		boolean flag = false;

		System.out.println(id);

		for (int i = 0; i < 5; i++) {
			if (id2[i].equals(id)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("이미지 파일입니다.");
		} else {
			System.out.println("이미지 파일이 아닙니다.");
		}

//		if (id.equals("jpg") || id.equals("png") || id.equals("gif") || id.equals("jpeg") || id.equals("jiff")) {
//			System.out.println("이미지 파일입니다.");
//		} else {
//			System.out.println("이미지 파일이 아닙니다.");
//		}
	}

}
