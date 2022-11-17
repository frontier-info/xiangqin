package jp.frontierinfo.api.abstractcls;

import javax.annotation.Resource;

import jp.frontierinfo.db.access.M01CodeMasterInfoAccess;
import jp.frontierinfo.db.access.M01PulldownInfoAccess;
import jp.frontierinfo.db.access.S01SequenceAccess;
import jp.frontierinfo.db.access.T01UserBasicInfoAccess;
import jp.frontierinfo.db.access.T01UserLoginInfoAccess;
import jp.frontierinfo.db.access.T01UserRelationsInfoAccess;
import jp.frontierinfo.db.access.T01UserSearchInfoAccess;

public abstract class AbstractServiceImpl<I, O> implements AbstractService<I, O>{
	
	@Resource // 用户登录信息表
	public T01UserLoginInfoAccess t01UserLoginInfoAccess;
	
	@Resource // 用户基本信息表
	public T01UserBasicInfoAccess t01UserBasicInfoAccess;
	
	@Resource // 用户关系表
	public T01UserRelationsInfoAccess t01UserRelationsInfoAccess;
	
	@Resource // 用户检索信息
	public T01UserSearchInfoAccess t01UserSearchInfoAccess;
	
	@Resource // 下拉列表信息表
	public M01PulldownInfoAccess m01PulldownInfoAccess;
	
	@Resource // 编码转换表
	public M01CodeMasterInfoAccess m01CodeMasterInfoAccess;
	
	@Resource // 自增序列表
	public S01SequenceAccess s01SequenceAccess;
}
