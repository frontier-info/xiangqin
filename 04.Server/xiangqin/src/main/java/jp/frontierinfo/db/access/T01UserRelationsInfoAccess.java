package jp.frontierinfo.db.access;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.T01UserRelationsInfoDao;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;

@Component
public class T01UserRelationsInfoAccess implements T01UserRelationsInfoDao{
	
	private T01UserRelationsInfoDao t01UserRelationsInfoDao;
	
	public T01UserRelationsInfoAccess(T01UserRelationsInfoDao t01UserRelationsInfoDao) {
		this.t01UserRelationsInfoDao = t01UserRelationsInfoDao;
	}

	@Override
	public int deleteByPrimaryKey(String uid) {
		return t01UserRelationsInfoDao.deleteByPrimaryKey(uid);
	}

	@Override
	public int insert(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.insert(record);
	}

	@Override
	public int insertSelective(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.insertSelective(record);
	}

	@Override
	public T01UserRelationsInfo selectByPrimaryKey(String uid) {
		return t01UserRelationsInfoDao.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByPrimaryKeySelective(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.updateByPrimaryKey(record);
	}

}
