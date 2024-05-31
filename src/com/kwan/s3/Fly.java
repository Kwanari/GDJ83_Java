package com.kwan.s3;

public interface Fly {

	// 상수 접근지정자 public만 가능
	public final static int NUM = 1;
	String NAME = "abc"; // 자동으로 입력되어있음

	// 추상메서드
	// 접근지정자 public abstract
//	public abstract void t1();
//
//	public int t2(); // 자동으로 입력되어있음
//
//	abstract String t3(int num);
//
//	void t4();

	public abstract void flyAble();
}
