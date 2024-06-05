package com.kwan.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO (Data Transfer Object
		// VO (Value Object)
//		WeatherDTO[] wdto = new WeatherService().init();
//		WeatherView wv = new WeatherView();
//		wv.view(wdto);

		WeatherController wc = new WeatherController();

		wc.start();

	}
}
