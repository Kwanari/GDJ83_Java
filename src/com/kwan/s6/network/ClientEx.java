package com.kwan.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		// 서버에서 보내온 데이터
		// 1. 학생 정보 리스트 2. 학생 상세 정보 3. 종료

		OutputStream os = null;
		OutputStreamWriter osw = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			Socket socket = new Socket("192.168.7.123", 8282);

			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while (true) {
				System.out.println("\n");
				System.out.println("메뉴 선택");
				System.out.println("1.학생 정보 리스트 , 2.학생 상세 정보, 3.종료");

				String s = sc.next();

				osw.write(s + "\r\n");
				osw.flush();

				if (s.equals("1")) {

					// 1. 학생 전체 정보

					String studentList = br.readLine();
					String[] ar = studentList.split(",");

					for (int i = 0; i < ar.length; i++) {

						System.out.print(ar[i]);
						System.out.print(",");

						if (i % 4 == 0) {
							System.out.print("\n");
						}
					}

				} else if (s.equals("2")) {
					// 2. 학생 상세 정보
					System.out.println(br.readLine());
					String num = sc.next();
					osw.write(num + "\r\n");
					osw.flush();

					String studentList = br.readLine();
					String[] ar = studentList.split(",");

					for (int i = 0; i < ar.length; i++) {

						System.out.print(ar[i]);
						System.out.print(",");

						if (i % 4 == 0) {
							System.out.print("\n");
						}
					}
				} else {

					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
