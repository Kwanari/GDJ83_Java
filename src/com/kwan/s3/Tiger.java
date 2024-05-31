package com.kwan.s3;

public class Tiger extends Animal {

	int power;

	// 메서드 오버로딩
	// 메서드 오버라이딩 overriding
	// 상속받은 메서드를 재정의
	// 메서드의 헤드는 동일, 접근지정자는 동일 또는 넓은 범위로 수정 가능

	public void sleep() {
		System.out.println("누워자기");
	}// 바디부분을 완성
}
