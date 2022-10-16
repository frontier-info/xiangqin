package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserSearchInfoDao {
    int deleteByPrimaryKey(String uid);

    int insert(T01UserSearchInfo record);

    int insertSelective(T01UserSearchInfo record);

    T01UserSearchInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserSearchInfo record);

    int updateByPrimaryKey(T01UserSearchInfo record);
}