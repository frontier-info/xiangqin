package jp.frontierinfo.db.access;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.T01UserRelationsInfoDao;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;

@Component
public class T01UserRelationsInfoAccess {
	
	private T01UserRelationsInfoDao t01UserRelationsInfoDao;
	
	public T01UserRelationsInfoAccess(T01UserRelationsInfoDao t01UserRelationsInfoDao) {
		this.t01UserRelationsInfoDao = t01UserRelationsInfoDao;
	}

	public int deleteByPrimaryKey(String uid) {
		return t01UserRelationsInfoDao.deleteByPrimaryKey(uid);
	}

	public int insert(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.insert(record);
	}

	public int insertSelective(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.insertSelective(record);
	}

	public T01UserRelationsInfo selectByPrimaryKey(String uid) {
		return t01UserRelationsInfoDao.selectByPrimaryKey(uid);
	}

	public int updateByPrimaryKeySelective(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.updateByPrimaryKey(record);
	}

}
