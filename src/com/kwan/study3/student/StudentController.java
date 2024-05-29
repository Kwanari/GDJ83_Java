package com.kwan.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		// 1. 학생정보 입력 2. 전체정보출력 3. 학생검색 4.종료

		Scanner sc = new Scanner(System.in);

		StudentService ss = new StudentService();

		boolean flag = true;

		while (flag) {
			System.out.println("1.학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생정보입력");
				ss.makeStudent();

			} else if (select == 2) {
				System.out.println("전체정보출력");
			} else if (select == 3) {
				System.out.println("학생검색");
			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못입력");
			}
		}
	}
}
