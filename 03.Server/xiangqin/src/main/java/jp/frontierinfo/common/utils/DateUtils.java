package jp.frontierinfo.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtils {
	
    private static Logger logger = LoggerFactory.getLogger(DateUtils.class);

	public static Date stringToDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date res = null;
		try {
			res = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * 计算年龄
	 * 
	 * @param birthDay
	 * @return
	 * @throws Exception
	 */
	public static Integer getAge(Date birthDay) {

		Calendar cal = Calendar.getInstance();

		if (cal.before(birthDay)) { // 出生日期晚于当前时间，无法计算
			logger.error("出生日期晚于当前时间，无法计算");
			return 0;
		}

		int yearNow = cal.get(Calendar.YEAR); // 当前年份

		int monthNow = cal.get(Calendar.MONTH); // 当前月份

		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); // 当前日期

		cal.setTime(birthDay);

		int yearBirth = cal.get(Calendar.YEAR);

		int monthBirth = cal.get(Calendar.MONTH);

		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth; // 计算整岁数

		if (monthNow <= monthBirth) {

			if (monthNow == monthBirth) {

				if (dayOfMonthNow < dayOfMonthBirth)
					age--;// 当前日期在生日之前，年龄减一

			} else {

				age--;// 当前月份在生日之前，年龄减一

			}
		}
		return age;
	}
}
