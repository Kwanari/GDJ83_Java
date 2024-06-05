package com.kwan.s1.lang.wrapper.ex;

public class WeatherDTO {
	// DTO의 모든 멤버변수는 private 설정
	// getter, setter 필요
	// 생성자 여러개만들어도 상관없지만 기본생성자는 필수

	// 도시명
	private String city;
	// 온도
	private double gion;
	// 날씨정도
	private String status;
	// 습도
	private int humidity;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}