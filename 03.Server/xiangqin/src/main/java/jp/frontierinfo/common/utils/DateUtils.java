package jp.frontierinfo.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
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

}
