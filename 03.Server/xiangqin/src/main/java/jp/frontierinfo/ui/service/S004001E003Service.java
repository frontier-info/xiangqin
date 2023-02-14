package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.ui.input.S004001E003Input;
import jp.frontierinfo.ui.output.S004001E003Output;

@Service
public class S004001E003Service extends AbstractServiceImpl<S004001E003Input, S004001E003Output>{

	@Override
	public S004001E003Output execute(S004001E003Input input) throws BusinessException {
		
		S004001E003Output output = new S004001E003Output();
		
		// 友達リクエスト操作を更新
		T01UserRelationsInfo userRelationsInfo = new T01UserRelationsInfo();
		userRelationsInfo.setUid(input.getRelationId());
		userRelationsInfo.setRelationId(input.getUid());
		userRelationsInfo.setRelationLevel1(input.getRelationLevel1());
		userRelationsInfo.setRelationLevel2(input.getRelationLevel2());
		t01UserRelationsInfoAccess.updateByPrimaryKeySelective(userRelationsInfo);
		
		// 更新後のリクエスト对象の詳細情報
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByRelationId(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
