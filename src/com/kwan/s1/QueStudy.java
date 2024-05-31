package com.kwan.s1;

public class QueStudy {
	public int[] add(int[] ar) {
		// 받은 배열에서 하나의 임의의 데이터 추가
		// 제일 앞에 추가
		// 추가된 배열을 리턴

		int[] ar2 = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i + 1] = ar[i];
		}
		return ar2;
	}

//	public int[] remove(int[] ar) {
//		// 맨 뒤의 요소 삭제하고
//		// 삭제된 배열을 리턴
//	}
}
