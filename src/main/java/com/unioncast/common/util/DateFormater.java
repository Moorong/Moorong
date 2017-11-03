package com.unioncast.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 将日期格式化的工具类
 * 
 * @author liutiejun
 * @date 2016年3月17日 下午4:16:29
 *
 */
public final class DateFormater {

	public final static String DATETIME_PATTERN = "yyyyMMddHHmmss";
	public final static String DATE_PATTERN = "yyyyMMdd";
	public final static String TIME_PATTERN = "HHmmss";
	public final static String STANDARD_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public final static String STANDARD_DATE_PATTERN = "yyyy-MM-dd";
	public final static String STANDARD_TIME_PATTERN = "HH:mm:ss";
	public final static String DATETIME2_PATTERN = "yyyyMMddHHmm";

	public final static String STANDARD_DATETIME_PATTERN_LOCAL = "yyyy年MM月dd日 HH:mm:ss";

	private final static String[] PATTERNS = new String[] {
			"MM/dd/yyyy h:mm:ss a", "yyyy/MM/dd HH:mm:ss",
			"yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss", "yyyy年MM月dd日 HH:mm:ss",
			"yyyy年MM月dd日 ah:mm:ss", "EEE MMM dd HH:mm:ss zzz yyyy",
			"EEE MMM dd HH:mm:ss zzz yyyy" };

	private final static Locale[] LOCALES = new Locale[] { Locale.US,
			Locale.US, Locale.CHINA, Locale.US, Locale.CHINA, Locale.CHINA,
			Locale.CHINA, Locale.US };

	private DateFormater() {
	}

	/**
	 * 将日期转化为字符串,格式可以自定义
	 * 
	 * @param date
	 * @param pattern
	 *            :返回结果中日期的格式
	 * @return
	 */
	public static String format(Date date, String pattern) {
		if (date == null)
			return null;

		DateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

	/**
	 * 将日期转化为字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return format(date, STANDARD_DATETIME_PATTERN);
	}

	/**
	 * 
	 * <p>
	 * 讲日期格式转化为字符串 到分钟
	 * </p>
	 *
	 * @param date
	 * @return
	 * @author dmpliufengjiao
	 * @date 2016年10月26日 下午3:36:55
	 */
	public static String formartMM(Date date) {
		return format(date, DATETIME2_PATTERN);
	}

	/**
	 * 将字符串解析为对应的日期
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date parse(String dateStr) {
		Date date = null;

		DateFormat format = null;

		String exceptionMessage = null;

		for (int i = 0; i < PATTERNS.length; i++) {
			try {
				format = new SimpleDateFormat(PATTERNS[i], LOCALES[i]);
				date = format.parse(dateStr);

				if (date != null) {
					return date;
				}
			} catch (ParseException e) {
				e.printStackTrace();
				date = null;
				exceptionMessage = e.getMessage();
			}
		}

		return date;
	}

	/**
	 * 将字符串解析为对应的日期
	 * 
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static Date parse(String dateStr, String pattern) {
		try {
			DateFormat format = new SimpleDateFormat(pattern);
			return format.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Date parse(String dateStr, String pattern, Locale locale) {
		try {
			DateFormat format = new SimpleDateFormat(pattern, locale);
			return format.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

}
