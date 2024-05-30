package com.kwan.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		// 1. 학생정보 입력 2. 전체정보출력 3. 학생검색 4.종료

		Scanner sc = new Scanner(System.in);

		StudentService service = new StudentService();
		StudentView view = new StudentView();
		Student[] students = null;
		Student find = null;

		boolean flag = true;

		while (flag) {
			System.out.println("1.학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생정보입력");
				students = service.makeStudent();
				// students 변수에 학생의 정보가 입력된 배열주소 저장

			} else if (select == 2) {
				System.out.println("전체정보출력");
				if (students != null) {
					view.view(students);
				} else {
					view.view("학생정보 먼저 입력");
				}

			} else if (select == 3) {
				System.out.println("학생검색");
				Student stu = service.findByNum(students);
				if (stu != null) {
					view.view(stu);
				} else {
					view.view("검색결과 없음");
				}

			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못입력");
			}
		}
	}
}
