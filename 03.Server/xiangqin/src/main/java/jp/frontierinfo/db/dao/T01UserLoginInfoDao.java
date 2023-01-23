package jp.frontierinfo.db.dao;

import java.util.Map;

import jp.frontierinfo.db.entity.T01UserLoginInfo;

public interface T01UserLoginInfoDao {
	
	int userExistByEmail(String email);
	
	T01UserLoginInfo loginVerifyWithEmail(Map<String, String> params);
    
    int updateByEmail(String email);
    
    int updatePasswordByEmail(String password,String email);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserLoginInfo record);

    int insertSelective(T01UserLoginInfo record);

    T01UserLoginInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserLoginInfo record);

    int updateByPrimaryKey(T01UserLoginInfo record);
}