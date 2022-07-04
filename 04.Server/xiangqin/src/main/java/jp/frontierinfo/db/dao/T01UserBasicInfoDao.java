package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.T01UserBasicInfo;

public interface T01UserBasicInfoDao {
    int deleteByPrimaryKey(String uid);

    int insert(T01UserBasicInfo record);

    int insertSelective(T01UserBasicInfo record);

    T01UserBasicInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserBasicInfo record);

    int updateByPrimaryKey(T01UserBasicInfo record);
}