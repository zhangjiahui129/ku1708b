package com.bw.test;

import java.util.Date;

public class MyUtils {
	
	//根据传入的日期获取年龄
	public static int getAge(Date src) {
		String d = "2010-5-6";
		String[] split = d.split(d);
		int one = Integer.parseInt(split.toString());
		Date date = new Date();
		int year = date.getYear();
		return year-one;
	}
	
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，
	//返回“2019-09-01 00:00:00”
	public static Date getDateByMonthInit(Date src) {
		Date d = new Date("2019-09-19 19:29:39");
		int year = d.getYear();
		int month = d.getMonth();
		int day = d.getDay();
		int hours = 00;
		int minutes =00;
		int seconds =00;
		d.setHours(hours);
		d.setMinutes(minutes);
		d.setSeconds(seconds);
		return src;
		
	}
	//根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，
	//返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static Date getDateByMonthLast(Date src) {
		return src;
		
	}
	
	//求未来日期离今天还剩的天数
	public static int getDaysByFuture(Date future) {
		Date d = new Date();
		return 0;
		
	}
	
	//求过去日期离今天过去的天数
	public static int getDayByDeparted(Date departed) {
		return 0;
		
	}
}
