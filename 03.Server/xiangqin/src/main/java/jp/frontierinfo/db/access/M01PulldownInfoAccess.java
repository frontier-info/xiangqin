package jp.frontierinfo.db.access;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.dao.M01PulldownInfoDao;
import jp.frontierinfo.db.entity.M01PulldownInfoKey;

@Component
public class M01PulldownInfoAccess {
	
	private M01PulldownInfoDao m01PulldownInfoDao;
	
	
	public M01PulldownInfoAccess(M01PulldownInfoDao m01PulldownInfoDao) {
		this.m01PulldownInfoDao = m01PulldownInfoDao;
	}
	
	// 查询指定编码的下拉列表数据
	public List<String> selectPulldownLi(String pulldownCde){
		return m01PulldownInfoDao.selectPulldownLi(pulldownCde);
	}

	public int deleteByPrimaryKey(M01PulldownInfoKey key) {
		return m01PulldownInfoDao.deleteByPrimaryKey(key);
	}

	public int insert(M01PulldownInfoKey record) {
		return m01PulldownInfoDao.insert(record);
	}

	public int insertSelective(M01PulldownInfoKey record) {
		return m01PulldownInfoDao.insertSelective(record);
	}

}