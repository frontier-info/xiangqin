package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.T01UserRelationsInfo;

public interface T01UserRelationsInfoDao {
    int deleteByPrimaryKey(String uid);

    int insert(T01UserRelationsInfo record);

    int insertSelective(T01UserRelationsInfo record);

    T01UserRelationsInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserRelationsInfo record);

    int updateByPrimaryKey(T01UserRelationsInfo record);
}