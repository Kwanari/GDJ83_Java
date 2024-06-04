package com.kwan.s1.lang.wrapper.ex;

public class WeatherService {
	// Business Layer
	// DAO (Data Access Object)

	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 ,33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public void init() {
		// sb에 있는것을 문자열 변수에 담아 출력
		String info = sb.toString(); // StringBuffer타입 참조변수를 String타입으로 변환

		info = info.replace(",", "-");
//		info = info.replace(" ", "");

		String[] ar = info.split("-");

//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}

		WeatherDTO[] wdto = new WeatherDTO[ar.length / 4];

		for (int i = 0; i < ar.length / 4; i++) {
			for (int j = i * 4; j < j + 4; j++) {
				wdto[i] = new WeatherDTO();
				wdto[i].setCity(ar[j].trim());
				wdto[i].setGion(Double.parseDouble(ar[j + 1].trim()));
				wdto[i].setStatus(ar[j + 2].trim());
				wdto[i].setHumidity(Integer.parseInt(ar[j + 3].trim()));
				System.out.println(wdto[i].getCity());
				System.out.println(wdto[i].getGion());
				System.out.println(wdto[i].getStatus());
				System.out.println(wdto[i].getHumidity());
				break;
			}
		}
	}

}
