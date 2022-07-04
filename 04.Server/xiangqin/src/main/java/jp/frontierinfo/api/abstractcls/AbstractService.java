package jp.frontierinfo.api.abstractcls;

import javax.annotation.Resource;

import jp.frontierinfo.db.access.T01UserBasicInfoAccess;
import jp.frontierinfo.db.access.T01UserLoginInfoAccess;
import jp.frontierinfo.db.access.T01UserRelationsInfoAccess;

public class AbstractService{
	
	@Resource // 用户登录信息表
	public T01UserLoginInfoAccess t01UserLoginInfoAccess;
	
	@Resource // 用户基本信息表
	public T01UserBasicInfoAccess t01UserBasicInfoAccess;
	
	@Resource // 用户关系表
	public T01UserRelationsInfoAccess t01UserRelationsInfoAccess;
}
