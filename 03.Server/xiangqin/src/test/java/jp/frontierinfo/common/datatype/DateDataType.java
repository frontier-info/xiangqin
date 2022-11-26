package jp.frontierinfo.common.datatype;

import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.dbunit.dataset.datatype.AbstractDataType;
import org.dbunit.dataset.datatype.TypeCastException;

public class DateDataType extends AbstractDataType {

	public DateDataType() {
		super("DATE", Types.DATE, Date.class, false);
	}

	private static final String DATE_FORMATE1 = "yyyy/MM/dd";
	
	private static final String DATE_FORMATE2 = "yyyy-MM-dd";

	@Override
	public Object typeCast(Object value) throws TypeCastException {
		SimpleDateFormat format1 = new SimpleDateFormat(DATE_FORMATE1);
		SimpleDateFormat format2 = new SimpleDateFormat(DATE_FORMATE2);
		Date date = null;
		String targetValue = (String)value;
		try {
			if(targetValue.contains("/")) {
				date = format1.parse((String) value);
			} else if(targetValue.contains("-")) {
				date = format2.parse((String) value);
			} else {
				throw new ParseException("不能处理的日期类型", Types.DATE);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return date;
	}

	public int compare(Object o1, Object o2) throws TypeCastException {

		return o1.toString().equals(o2.toString()) ? 0 : 1;
	}

}
