package com.kwan.s4.io.ex1;

import java.util.List;

public class Ex1Main {

	public static void main(String[] args) {

		ReadStudy rs = new ReadStudy();

		try {
			List<MenuDTO> arDTO = rs.read();

			for (int i = 0; i < arDTO.size(); i++) {
				System.out.println(arDTO.get(i).getMenuName());
				System.out.println(arDTO.get(i).getPrice());
				System.out.println(arDTO.get(i).getKcl());
				System.out.println("=================");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
