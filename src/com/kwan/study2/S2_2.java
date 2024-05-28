package com.kwan.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		// 학생수 입력 학생 수 만큼 이름 입력 받고 출력
		// a:80, b:90

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		// 1. 학생정보 입력 2. 학생정보 출력 3. 프로그램 종료
		String[] ar = null;
		int[] han = null;
		int[] eng = null;
		int[] math = null;
		int[] bun = null;
		int[] totals = null;
		double[] avgs = null;
		int num = 0;

		while (flag) {
			System.out.println("1.학생정보 입력, 2.학생정보 출력, 3.학생정보 검색, 4.성적순출력 5.프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생수 입력 하세요");
				num = sc.nextInt();

				ar = new String[num];
				han = new int[num];
				eng = new int[num];
				math = new int[num];
				bun = new int[num];
				totals = new int[num];
				avgs = new double[num];

				for (int i = 0; i < ar.length; i++) {
					bun[i] = i + 1;
					System.out.println("이름 입력 하세요");
					ar[i] = sc.next();
					System.out.println("국어점수 입력 하세요");
					han[i] = sc.nextInt();
					System.out.println("영어점수 입력 하세요");
					eng[i] = sc.nextInt();
					System.out.println("수학점수 입력 하세요");
					math[i] = sc.nextInt();

					totals[i] = han[i] + eng[i] + math[i];
					avgs[i] = totals[i] / 3.0;
				}
				break;
			case 2:
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < ar.length; i++) {
					System.out.print(bun[i] + "\t");
					System.out.print(ar[i] + "\t");
					System.out.print(han[i] + "\t");
					System.out.print(eng[i] + "\t");
					System.out.print(math[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.print(avgs[i] + "\n");
				}
				break;
			case 3:
				System.out.println("학생 번호 입력");
				int nums = sc.nextInt();

				for (int i = 0; i < bun.length; i++) {
					if (nums == bun[i]) {
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						System.out.print(bun[i] + "\t");
						System.out.print(ar[i] + "\t");
						System.out.print(han[i] + "\t");
						System.out.print(eng[i] + "\t");
						System.out.print(math[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.print(avgs[i] + "\n");
					}
				}
				break;
			case 4:
				double[] avgs2 = new double[num];
				for (int i = 0; i < ar.length; i++) {
					avgs2[i] = avgs[i];
				}

				for (int i = 0; i < ar.length - 1; i++) {
					for (int j = i + 1; j < ar.length; j++) {
						if (avgs[i] > avgs[j]) {
							int temp = (int) avgs[j];
							avgs[j] = avgs[i];
							avgs[i] = temp;
						} // if문
					} // j for문
				} // i for문

				for (int i = 0; i < ar.length; i++) {
					for (int j = 0; j < ar.length; j++) {
						if (avgs[i] == avgs2[j]) {
							System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
							System.out.print(bun[j] + "\t");
							System.out.print(ar[j] + "\t");
							System.out.print(han[j] + "\t");
							System.out.print(eng[j] + "\t");
							System.out.print(math[j] + "\t");
							System.out.print(totals[j] + "\t");
							System.out.print(avgs[i] + "\n");
						} // if
					} // j for
				} // i for
				break;
			default:
				flag = false;
			}

		}
	}
}
