package com.kwan.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {

		// 문자열 > 문자 > 0,1
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String fileName = sc.next();

		File file = new File("C:\\study", fileName);
		FileWriter fw = null; // finally .close()를 위해 try밖에 선언

		try {
			fw = new FileWriter(file, true); // boolean append - True > 기존내용에 연결
			System.out.println("입력");

			// e, E 입력 종료

			while (true) {
				String s = sc.next();

				if (s.toUpperCase().equals("E")) {
					break;
				}
				fw.write(s + "\r\n");// 기본 스트링타입, 덮어씌워진다, \n 엔터와 같은 효과
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

}
