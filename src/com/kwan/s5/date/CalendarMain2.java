package com.kwan.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();

		birth.set(1993, 11, 27);

		System.out.println(birth.getTime());

		long c = ca.getTimeInMillis();
		System.out.println(c / 86400000);

		System.out.println(1000 * 60 * 60 * 24);

		c = birth.getTimeInMillis();
		c = c + 86400000 * 100L;

		System.out.println(c / 86400000);

		birth.setTimeInMillis(c);
		System.out.println(birth.getTime());

		String n = "1995-03-12";
		String[] a = n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));

		System.out.println(ca.getTime());

		ca = Calendar.getInstance();

		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");

		String str = sd.format(ca.getTime());

		System.out.println(str);

		String s = UUID.randomUUID().toString();

		System.out.println(s);

	}

}
