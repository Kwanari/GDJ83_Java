package com.kwan.s1.lang.wrapper.ex;

public class WeatherService {
	// Business Layer
	// DAO (Data Access Object)

	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public void init() {
		// sb에 있는것을 문자열 변수에 담아 출력
		String info = sb.toString(); // StringBuffer타입 참조변수를 String타입으로 변환

		info = info.replace(",", "-");

		String[] ar = info.split("-");

		WeatherDTO wdto = new WeatherDTO();

		for (int i = 0; i < ar.length; i++) {
			for (int j = i * 4; j < 1; j++) {
				wdto.setCity(ar[j].trim());
				wdto.setGion(Double.parseDouble(ar[j + 1].trim()));
				wdto.setStatus(ar[j + 2].trim());
				wdto.setHumidity(Integer.parseInt(ar[j + 3].trim()));
			}
		}

	}

}
