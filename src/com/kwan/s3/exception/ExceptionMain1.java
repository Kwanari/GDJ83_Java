package com.kwan.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num = 10;

			System.out.println("숫자입력");

			int num2 = sc.nextInt();
			System.out.println(num / num2);

//			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("0 나눌수없음");
		} catch (InputMismatchException e) {
			System.out.println("숫자의외의 입력 X");
		} catch (Exception e) {
			System.out.println("오류");
		} catch (Throwable e) {
			System.out.println("오류");
		}

		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(5);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
	}
}
