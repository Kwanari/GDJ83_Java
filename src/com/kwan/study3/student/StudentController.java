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
				view.view(students);
			} else if (select == 3) {
				System.out.println("학생검색");
				find = service.findByNum(students);
				view.find(find);
			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못입력");
			}
		}
	}
}
