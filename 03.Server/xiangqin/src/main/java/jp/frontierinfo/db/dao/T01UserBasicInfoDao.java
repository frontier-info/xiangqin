package jp.frontierinfo.db.dao;

import java.util.List;

import jp.frontierinfo.db.bean.userSimpleInfo;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserBasicInfoDao {
	
	// 查询指定检索条件的30名异性信息
	List<userSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserBasicInfo record);

    int insertSelective(T01UserBasicInfo record);

    T01UserBasicInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserBasicInfo record);

    int updateByPrimaryKey(T01UserBasicInfo record);
}