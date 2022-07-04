package jp.frontierinfo.db.access;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.T01UserLoginInfoDao;
import jp.frontierinfo.db.entity.T01UserLoginInfo;

@Component
public class T01UserLoginInfoAccess implements T01UserLoginInfoDao{
	
	private T01UserLoginInfoDao t01UserLoginInfoDao;
	
	public T01UserLoginInfoAccess(T01UserLoginInfoDao t01UserLoginInfoDao) {
		this.t01UserLoginInfoDao = t01UserLoginInfoDao;
	}

	@Override
	public int deleteByPrimaryKey(String uid) {
		return t01UserLoginInfoDao.deleteByPrimaryKey(uid);
	}

	@Override
	public int insert(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.insert(record);
	}

	@Override
	public int insertSelective(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.insertSelective(record);
	}

	@Override
	public T01UserLoginInfo selectByPrimaryKey(String uid) {
		return t01UserLoginInfoDao.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByPrimaryKeySelective(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T01UserLoginInfo record) {
		return t01UserLoginInfoDao.updateByPrimaryKey(record);
	}

}
