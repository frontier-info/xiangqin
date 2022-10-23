package jp.frontierinfo.api.abstractcls;

import javax.annotation.Resource;

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
}
