package jp.frontierinfo.db.access;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.dao.T01UserBasicInfoDao;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

@Component
public class T01UserBasicInfoAccess {
	
	private T01UserBasicInfoDao t01UserBasicInfoDao;
	
	public T01UserBasicInfoAccess(T01UserBasicInfoDao t01UserBasicInfoDao) {
		this.t01UserBasicInfoDao = t01UserBasicInfoDao;
	}
	
	// 查询指定检索条件的30名异性信息
	public List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo){
		return t01UserBasicInfoDao.selectRecommendList(searchInfo);
	}
	
	// 指定检索条件的查询结果不满30名时,从数据库随机补位至30名
	public List<UserSimpleInfo> selectRandomList(List<String> uids, int limit){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("exceptList", uids);
		params.put("limit", limit);
		return t01UserBasicInfoDao.selectRandomList(params);
	}
	
	// 获取点击用户的全部信息(业务页面用)
	public UserFullInfo selectUserFullInfoByUid(String uid, String relationId){
		return t01UserBasicInfoDao.selectUserFullInfoByUid(uid, relationId);
	}
	
	// 获取点击用户的全部信息(业务页面用,向我打招呼的人用)
	public UserFullInfo selectUserFullInfoByRelationId(String uid, String relationId){
		return t01UserBasicInfoDao.selectUserFullInfoByRelationId(uid, relationId);
	}
	
	// 查询指定检索条件的用户全部信息(管理员页面用)
	public List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo){
		return t01UserBasicInfoDao.selectUserFullInfoLi(searchInfo);
	}
	
	// 查询指定用户的全部信息(管理员页面用)
	public UserFullInfo selectUserFullInfoByUidForBackstage(String uid){
		return t01UserBasicInfoDao.selectUserFullInfoByUidForBackstage(uid);
	}

	public int deleteByPrimaryKey(String uid) {
		return t01UserBasicInfoDao.deleteByPrimaryKey(uid);
	}

	public int insert(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.insert(record);
	}

	public int insertSelective(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.insertSelective(record);
	}

	public T01UserBasicInfo selectByPrimaryKey(String uid) {
		return t01UserBasicInfoDao.selectByPrimaryKey(uid);
	}

	public int updateByPrimaryKeySelective(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.updateByPrimaryKey(record);
	}
}