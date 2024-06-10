package com.kwan.s3.exception;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception {
		// 3살 - 3자리수이상 모름
		// 59 , 68
		int h = n1 + n2;

		if (h > 99) {

			throw new MyException("3자리수 X");
		}

	}
}
