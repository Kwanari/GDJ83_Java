package com.kwan.s2.util.collections.ex3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Collection1 {

	public List<Integer> makeList() {
//		ArrayList<Integer> ar = new ArrayList<Integer>();

		List<Integer> ar = new Vector<Integer>();

		ar.add(1);
		ar.add(2);

		return ar;
	}

	public Map<String, Integer> makeMap() {

		Map<String, Integer> map = new HashMap<String, Integer>();

		return map;

	}

}
