package jp.frontierinfo.common.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstantInfo {
	
	/**
	 * SessionKey情報
	 */
	// ユーザーログイン情報SessionKey
	public static final String USER_LOGIN_INFO = "USER_LOGIN_INFO";
	
	// 認証コードSessionKey
	public static final String REGISTER_SMS_CODE = "REGISTER_SMS_CODE";
	
	// メールアドレスSessionKey
	public static final String REGISTER_EMAIL = "REGISTER_EMAIL";
	
	// ユーザー管理画面:ユーザー存在状態
	public static Map<Object, String> DELETE_STATUS;
	static {
		DELETE_STATUS = new HashMap<>();
		DELETE_STATUS.put(true, "已删除");
		DELETE_STATUS.put(false, "正常");
	}
	
	/**
	 * ユーザー審査情報
	 */
	// 00:審査未依頼
	public static final String USER_CENSOR_STATUS_00 = "00";
	// 01:審査中
	public static final String USER_CENSOR_STATUS_01 = "01";
	// 02:審査完了
	public static final String USER_CENSOR_STATUS_02 = "02";
	// 03:審査拒否
	public static final String USER_CENSOR_STATUS_03 = "03";
	
	/**
	 * ユーザー権限情報
	 */
	// 一般ユーザー
	public static final String USER_RANK_NORMAL = "01";
	// VIPユーザー
	public static final String USER_RANK_VIP = "02";
	// 一般管理員
	public static final String USER_RANK_NORMAL_MANAGER = "08";
	// 上級管理員
	public static final String USER_RANK_HIGH_MANAGER = "09";
	
	/**
	 * ユーザー操作情報
	 */
	// 異性ユーザーに友達リクエスト請求を実施
	public static final String RELATION_LEVEL_1_REQUEST = "請求";
	// 異性ユーザーから個人写真交換の請求を承認
	public static final String RELATION_LEVEL_1_AGREE = "承認";
	// 異性ユーザーから個人写真交換の請求を拒否
	public static final String RELATION_LEVEL_1_DISAGREE = "拒否";
	// 異性ユーザーから連絡先交換の請求を承認
	public static final String RELATION_LEVEL_2_AGREE = "承認";
	// 異性ユーザーから連絡先の請求を拒否
	public static final String RELATION_LEVEL_2_DISAGREE = "拒否";
	
	/**
	 * 一般ユーザーの使用権限
	 */
	// 一般ユーザー友達リクエスト回数制限
	public static final int RELATION_COUNT = 10;
	// 一般ユーザー友達リクエスト成功の回数制限
	public static final int RELATION_SUCCESS_COUNT = 3;
	
	/**
	 * 性别
	 */
	public static final String MALE = "男";
	public static final String FEMALE = "女";
	
	
	/**
	 * ユーザーがアップロードした写真のサイズ
	 */
	// プロフィール写真上限 100KB
	public static final long AVATAR_IMG_SIZE = 100*1024;
	// 個人写真上限 3MB
	public static final long USER_IMG_SIZE = 3*1024*1024;
	
	/**
	 * 画面用性别ラジオボタン
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
	 * ユーザー写真のサーバ保存パス
	 */
	public static final String FILE_SAVE_PATH = "/Frontier-info/xiangqin/userdata";
	public static final String FILE_SAVE_UID_PATH = "/uid_";
	public static final String FILE_STATIC_PATH = "static";
	
	/**
	 * ログイン種別
	 */
	public static final String EMAIL = "email";
	public static final String MOBILE = "mobile";
	
	
}
