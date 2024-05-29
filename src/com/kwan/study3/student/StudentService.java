package com.kwan.study3.student;

import java.util.Scanner;

public class StudentService {

	Student student = new Student();

	public void makeStudent() {
		System.out.println("학생정보입력");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		student.num = num;
	}

}
