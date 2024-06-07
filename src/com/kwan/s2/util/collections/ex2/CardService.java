package com.kwan.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CardService {
	private String str;
	private CardDTO cdto;
	private Scanner sc;

	public CardService() {
		cdto = new CardDTO();
		sc = new Scanner(System.in);

	} // CardService 기본생성자

	public void init(ArrayList<CardDTO> ar) {
		boolean flag = true;
		while (flag) {

			System.out.println("1. 명함 정보를 입력하세요.");
			System.out.println("2. 메인 메뉴");

			if (sc.nextInt() == 1) {
				System.out.println("회사명 입력");
				cdto.setCompany(sc.next());
				System.out.println("직책 입력");
				cdto.setPosition(sc.next());
				System.out.println("이름 입력");
				cdto.setName(sc.next());
				System.out.println("핸드폰 번호 입력 (-포함)");
				cdto.setNum(sc.next());
				System.out.println("우편번호 입력");
				cdto.setPost(sc.nextInt());

				ar.add(cdto);

			} else {

				flag = false;
			} // if문 끝

		} // while문 끝

	} // init 메서드 끝
}
