package com.kwan.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println(map.isEmpty()); // True

		map.put("k1", 1); // int > Integer autoboxing
		map.put("k2", 2);

		System.out.println(map.get("k1")); // 1

		System.out.println(map.size()); // 길이
		System.out.println(map.containsKey("k1")); // true
		System.out.println(map.containsValue(3)); // false
		System.out.println(map.containsKey("k3")); // false
		System.out.println(map); // {k1=1, k2=2}

		map.remove("k2", 3); // 일치하는 값이 없어 안없어짐
		map.clear(); // 객체는 그대로있지만 키,밸류 전체 삭제

		Iterator<String> it = map.keySet().iterator(); // set > 열거형

		while (it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}

	}

}
