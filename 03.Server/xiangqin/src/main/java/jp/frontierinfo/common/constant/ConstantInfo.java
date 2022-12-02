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
	 * 用户审查阶段数据
	 */
	// 00:未提交审核
	public static final String USER_CENSOR_STATUS_00 = "00";
	// 01:审核中
	public static final String USER_CENSOR_STATUS_01 = "01";
	// 02:审核通过
	public static final String USER_CENSOR_STATUS_02 = "02";
	// 03:审核拒绝
	public static final String USER_CENSOR_STATUS_03 = "03";
	
	/**
	 * 用户权限数据
	 */
	// 普通用户
	public static final String USER_RANK_NORMAL = "01";
	// VIP用户
	public static final String USER_RANK_VIP = "02";
	// 普通管理员
	public static final String USER_RANK_NORMAL_MANAGER = "08";
	// 高级管理员
	public static final String USER_RANK_HIGH_MANAGER = "09";
	
	/**
	 * 用户操作数据
	 */
	// 向异性用户发起打招呼请求
	public static final String RELATION_LEVEL_1_REQUEST = "请求";
	// 异性用户同意打招呼请求
	public static final String RELATION_LEVEL_1_AGREE = "同意";
	// 异性用户拒绝打招呼请求
	public static final String RELATION_LEVEL_1_DISAGREE = "拒绝";
	// 异性用户同意获取联系方式
	public static final String RELATION_LEVEL_2_AGREE = "同意";
	// 异性用户拒绝获取联系方式
	public static final String RELATION_LEVEL_2_DISAGREE = "拒绝";
	
	/**
	 * 性别
	 */
	public static final String MALE = "男";
	public static final String FEMALE = "女";
	
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
