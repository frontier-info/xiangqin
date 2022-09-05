package jp.frontierinfo.db.access;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.T01UserLoginInfoDao;
import jp.frontierinfo.db.entity.T01UserLoginInfo;

@Component
public class T01UserLoginInfoAccess {
	
	private T01UserLoginInfoDao t01UserLoginInfoDao;
	
	public T01UserLoginInfoAccess(T01UserLoginInfoDao t01UserLoginInfoDao) {
		this.t01UserLoginInfoDao = t01UserLoginInfoDao;
	}
	
	
	/**
	 * 用户存在与否验证(手机号)
	 * @param mobile
	 * @return
	 */
	public int userExistByPhone(String mobile) {
		return t01UserLoginInfoDao.userExistByPhone(mobile);
	}
	
	/**
	 * 用户登录验证(手机号)
	 * @return
	 */
	public T01UserLoginInfo loginVerifyWithPhone(String mobile, String password) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("mobile", mobile);
		params.put("password", password);
		return t01UserLoginInfoDao.loginVerifyWithPhone(params);
	}
	
	
	public int deleteByPrimaryKey(String uid) {
		return t01UserLoginInfoDao.deleteByPrimaryKey(uid);
	}

	public int insert(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.insert(record);
	}

	public int insertSelective(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.insertSelective(record);
	}

	public T01UserLoginInfo selectByPrimaryKey(String uid) {
		return t01UserLoginInfoDao.selectByPrimaryKey(uid);
	}

	public int updateByPrimaryKeySelective(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.updateByPrimaryKey(record);
	}

}
