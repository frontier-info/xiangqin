package jp.frontierinfo.db.dao;

import jp.frontierinfo.db.entity.M01CodeMasterInfo;
import jp.frontierinfo.db.entity.M01CodeMasterInfoKey;

public interface M01CodeMasterInfoDao {
    int deleteByPrimaryKey(M01CodeMasterInfoKey key);

    int insert(M01CodeMasterInfo record);

    int insertSelective(M01CodeMasterInfo record);

    M01CodeMasterInfo selectByPrimaryKey(M01CodeMasterInfoKey key);

    int updateByPrimaryKeySelective(M01CodeMasterInfo record);

    int updateByPrimaryKey(M01CodeMasterInfo record);
}