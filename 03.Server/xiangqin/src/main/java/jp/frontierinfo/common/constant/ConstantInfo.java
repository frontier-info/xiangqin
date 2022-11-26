package jp.frontierinfo.common.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstantInfo {
	
	/**
	 * SessionKey信息
	 */
	// 用户登录信息SessionKey
	public static final String USER_LOGIN_INFO = "USER_LOGIN_INFO";
	
	// 手机验证码SessionKey
	public static final String REGISTER_SMS_CODE = "REGISTER_SMS_CODE";
	
	// 手机号SessionKey
	public static final String REGISTER_MOBEL = "REGISTER_MOBEL";
	
	// 后台管理页面:用户存续状态键值表
	public static Map<Object, String> DELETE_STATUS;
	static {
		DELETE_STATUS = new HashMap<>();
		DELETE_STATUS.put(true, "已删除");
		DELETE_STATUS.put(false, "正常");
	}
	
	/**
	 * 页面用性别单选按钮数据
	 */
	public static List<String> sexLi;
	static {
		sexLi = new ArrayList<>();
		sexLi.add("男");
		sexLi.add("女");
	}
	
	/**
	 * PropertiesKey
	 */
	public static final String DATASOURCE_DRIVER = "spring.datasource.driver-class-name";
	
	public static final String DATASOURCE_URL = "spring.datasource.url";
	
	public static final String DATASOURCE_USERNAME = "spring.datasource.username";
	
	public static final String DATASOURCE_PASSWORD = "spring.datasource.password";
	
	/**
	 * 用户图片保存路径
	 */
	public static final String FILE_SAVE_PATH = "resources\\userdata\\uid_";
	
	
}
