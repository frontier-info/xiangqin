package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfoKey;
import jp.frontierinfo.ui.input.S003001E002Input;
import jp.frontierinfo.ui.output.S003001E002Output;

@Service
public class S003001E002Service extends AbstractServiceImpl<S003001E002Input, S003001E002Output>{

	@Override
	public S003001E002Output execute(S003001E002Input input) throws BusinessException {
		
		S003001E002Output output = new S003001E002Output();
		
		// 获取用户关系表信息
		T01UserRelationsInfoKey key = new T01UserRelationsInfoKey(input.getUid(), input.getRelationId());
		T01UserRelationsInfo userRelationsInfo = t01UserRelationsInfoAccess.selectByPrimaryKey(key);
		
		// 获取邀约对象详细信息
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getRelationId());
		userFullInfo.setRelationLevel1(userRelationsInfo.getRelationLevel1());
		userFullInfo.setRelationLevel2(userRelationsInfo.getRelationLevel2());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
