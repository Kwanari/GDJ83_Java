package com.kwan.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		// Network
		// ip:port > socket
		// network 통신은 socket 끼리 1:1 통신

		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		boolean flag = true;

		try {
			ss = new ServerSocket(8282);
			// 서버열고 client 접속 기다림
			System.out.println("서버 실행 후 클라이언트 기다림");

			sc = ss.accept();
			System.out.println("클라이언트와 연결 성공");

			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = sc.getOutputStream();
			// 이진데이터 > 문자
			ow = new OutputStreamWriter(os);

			while (flag) {
				String msg = br.readLine();

				if (msg.toLowerCase().equals("exit")) {
					break;
				}

				System.out.println(msg);

				System.out.println("클라이언트로 보낼 내용 입력");
				String s = scanner.next();

				ow.write(s + "\r\n");
				ow.flush();// 강제로 출력

				if (msg.toLowerCase().equals("exit")) {
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
