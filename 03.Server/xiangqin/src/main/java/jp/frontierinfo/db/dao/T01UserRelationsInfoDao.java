package jp.frontierinfo.db.dao;

import java.util.List;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfoKey;

public interface T01UserRelationsInfoDao {
	
	// 获取向我打过招呼的人的数据
	List<UserSimpleInfo> selectReceiveRelation(String uid);
	
	// 获取我打过招呼的人的数据
	List<UserSimpleInfo> selectSendRelation(String uid);
	
	// 查询当前用户是否已向该指定异性发送过邀约信息
	int selectExist(T01UserRelationsInfoKey key);
	
    int deleteByPrimaryKey(T01UserRelationsInfoKey key);

    int insert(T01UserRelationsInfo record);

    int insertSelective(T01UserRelationsInfo record);

    T01UserRelationsInfo selectByPrimaryKey(T01UserRelationsInfoKey key);

    int updateByPrimaryKeySelective(T01UserRelationsInfo record);

    int updateByPrimaryKey(T01UserRelationsInfo record);
}