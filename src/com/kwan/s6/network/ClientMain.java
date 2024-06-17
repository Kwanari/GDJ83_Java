package com.kwan.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		boolean flag = true;

		try {
			// 서버의 ip, port 번호 입력
			socket = new Socket("localhost", 8282);
			System.out.println("서버 연결 성공");
			// 연결된 소켓의 output 스트림을 통해 이진데이터 가져옴
			os = socket.getOutputStream();

			// 위에서 가져온 이진데이터를 문자로 변환
			ow = new OutputStreamWriter(os);

			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while (flag) {

				System.out.println("서버로 보낼 메세지 입력");
				String str = sc.next();

				if (str.toLowerCase().equals("exit")) {
					break;
				}

				// ow 내용에 입력받은 str 문자열을 추가
				ow.write(str + "\r\n");
				ow.flush(); // 강제로 출력

				String s = br.readLine();

				if (s.toLowerCase().equals("exit")) {
					break;
				}

				System.out.println(s);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				ow.close();
				os.close();
				socket.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
