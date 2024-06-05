package com.kwan.s1.lang.wrapper.ex;

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

}
