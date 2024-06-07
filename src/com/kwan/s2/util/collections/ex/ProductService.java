package com.kwan.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb;

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
	}

	// init

	public ArrayList<ProductDTO> init() {

		String info = sb.toString();

		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();

		int i = 0;

		while (st.hasMoreTokens()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setPrice(Integer.parseInt(st.nextToken()));
			productDTO.setName(st.nextToken().trim());
			productDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			ar.add(productDTO);
		}

		return ar;
	}

}
