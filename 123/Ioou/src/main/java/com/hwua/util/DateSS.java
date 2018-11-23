package com.hwua.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSS {
	/**
	 * 将日期对象转换为字符串格式
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(date);
		return str;
	}

	/**
	 * 将日期对象转换为字符串格式
	 * 
	 * @param date
	 * @return
	 */
	public static String dateHMSToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		return str;
	}

	/**
	 * String类型转换为java.util.Date
	 * 
	 * @param str
	 *            日期格式的字符串
	 * @return
	 * @throws ParseException
	 */
	public static Date stringTodate(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}

	/**
	 * String类型转换为java.util.Date
	 * 
	 * @param str
	 *            日期格式的字符串
	 * @return
	 * @throws ParseException
	 */
	public static Date stringTodateHMS(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = null;
		try {
			d = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}

}
