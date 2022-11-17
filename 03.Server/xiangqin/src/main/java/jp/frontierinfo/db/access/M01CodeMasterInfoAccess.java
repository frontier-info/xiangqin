package jp.frontierinfo.db.access;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.frontierinfo.db.bean.PullDownBean;
import jp.frontierinfo.db.dao.M01CodeMasterInfoDao;
import jp.frontierinfo.db.entity.M01CodeMasterInfo;
import jp.frontierinfo.db.entity.M01CodeMasterInfoKey;

@Component
public class M01CodeMasterInfoAccess {
	
	private M01CodeMasterInfoDao m01CodeMasterInfoDao;
	
	
	public M01CodeMasterInfoAccess(M01CodeMasterInfoDao m01CodeMasterInfoDao) {
		this.m01CodeMasterInfoDao = m01CodeMasterInfoDao;
	}
	
	// 查询编码数据
	public List<PullDownBean> selectCodeMasterData(String codeType){
		return m01CodeMasterInfoDao.selectCodeMasterData(codeType);
	}

	public int deleteByPrimaryKey(M01CodeMasterInfoKey key) {
		return m01CodeMasterInfoDao.deleteByPrimaryKey(key);
	}

	public int insert(M01CodeMasterInfo record) {
		return m01CodeMasterInfoDao.insert(record);
	}

	public int insertSelective(M01CodeMasterInfo record) {
		return m01CodeMasterInfoDao.insertSelective(record);
	}

}