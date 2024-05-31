package com.kwan.s2;

public class MidStudent extends Student {
	private int history;

	public MidStudent() {
		super();
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public void midinfo() {
		super.info();
		System.out.println(this.history);
	}

}