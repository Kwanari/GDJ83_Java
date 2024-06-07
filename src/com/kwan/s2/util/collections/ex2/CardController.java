package com.kwan.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CardController {
	private Scanner sc;
	private CardService cs;
	private CardView cv;
	private ArrayList<CardDTO> ar;

	public CardController() {
		sc = new Scanner(System.in);
		cs = new CardService();
		cv = new CardView();
		ar = new ArrayList<CardDTO>();

	}

	public void select() {
		boolean flag = true;
		while (flag) {
			System.out.println("메뉴");
			System.out.println("1. 명함 정보 입력");
			System.out.println("2. 명함 정보 출력");
			System.out.println("3. 종료");

			int sel = sc.nextInt();

			if (sel == 1) {
				cs.init(ar);
			} else if (sel == 2) {
				cv.view(ar);
			} else {
				flag = false;
			}
		}
	}
}
