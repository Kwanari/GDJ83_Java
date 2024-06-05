package com.kwan.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	// start메서드
	// wdto의 초기화는 weathercontroller의 생성자 내에서 실행
	// 1. 날씨전체정보 출력
	// 2. 종료

	private WeatherDTO[] wdto; // 멤버변수, 참조변수
	private WeatherService weatherService; // 멤버변수, 참조변수
	private WeatherView weatherView; // 멤버변수, 참조변수

	public WeatherController() {
		weatherService = new WeatherService();
		weatherView = new WeatherView();
		wdto = weatherService.init();
	}

	public void start() {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("1.날씨 전체정보 출력, 2.종료");
			int num = sc.nextInt();

			if (num == 1) {
				weatherView.view(wdto);
			} else {
				flag = false;
			}
		} // while문 종료

	} // start 멤버메서드 종료
} // controller 클래스 끝
