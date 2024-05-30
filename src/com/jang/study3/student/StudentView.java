package com.jang.study3.student;

public class StudentView {
	
	public void view(String str) {
		System.out.println(str);
	}
	
	public void view(Student student) {
		System.out.println(student.name);
		System.out.println(student.num);
	}
	
	public void view(Student[] students) {
		//학생들의 모든 정보 출력
		//ex)컨트롤러에서 2번 누르면 이 메소드 출력
		System.out.println("view -출력");
		
		// 매개변수 값을 받았다치고 그값을 다시 Controller에 전달
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
		}
		
	}
	
}
