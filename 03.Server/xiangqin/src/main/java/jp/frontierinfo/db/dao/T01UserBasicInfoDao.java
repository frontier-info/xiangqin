package jp.frontierinfo.db.dao;

import java.util.List;

import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserBasicInfoDao {
	
	// ��ѯָ����żҪ���30��������Ϣ
	List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo);
	
	// ��ѯָ����żҪ����û�ȫ����Ϣ
	List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo);
	
	// ��ѯָ���û���ȫ����Ϣ
	UserFullInfo selectUserFullInfoByUid(String uid);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserBasicInfo record);

    int insertSelective(T01UserBasicInfo record);

    T01UserBasicInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserBasicInfo record);

    int updateByPrimaryKey(T01UserBasicInfo record);
}