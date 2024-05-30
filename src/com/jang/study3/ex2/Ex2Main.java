package com.jang.study3.ex2;

public class Ex2Main {
	
	public static void main(String[] args) {
		//참조변수
		Study study = new Study();
		int [] ar = {1,2,3,4,5,6};
		
		//한개 삭제 하기
		// 값을 받아서 한개를 삭제후 다시 그 값을 다른 변수에 저장후
		// 리턴
//		ar = study.change(ar); // 매개변수로 보내는 값 => 인자값
//		System.out.println(ar.length);
		
//		for(int i=0; i < ar.length; i++) {
//			System.out.println(ar[i]);					
//		}
//		
		ar = study.remove(ar)
		;
		for(int i=0; i < ar.length; i++) {
			System.out.println(ar[i]);					
		}
		
	}
}
