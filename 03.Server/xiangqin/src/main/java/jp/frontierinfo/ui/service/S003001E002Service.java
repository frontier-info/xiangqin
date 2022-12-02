package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.entity.T01UserRelationsInfo;
import jp.frontierinfo.ui.input.S003001E002Input;
import jp.frontierinfo.ui.output.S003001E002Output;

@Service
public class S003001E002Service extends AbstractServiceImpl<S003001E002Input, S003001E002Output>{

	@Override
	public S003001E002Output execute(S003001E002Input input) throws BusinessException {
		
		S003001E002Output output = new S003001E002Output();
		
		// 普通用户的邀约成功3次限制校验
		T01UserRelationsInfo relationInfo = new T01UserRelationsInfo();
		relationInfo.setUid(input.getUid());
		relationInfo.setRelationLevel1(ConstantInfo.RELATION_LEVEL_1_AGREE);
		relationInfo.setRelationLevel2(ConstantInfo.RELATION_LEVEL_2_AGREE);
		int relationSuccessCount = t01UserRelationsInfoAccess.selectRelationSuccessCount(relationInfo);
		if(relationSuccessCount > ConstantInfo.RELATION_SUCCESS_COUNT) {
			throw new BusinessException("超过了普通用户的成功邀约次数上限(3次),升级为VIP解锁次数上限.");
		}
		
		// 获取邀约对象详细信息
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
