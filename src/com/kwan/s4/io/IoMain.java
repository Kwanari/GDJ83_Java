package com.kwan.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {

	public static void main(String[] args) {
		// bit
		InputStream is = System.in;

		// char
		InputStreamReader ir = new InputStreamReader(is);

		// String
		BufferedReader br = new BufferedReader(ir);

		// 입력받을 준비 끝
		System.out.println("입력하세요");
		String s = "";
		// 스캐너 클래스와 같다
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}

}
