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
		
		// 添加用户是否已经打过招呼的业务校验
		int exist = t01UserRelationsInfoAccess.selectExist(input.getUid(), input.getRelationId());
		if(exist > 0) {
			throw new BusinessException("已经向该用户打过招呼.");
		}
		
		// 普通用户的打招呼10次限制校验
		int relationCount = t01UserRelationsInfoAccess.selectRelationCount(input.getUid());
		if(relationCount > ConstantInfo.RELATION_COUNT) {
			throw new BusinessException("超过了普通用户的打招呼次数上限(10次),升级为VIP解锁次数上限.");
		}
		
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
