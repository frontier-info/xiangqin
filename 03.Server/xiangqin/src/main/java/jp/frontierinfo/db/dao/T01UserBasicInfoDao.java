package jp.frontierinfo.db.dao;

import java.util.List;
import java.util.Map;

import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

public interface T01UserBasicInfoDao {
	
	// 查询指定检索条件的30名异性信息
	List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo);
	
	// 指定检索条件的查询结果不满30名时,从数据库随机补位至30名
	List<UserSimpleInfo> selectRandomList(Map<String, Object> params);
	
	// 获取点击用户的全部信息(业务页面用)
	UserFullInfo selectUserFullInfoByUid(String uid, String relationId);
	
	// 获取点击用户的全部信息(业务页面用,向我打招呼的人用)
	UserFullInfo selectUserFullInfoByRelationId(String uid, String relationId);
	
	// 查询指定检索条件的用户全部信息(管理员页面用)
	List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo);
	
	// 查询指定用户的全部信息(管理员页面用)
	UserFullInfo selectUserFullInfoByUidForBackstage(String uid);
	
    int deleteByPrimaryKey(String uid);

    int insert(T01UserBasicInfo record);

    int insertSelective(T01UserBasicInfo record);

    T01UserBasicInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(T01UserBasicInfo record);

    int updateByPrimaryKey(T01UserBasicInfo record);
}