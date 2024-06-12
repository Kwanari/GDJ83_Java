package com.kwan.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		File file = new File("C:\\study", "study.java");
		FileReader fr = null; // try안에서 선언하면 try내의 지역변수
		BufferedReader br = null; // catch 후부터 사용못함

		try {
			fr = new FileReader(file); // 0,1 > 문자
			br = new BufferedReader(fr); // 문자 > 문자열

			while (true) {
				String s = br.readLine(); // 한줄 읽어오기
				if (s == null) {
					break;
				}
				System.out.println(s);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // try-catch결과에 상관없이 무조건 실행
			try {
				br.close(); // 선언한 반대로 끊어주어야함
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("종료");

	}

}
