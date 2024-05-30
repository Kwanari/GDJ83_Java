package com.jang.study3.ex2;

public class Study {
	
	public int[] change(int [] ar) {
		int[] newAr = new int[ar.length];
		
		for(int i=0; i<ar.length; i++) {
			newAr[i] = ar[i];
		}
		
		return newAr;
	

		
	}

	public int[] remove(int[] ar) {
		int [] arr = new int[ar.length];
		
		for(int i=0; i<ar.length; i++) {
			arr[i] = ar[i];
		}
		
		return arr;
	}
}



