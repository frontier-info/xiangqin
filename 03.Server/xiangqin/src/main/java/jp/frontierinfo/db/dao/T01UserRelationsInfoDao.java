package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfoKey;

public interface T01UserRelationsInfoDao {
    int deleteByPrimaryKey(T01UserRelationsInfoKey key);

    int insert(T01UserRelationsInfo record);

    int insertSelective(T01UserRelationsInfo record);

    T01UserRelationsInfo selectByPrimaryKey(T01UserRelationsInfoKey key);

    int updateByPrimaryKeySelective(T01UserRelationsInfo record);

    int updateByPrimaryKey(T01UserRelationsInfo record);
}