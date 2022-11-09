package jp.frontierinfo.db.dao;

import java.util.List;

import jp.frontierinfo.db.entity.M01PulldownInfoKey;

public interface M01PulldownInfoDao {
	
	// 查询指定编码的下拉列表数据
	List<String> selectPulldownLi(String pulldownCde);
	
    int deleteByPrimaryKey(M01PulldownInfoKey key);

    int insert(M01PulldownInfoKey record);

    int insertSelective(M01PulldownInfoKey record);
}