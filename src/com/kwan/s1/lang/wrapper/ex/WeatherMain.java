package com.kwan.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO (Data Transfer Object
		// VO (Value Object)
		WeatherDTO[] wdto = new WeatherService().init();
//		WeatherView wv = new WeatherView();
		WeatherController wc = new WeatherController();

//		wv.view(wdto);
		wc.start(wdto);

	}
}
