package jp.frontierinfo.db.access;

import java.util.List;

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
	
	// 查询指定检索条件的用户全部信息
	public List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo){
		return t01UserBasicInfoDao.selectUserFullInfoLi(searchInfo);
	}
	
	// 查询指定用户的全部信息
	public UserFullInfo selectUserFullInfoByUid(String uid){
		return t01UserBasicInfoDao.selectUserFullInfoByUid(uid);
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