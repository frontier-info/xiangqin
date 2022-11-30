package jp.frontierinfo.db.dao;

import java.util.List;
import java.util.Map;

import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserBasicInfoDao {
	
	// 查询指定择偶要求的30名异性信息
	List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo);
	
	// 指定检索条件的查询结果不满30名时,从数据库随机补位至30名
	List<UserSimpleInfo> selectRandomList(Map<String, Object> params);
	
	// 查询指定择偶要求的用户全部信息
	List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo);
	
	// 查询指定用户的全部信息
	UserFullInfo selectUserFullInfoByUid(String uid);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserBasicInfo record);

    int insertSelective(T01UserBasicInfo record);

    T01UserBasicInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserBasicInfo record);

    int updateByPrimaryKey(T01UserBasicInfo record);
}