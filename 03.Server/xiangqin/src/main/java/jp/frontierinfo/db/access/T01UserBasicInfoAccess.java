package jp.frontierinfo.db.access;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.T01UserBasicInfoDao;
import jp.frontierinfo.db.entity.T01UserBasicInfo;

@Component
public class T01UserBasicInfoAccess implements T01UserBasicInfoDao{
	
	private T01UserBasicInfoDao t01UserBasicInfoDao;
	
	public T01UserBasicInfoAccess(T01UserBasicInfoDao t01UserBasicInfoDao) {
		this.t01UserBasicInfoDao = t01UserBasicInfoDao;
	}

	@Override
	public int deleteByPrimaryKey(String uid) {
		return t01UserBasicInfoDao.deleteByPrimaryKey(uid);
	}

	@Override
	public int insert(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.insert(record);
	}

	@Override
	public int insertSelective(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.insertSelective(record);
	}

	@Override
	public T01UserBasicInfo selectByPrimaryKey(String uid) {
		return t01UserBasicInfoDao.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByPrimaryKeySelective(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T01UserBasicInfo record) {
		return t01UserBasicInfoDao.updateByPrimaryKey(record);
	}
}