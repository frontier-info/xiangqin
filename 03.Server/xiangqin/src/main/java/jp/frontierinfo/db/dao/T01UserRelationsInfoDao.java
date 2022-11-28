package jp.frontierinfo.db.dao;

import java.util.List;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfoKey;

public interface T01UserRelationsInfoDao {
	
	// ��ȡ���Ҵ���к����˵�����
	List<UserSimpleInfo> selectReceiveRelation(String uid);
	
	// ��ȡ�Ҵ���к����˵�����
	List<UserSimpleInfo> selectSendRelation(String uid);
	
	// ��ѯ��ǰ�û��Ƿ������ָ�����Է��͹���Լ��Ϣ
	int selectExist(T01UserRelationsInfoKey key);
	
    int deleteByPrimaryKey(T01UserRelationsInfoKey key);

    int insert(T01UserRelationsInfo record);

    int insertSelective(T01UserRelationsInfo record);

    T01UserRelationsInfo selectByPrimaryKey(T01UserRelationsInfoKey key);

    int updateByPrimaryKeySelective(T01UserRelationsInfo record);

    int updateByPrimaryKey(T01UserRelationsInfo record);
}