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
	
	// 指定検索条件で30名の異性情報を取得
	public List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo){
		return t01UserBasicInfoDao.selectRecommendList(searchInfo);
	}
	
	// 検索条件が一致する異性が30名未満の場合、ランダムで30名までDBから取得
	public List<UserSimpleInfo> selectRandomList(List<String> uids, int limit){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("exceptList", uids);
		params.put("limit", limit);
		return t01UserBasicInfoDao.selectRandomList(params);
	}
	
	// 指定するユーザーの情報を取得(ユーザー画面用)
	public UserFullInfo selectUserFullInfoByUid(String uid, String relationId){
		return t01UserBasicInfoDao.selectUserFullInfoByUid(uid, relationId);
	}
	
	// 指定するユーザーの情報を取得(ユーザー画面用、申請された友達一覧用)
	public UserFullInfo selectUserFullInfoByRelationId(String uid, String relationId){
		return t01UserBasicInfoDao.selectUserFullInfoByRelationId(uid, relationId);
	}
	
	// 指定する検索条件のユーザー情報を取得(管理員画面用)
	public List<UserFullInfo> selectUserFullInfoLi(BackstageSerachInfo searchInfo){
		return t01UserBasicInfoDao.selectUserFullInfoLi(searchInfo);
	}
	
	// 指定するユーザーの情報を取得(管理員画面用)
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