package com.kwan.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadStudy {

	public List<MenuDTO> read() throws Exception {
		// info.txt 읽어오기
		// 1. 항목별 파싱 후 DTO등 만든 후에 리턴

		File file = new File("C:\\study", "info.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<MenuDTO> arDTO = new ArrayList<MenuDTO>();
		ArrayList al = new ArrayList();

		int i = 0;

		while (true) {

			String str = br.readLine();

			if (str == null) {
				break;
			}

			String[] ar = str.split(",");

			MenuDTO mDTO = new MenuDTO();

			mDTO.setMenuName(ar[i].trim());
			mDTO.setPrice(Integer.parseInt(ar[i + 1].trim()));
			mDTO.setKcl(Integer.parseInt(ar[i + 2].trim()));

			arDTO.add(mDTO);

//			StringTokenizer st = new StringTokenizer(str);
//
//			while (st.hasMoreTokens()) {
//				String s = st.nextToken(",");
//				System.out.println(s.trim());
//			}

		}

		br.close();
		fr.close();

		return arDTO;

	}
}
