package com.kwan.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {
	// Business Layer
	// DAO (Data Access Object)

	private StringBuffer sb; // 멤버변수

	public WeatherService() { // 기본생성자
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 ,33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public WeatherDTO[] init() { // 멤버메서드
		// sb에 있는것을 문자열 변수에 담아 출력
		String info = sb.toString(); // StringBuffer타입 참조변수를 String타입으로 변환

		info = info.replace(",", "-");

		WeatherDTO[] wdto = this.getWeathers(info);

		return wdto;

	}

	private WeatherDTO[] getWeathers(String info) { // 멤버메서드
		String[] ar = info.split("-");

		WeatherDTO[] wdto = new WeatherDTO[ar.length / 4];

		int idx = 0;

		for (int i = 0; i < wdto.length; i++) {
			wdto[i] = new WeatherDTO();
			wdto[i].setCity(ar[idx].trim());
			wdto[i].setGion(Double.parseDouble(ar[++idx].trim()));
			wdto[i].setStatus(ar[++idx].trim());
			wdto[i].setHumidity(Integer.parseInt(ar[++idx].trim()));
			idx++;
		}

		return wdto;
	}

	// 날씨정보 도시명 검색
	// 날씨정보 리턴하여 view에서 출력
	// findByCity

	public WeatherDTO findByCity(String city, WeatherDTO[] wdto) {
		WeatherDTO result = null;

		for (int i = 0; i < wdto.length; i++) {
			if (city.equals(wdto[i].getCity())) {
				result = wdto[i];
			}
		}

		return result;
	}// findbycity 메서드 끝

	// 날씨정보 추가
	// 도시명,기온,습도,상태 입력받고 기존의 날씨정보에 추가

	public WeatherDTO[] addWeather(WeatherDTO[] wdto) {
		Scanner sc = new Scanner(System.in);

		WeatherDTO[] wdtoPlus = new WeatherDTO[wdto.length + 1];

		for (int i = 0; i < wdto.length; i++) {
			wdtoPlus[i] = wdto[i];
		}

		System.out.println("도시명 입력");
		wdtoPlus[wdto.length].setCity(sc.next());
		System.out.println("온도 입력");
		wdtoPlus[wdto.length].setGion(sc.nextDouble());
		System.out.println("날씨 입력");
		wdtoPlus[wdto.length].setStatus(sc.next());
		System.out.println("습도 입력");
		wdtoPlus[wdto.length].setHumidity(sc.nextInt());

		wdtoPlus[wdto.length] = new WeatherDTO();

		return wdtoPlus;

	}

}
