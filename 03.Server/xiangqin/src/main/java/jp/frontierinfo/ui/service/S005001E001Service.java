package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.ui.input.S005001E001Input;
import jp.frontierinfo.ui.output.S005001E001Output;

@Service
public class S005001E001Service extends AbstractServiceImpl<S005001E001Input, S005001E001Output>{

	@Override
	public S005001E001Output execute(S005001E001Input input) throws BusinessException {
		
		S005001E001Output output = new S005001E001Output();
		
		// 添加用户是否已经打过招呼的业务校验 TODO
		
		T01UserRelationsInfo userRelationsInfo = new T01UserRelationsInfo();
		userRelationsInfo.setUid(input.getUid());
		userRelationsInfo.setRelationId(input.getRelationId());
		userRelationsInfo.setRelationLevel1(ConstantInfo.RELATION_LEVEL_1_REQUEST);
		t01UserRelationsInfoAccess.insert(userRelationsInfo);
		
		// 获取更新后的用户信息
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
