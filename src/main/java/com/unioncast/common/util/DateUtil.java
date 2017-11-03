package com.unioncast.common.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 日期工具类
 * 
 * @author liutiejun
 * @date 2016年3月31日 上午11:07:11
 *
 */
public final class DateUtil {
	
	public static final String YYYYMMDD = "yyyy-MM-dd";

	public static final String pk = "yyyyMMddHHmmssSSS";

	public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

	public static final String YYYYMMDDHHMM = "yyyy-MM-dd HH:mm:ss";

	private DateUtil() {
	}
	/**
	 * 强转日期yyyy-MM-dd HH:mm:ss
	 * @author changguobin@unioncast.cn
	 * @date 2016-10-09 10:27:30
	 *
	 * @param dateStr
	 * @return Date
	 */
	public static Date parseWithYYYYMMDDHHMMSS(String dateStr) {

		Date date = null;

		if (!StringUtils.isEmpty(dateStr)) {
			try {
				date = DateUtils.parseDate(dateStr,
						new String[] { YYYYMMDDHHMMSS });
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		return date;

	}
	/**
	 * 获取当前日期时间yyyy-MM-dd HH:mm:ss
	 * @author changguobin@unioncast.cn
	 * @date 2016-10-09 10:26:49
	 *
	 * @return String
	 */
	public static String getCurrentStrDate() {
		Date date = new Date();
		return  formatWithYYYYMMDDHHMMSS(date);
	}
	/**
	 * 强转日期yyyy-MM-dd
	 * @author changguobin@unioncast.cn
	 * @date 2016-10-09 10:25:40
	 *
	 * @param dateStr
	 * @return Date
	 */
	public static Date parseWithYYYYMMDD(String dateStr) {

		Date date = null;

		if (!StringUtils.isEmpty(dateStr)) {
			try {
				date = DateUtils.parseDate(dateStr, new String[] { YYYYMMDD });
			} catch (ParseException e) {
			}
		}

		return date;

	}
	/**
	 * 格式化日期yyyy-MM-dd
	 * @author changguobin@unioncast.cn
	 * @date 2016-10-09 10:24:15
	 *
	 * @param date
	 * @return String
	 */
	public static String formatWithYYYYMMDD(Date date) {
		if (date == null) {
			return null;
		}
		return DateFormatUtils.format(date, YYYYMMDD);
	}
	/**
	 * 格式化日期yyyy-MM-dd HH:mm:ss
	 * @author changguobin@unioncast.cn
	 * @date 2016-10-09 10:24:45
	 *
	 * @param date
	 * @return String
	 */
	public static String formatWithYYYYMMDDHHMMSS(Date date) {
		if (date == null) {
			return null;
		}
		return DateFormatUtils.format(date, YYYYMMDDHHMMSS);
	}

	/**
	 * 使用给定的年、月、日、时、分、秒等数据生成对应的日期
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:15:39
	 *
	 * @param year
	 * @param month
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date getADate(int year, int month, int date, int hour, int minute, int second) {
		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month - 1, date, hour, minute, second);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

	/**
	 * 获得当前的Date，并且时、分、秒设置为0
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:15:51
	 *
	 * @return
	 */
	public static Date getCurrDate() {
		return setZeroForHMS(new Date());
	}

	/**
	 * 设置时、分、秒、毫秒为0
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:12:48
	 *
	 * @param date
	 * @return
	 */
	public static Date setZeroForHMS(Date date) {
		return updateDate(date, 0, 0, 0, 0);
	}

	/**
	 * 更新日期
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:13:41
	 *
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @param millisecond
	 * @return
	 */
	public static Date updateDate(Date date, int hour, int minute, int second, int millisecond) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		if (hour >= 0) {
			calendar.set(Calendar.HOUR_OF_DAY, hour);
		}

		if (minute >= 0) {
			calendar.set(Calendar.MINUTE, minute);
		}

		if (second >= 0) {
			calendar.set(Calendar.SECOND, second);
		}

		if (millisecond >= 0) {
			calendar.set(Calendar.MILLISECOND, millisecond);
		}

		return calendar.getTime();
	}

	/**
	 * 获取startDate，使之满足：endDate - startDate = days(两个日期相隔的天数)
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:14:01
	 *
	 * @param endDate
	 * @param days
	 * @return
	 */
	public static Date getStartDate(Date endDate, int days) {
		return modify(endDate, Calendar.DAY_OF_MONTH, -1 * days);
	}

	/**
	 * 获取startDate，使之满足：endDate - startDate = hours(两个日期相隔的小时)
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:14:20
	 *
	 * @param endDate
	 * @param hours
	 * @return
	 */
	public static Date getStartDateForHours(Date endDate, int hours) {
		return modify(endDate, Calendar.HOUR_OF_DAY, -1 * hours);
	}

	public static Date getStartDateForMinutes(Date endDate, int minutes) {
		return modify(endDate, Calendar.MINUTE, -1 * minutes);
	}

	/**
	 * 获取endDate，使之满足：endDate - startDate = days(两个日期相隔的天数)
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:14:34
	 *
	 * @param startDate
	 * @param days
	 * @return
	 */
	public static Date getEndDate(Date startDate, int days) {
		return modify(startDate, Calendar.DAY_OF_MONTH, days);
	}

	/**
	 * 获取startDate，使之满足：endDate - startDate = hours(两个日期相隔的小时)
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:14:50
	 *
	 * @param startDate
	 * @param hours
	 * @return
	 */
	public static Date getEndDateForHours(Date startDate, int hours) {
		return modify(startDate, Calendar.HOUR_OF_DAY, hours);
	}

	public static Date getEndDateForMinutes(Date startDate, int minutes) {
		return modify(startDate, Calendar.MINUTE, minutes);
	}

	private static Date modify(Date date, int field, int amount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);

		return calendar.getTime();
	}

	/**
	 * 获得两个日期之间相隔的天数
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:15:04
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getDaysBetween(Date date1, Date date2) {
		Calendar d1 = Calendar.getInstance();
		d1.setTime(date1);

		Calendar d2 = Calendar.getInstance();
		d2.setTime(date2);

		return getDaysBetween(d1, d2);
	}

	private static int getDaysBetween(Calendar d1, Calendar d2) {
		if (d1.after(d2)) {// swap dates so that d1 is start and d2 is end
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}

		int years = d2.get(Calendar.YEAR) - d1.get(Calendar.YEAR);// 年份差
		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);// 日期差

		for (int i = 0; i < years; i++) {
			days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);// 一年的天数
			d1.add(Calendar.YEAR, 1);// 增加一年
		}

		return days;
	}

	private static int getHoursBetween(Calendar d1, Calendar d2) {
		if (d1.after(d2)) {// swap dates so that d1 is start and d2 is end
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}

		int days = getDaysBetween(d1, d2);
		int hours = d2.get(Calendar.HOUR_OF_DAY) - d1.get(Calendar.HOUR_OF_DAY) + days * 24;

		return hours;
	}

	/**
	 * 获得两个日期之间相隔的小时数
	 * 
	 * @author liutiejun
	 * @date 2016年3月31日 上午11:15:23
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getHoursBetween(Date date1, Date date2) {
		Calendar d1 = Calendar.getInstance();
		d1.setTime(date1);

		Calendar d2 = Calendar.getInstance();
		d2.setTime(date2);

		if (d1.after(d2)) {// swap dates so that d1 is start and d2 is end
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}

		return getHoursBetween(d1, d2);
	}

	/**
	 * 获得当前时间对应的小时，取值0-23
	 * 
	 * @author liutiejun
	 * @date 2016年4月13日 下午5:20:12
	 *
	 * @return
	 */
	public static int getHour() {
		return getHour(new Date());
	}

	/**
	 * 获得当前时间对应的小时，取值0-23
	 * 
	 * @author liutiejun
	 * @date 2016年4月14日 下午12:06:30
	 *
	 * @param date
	 * @return
	 */
	public static int getHour(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 获得当前时间是星期几，取值1-7
	 * 
	 * @author liutiejun
	 * @date 2016年4月13日 下午5:19:52
	 *
	 * @return
	 */
	public static int getWeek() {
		return getWeek(new Date());
	}

	/**
	 * 获得当前时间是星期几，取值1-7
	 * 
	 * @author liutiejun
	 * @date 2016年4月14日 下午12:12:45
	 *
	 * @param date
	 * @return
	 */
	public static int getWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (week == 0) {
			week += 7;
		}

		return week;
	}
	
	private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 判断date是否在startTimeStr和endTimeStr区间中
	 * <p>
	 * </p>
	 * @author dmpchengyunyun
	 * @date 2017年2月9日 上午11:41:02
	 * @param date
	 * @param startTimeStr
	 * @param endTimeStr
	 * @return
	 */
	public static boolean isBetween(Date date , String startTimeStr , String endTimeStr) {
		long currentDate = date.getTime();
		long startTime = DateFormater.parse(startTimeStr, DEFAULT_DATE_PATTERN).getTime();
		long endTime = DateFormater.parse(endTimeStr, DEFAULT_DATE_PATTERN).getTime();
		if(currentDate >= startTime && currentDate <= endTime) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断date是否在startTime和endTime区间中
	 * <p>
	 * </p>
	 * @author dmpchengyunyun
	 * @date 2017年2月9日 下午2:24:46
	 * @param date
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static boolean isBetween(Date date , Date startTime , Date endTime) {
		String endTimeStr = DateFormater.format(endTime, "yyyy-MM-dd");
		endTimeStr = endTimeStr + " 23:59:59";
		Date newEnd = DateFormater.parse(endTimeStr, "yyyy-MM-dd HH:mm:ss");
		long currentDate = date.getTime();
		long startTimeL = startTime.getTime();
		long endTimeL = newEnd.getTime();
		if(currentDate >= startTimeL && currentDate <= endTimeL) {
			return true;
		}
		return false;
	}
	
}
