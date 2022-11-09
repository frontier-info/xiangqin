package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.M01PulldownInfoKey;

public interface M01PulldownInfoDao {
    int deleteByPrimaryKey(M01PulldownInfoKey key);

    int insert(M01PulldownInfoKey record);

    int insertSelective(M01PulldownInfoKey record);
}