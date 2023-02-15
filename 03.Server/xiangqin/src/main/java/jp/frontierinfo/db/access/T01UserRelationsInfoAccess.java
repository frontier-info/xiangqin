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
	
	// 申請された友達一覧を取得
	public List<UserSimpleInfo> selectReceiveRelation(String uid){
		return t01UserRelationsInfoDao.selectReceiveRelation(uid);
	}
	
	// 友達申請済一覧を取得
	public List<UserSimpleInfo> selectSendRelation(String uid){
		return t01UserRelationsInfoDao.selectSendRelation(uid);
	}
	
	// 指定する相手に申請しているかどうかを確認
	public int selectExist(String uid, String relationId){
		return t01UserRelationsInfoDao.selectExist(new T01UserRelationsInfoKey(uid, relationId));
	}
	
	// ユーザーが友達申請の実施件数
	public int selectRelationCount(String uid){
		return t01UserRelationsInfoDao.selectRelationCount(uid);
	}
	
	// ユーザーが友達申請の成功件数
	public int selectRelationSuccessCount(T01UserRelationsInfo record){
		return t01UserRelationsInfoDao.selectRelationSuccessCount(record);
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
