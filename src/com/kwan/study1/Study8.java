package com.kwan.study1;

import java.util.Scanner;

public class Study8 {
	
	
	public static void main (String [] args) {
		//이중 for
		
		//FPS
		//총알 30발, 탄창 3개
		
		//1. 단발, 2. 점사
		//탕 30번, 타타탕 10번
		
		Scanner sc = new Scanner(System.in);
		
		

		for (int j=0;j<3;j++) {
			System.out.println("1번 단발, 2번 점사");
			int bullet = sc.nextInt();
			
			if(bullet==1) {
				for (int i=0;i<30;i++) {
					System.out.print("탕");
					}//i for 끝
			} else {
				for (int i=0;i<10;i++) {
					System.out.print("타타탕");
				}//i for 끝
			}//else 끝
		}//j for 끝
	}
}
