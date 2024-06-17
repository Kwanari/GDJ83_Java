package com.kwan.s5.date;

public class Single {

	// singleton: 객체 1개만 만들어짐

	private static Single single;

	private int num = 10;

	private Single() { // 기본생성자 class내부에서만 사용가능

	}

	public static Single get() { // 객체 만들지않고 사용가능
		if (single == null) { // single 내에 객체가 없다면
			Single.single = new Single(); // single 내에 Single객체 생성
		}
		return single.single; // single null이 아니라면 참조변수값 리턴
	}
}
