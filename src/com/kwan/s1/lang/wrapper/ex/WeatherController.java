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
	private Scanner sc;

	public WeatherController() { // this. 생략
		weatherService = new WeatherService(); // service 객체 생성, 기본생성자 내 날씨정보 값
		weatherView = new WeatherView(); // view 객체 생성
		wdto = weatherService.init(); // wdto 변수에 service클래스 init 메서드 return 값
		sc = new Scanner(System.in);
	}

	public void start() {
		boolean flag = true;

		while (flag) {
			System.out.println("1.날씨 전체 정보 출력");
			System.out.println("2.날씨 정보 검색"); // 도시명검색
			System.out.println("3.날씨 정보 추가");
			System.out.println("4.날씨 정보 삭제");
			System.out.println("5.프로 그램 종료");
			int num = sc.nextInt();

			if (num == 1) {
				weatherView.view(wdto); // this. 생략
			} else if (num == 2) {
				System.out.println("도시명을 입력하세요.");
				String city = sc.next();
				weatherView.view(weatherService.findByCity(city, wdto));
			} else if (num == 3) {
				wdto = weatherService.addWeather(wdto);
			} else if (num == 4) {
				System.out.println("삭제할 도시명 입력하세요.");
				wdto = weatherService.removeWeather(sc.next(), wdto);
			} else {
				flag = false;
				System.out.println("종료");
				// return; 메서드가 바로 종료
				// break;
			}
		} // while문 종료

	} // start 멤버메서드 종료
} // controller 클래스 끝
