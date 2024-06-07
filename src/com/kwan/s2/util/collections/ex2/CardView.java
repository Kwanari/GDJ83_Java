package com.kwan.s2.util.collections.ex2;

import java.util.ArrayList;

public class CardView {
	public void view(ArrayList<CardDTO> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.print("회사명 ");
			System.out.println(ar.get(i).getCompany());
			System.out.print("직책 ");
			System.out.println(ar.get(i).getPosition());
			System.out.print("이름 ");
			System.out.println(ar.get(i).getName());
			System.out.print("핸드폰번호 ");
			System.out.println(ar.get(i).getNum());
			System.out.print("우편번호 ");
			System.out.println(ar.get(i).getPost());
			System.out.print("================");
		}
	}
}
