package jp.frontierinfo.db.access;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.T01UserSearchInfoDao;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

@Component
public class T01UserSearchInfoAccess {
	
	private T01UserSearchInfoDao t01UserSearchInfoDao;
	
	
	public T01UserSearchInfoAccess(T01UserSearchInfoDao t01UserSearchInfoDao) {
		this.t01UserSearchInfoDao = t01UserSearchInfoDao;
	}
	
	// ユーザーが検索条件が設定しているかどうかの確認
	public int selectExist(String uid){
		return t01UserSearchInfoDao.selectExist(uid);
	}

	public int deleteByPrimaryKey(String uid) {
		return t01UserSearchInfoDao.deleteByPrimaryKey(uid);
	}

	public int insert(T01UserSearchInfo record) {
		return t01UserSearchInfoDao.insert(record);
	}

	public int insertSelective(T01UserSearchInfo record) {
		return t01UserSearchInfoDao.insertSelective(record);
	}

	public T01UserSearchInfo selectByPrimaryKey(String uid) {
		return t01UserSearchInfoDao.selectByPrimaryKey(uid);
	}

	public int updateByPrimaryKeySelective(T01UserSearchInfo record) {
		return t01UserSearchInfoDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T01UserSearchInfo record) {
		return t01UserSearchInfoDao.updateByPrimaryKey(record);
	}
}