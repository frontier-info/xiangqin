package jp.frontierinfo.db.dao;

import java.util.List;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfoKey;

public interface T01UserRelationsInfoDao {
	
	// 申請された友達一覧を取得
	List<UserSimpleInfo> selectReceiveRelation(String uid);
	
	// 友達申請済一覧を取得
	List<UserSimpleInfo> selectSendRelation(String uid);
	
	// 指定する相手に申請しているかどうかを確認
	int selectExist(T01UserRelationsInfoKey key);
	
	// ユーザーが友達申請の実施件数
	int selectRelationCount(String uid);
	
	// ユーザーが友達申請の成功件数
	int selectRelationSuccessCount(T01UserRelationsInfo record);
	
    int deleteByPrimaryKey(T01UserRelationsInfoKey key);

    int insert(T01UserRelationsInfo record);

    int insertSelective(T01UserRelationsInfo record);

    T01UserRelationsInfo selectByPrimaryKey(T01UserRelationsInfoKey key);

    int updateByPrimaryKeySelective(T01UserRelationsInfo record);

    int updateByPrimaryKey(T01UserRelationsInfo record);
}