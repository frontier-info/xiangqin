package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserSearchInfoDao {
	
	// 查询当前用户是否已设置择偶要求
	int selectExist(String uid);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserSearchInfo record);

    int insertSelective(T01UserSearchInfo record);

    T01UserSearchInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserSearchInfo record);

    int updateByPrimaryKey(T01UserSearchInfo record);
}