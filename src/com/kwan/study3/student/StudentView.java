package com.kwan.study3.student;

public class StudentView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(Student find) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(find.num + "\t");
		System.out.print(find.name + "\t");
		System.out.print(find.kor + "\t");
		System.out.print(find.eng + "\t");
		System.out.print(find.math + "\t");
		System.out.print(find.total + "\t");
		System.out.print(find.avg + "\t");
		System.out.println("");
	}

	public void view(Student[] students) {
		// 학생들의 모든 정보 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].num + "\t");
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].total + "\t");
			System.out.print(students[i].avg + "\t");
			System.out.println("");
		}

	}

}
