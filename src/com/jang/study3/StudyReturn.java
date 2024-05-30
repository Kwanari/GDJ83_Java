package com.jang.study3;

import java.util.Random;

public class StudyReturn {
	
	public Test t5(Test t) {
		System.out.println(t.level);
		t.level = 200;
		t = new Test();// t1
		t.level = 500;
		System.out.println(t.level);
		System.out.println(t);
		
		return t;
	}
	
	public void t4(int sal) {
		//월급을 받아서(매개변수로 받는다함)-> sal | 세금3.3% 제외한 실수령액 계산 
		// 실수령 = 월급 -월급 * 0.033
		 double result = sal - sal * 0.033;
		 System.out.println(result);
		// 출력
		// 리턴을 한다면 void 대신 double 써야함 | 리턴할 값의 데이터타입이 같아야함
		// 호출하는 쪽에서 데이터를 줌 -> 매개변수
	}
	
	// 접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선언])
	// void 되돌려줄 값이 없다
	// return 타입 제한없음
	public int t1() {
		int num = 3;
		int num2 = 6;
		int result = num * num2;

		// 리턴의 데이터 개수 딱 하나만 가능
		return result; // 리턴 후 메서드 종료
	}

	public void t2() {
		Random random = new Random();
		// 0이상 10미만의 점수 하나를 램덤하게 리턴
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return; // 가능하지만 데이터X
		} else
			System.out.println(num);
	}
}
