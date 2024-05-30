package com.jang.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		// 1. 학생정보 입력 2. 전체정보출력 3. 학생검색 4.종료

		Scanner sc = new Scanner(System.in);

		StudentService service = new StudentService();
		
		StudentView studentView = new StudentView();
		
		Student[] students = service.makeStudent();
		
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("1.학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생정보입력");
				students = service.makeStudent();
			} else if (select == 2) {
				System.out.println("전체정보출력");
				if(students != null) {
					studentView.view(students);					
				}else {
					studentView.view("학생정보를 먼저 입력하세요");
				}

			} else if (select == 3) {
				System.out.println("학생검색");
				Student student = service.find(students);
				if(student != null) {
					studentView.view(student);					
				} else {
					studentView.view("검색 결과가 없습니다.");
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
