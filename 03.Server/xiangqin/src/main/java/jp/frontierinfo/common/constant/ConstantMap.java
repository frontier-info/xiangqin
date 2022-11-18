package jp.frontierinfo.common.constant;

import java.util.HashMap;
import java.util.Map;

public class ConstantMap {
	
	public static Map<Object, String> DELETE_STATUS;
	
	static {
		DELETE_STATUS = new HashMap<>();
		DELETE_STATUS.put(true, "已删除");
		DELETE_STATUS.put(false, "正常");
	}

}
