package jp.frontierinfo.common.constant;

import java.util.HashMap;
import java.util.Map;

public class ConstantInfo {
	
	/**
	 * SessionKey信息
	 */
	// 用户登录信息SessionKey
	public static final String USER_LOGIN_INFO = "USER_LOGIN_INFO";
	
	// 手机验证码SessionKey
	public static final String REGISTER_SMS_CODE = "REGISTER_SMS_CODE";
	
	// 后台管理页面:用户存续状态键值表
	public static Map<Object, String> DELETE_STATUS;
	static {
		DELETE_STATUS = new HashMap<>();
		DELETE_STATUS.put(true, "已删除");
		DELETE_STATUS.put(false, "正常");
	}

}
