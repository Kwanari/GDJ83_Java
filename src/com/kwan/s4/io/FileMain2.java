package com.kwan.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// study2 폴더 삭제

		File file = new File("C:\\study2");

		File[] ar = file.listFiles();

		for (File f : ar) {

			f.delete();

		}

		file.delete();

	}

}
