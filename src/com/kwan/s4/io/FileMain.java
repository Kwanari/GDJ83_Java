package com.kwan.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte) > 문자 > 문자열
		// 파일정보를 담고잇는 객체

		File file = new File("C:\\study");

		System.out.println(file.exists()); // 존재여부
		System.out.println(file.isDirectory()); // 폴더
		System.out.println(file.isFile()); // 파일
		System.out.println(file.getName()); // 파일명, 폴더명
		System.out.println(file.length());

		System.out.println("==================");

//		file = new File("C:\\study", "test.txt"); // "폴더", "파일명,폴더명"
		file = new File(file, "sub"); // 위의 file 변수를 가져옴
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		if (!file.exists()) {
			file.mkdir(); // sub 폴더 만듬, 이미 존재 > 만들지않음
		}

		file = new File("C:\\study\\sub2\\student");

		file.mkdirs();

		file = new File("C:\\study\\test.txt");
		file.delete();

		file = new File("C:\\study\\sub");
		file.delete();

		file = new File("C:\\study\\sub2");
		file.delete();

		file = new File("C:\\study");

//		String[] ar = file.list();

		File[] ar = file.listFiles();

		for (File f : ar) {
			if (f.isFile()) {
				System.out.println(f.getName() + " = 파일");
			} else {
				System.out.println(f.getName() + " = 폴더");
			}
		}
	}

}
