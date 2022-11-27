package jp.frontierinfo.db.access;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.dao.T01UserRelationsInfoDao;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfoKey;

@Component
public class T01UserRelationsInfoAccess {
	
	private T01UserRelationsInfoDao t01UserRelationsInfoDao;
	
	public T01UserRelationsInfoAccess(T01UserRelationsInfoDao t01UserRelationsInfoDao) {
		this.t01UserRelationsInfoDao = t01UserRelationsInfoDao;
	}
	// 获取向我打过招呼的人的数据
	public List<UserSimpleInfo> selectReceiveRelation(String uid){
		return t01UserRelationsInfoDao.selectReceiveRelation(uid);
	}
	// 获取我打过招呼的人的数据
	public List<UserSimpleInfo> selectSendRelation(String uid){
		return t01UserRelationsInfoDao.selectSendRelation(uid);
	}
	
	// 查询当前用户是否已向该指定异性发送过邀约信息
	public int selectExist(String uid, String relationId){
		return t01UserRelationsInfoDao.selectExist(new T01UserRelationsInfoKey(uid, relationId));
	}

	public int insert(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.insert(record);
	}

	public int insertSelective(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.insertSelective(record);
	}

	public T01UserRelationsInfo selectByPrimaryKey(T01UserRelationsInfoKey key){
		return t01UserRelationsInfoDao.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T01UserRelationsInfo record) {
		return t01UserRelationsInfoDao.updateByPrimaryKey(record);
	}

}
