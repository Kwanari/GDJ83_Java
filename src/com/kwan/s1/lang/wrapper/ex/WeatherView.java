package com.kwan.s1.lang.wrapper.ex;

public class WeatherView {

	// view 메서드
	// 날씨들의 정보를 받아 출력

	public void view(WeatherDTO[] wdto) {

		for (int i = 0; i < wdto.length; i++) {
			System.out.println(wdto[i].getCity());
			System.out.println(wdto[i].getGion());
			System.out.println(wdto[i].getHumidity());
			System.out.println(wdto[i].getStatus());
			System.out.println("================");
		}
	}

	public void view(WeatherDTO result) {
		if (result != null) {
			System.out.println(result.getCity());
			System.out.println(result.getGion());
			System.out.println(result.getHumidity());
			System.out.println(result.getStatus());
		} else {
			System.out.println("정보없음");
		}

	}

}
