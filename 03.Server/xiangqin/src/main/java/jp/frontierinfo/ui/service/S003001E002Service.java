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
		
		// 一般ユーザーの友達リクエスト3回制限
		T01UserRelationsInfo relationInfo = new T01UserRelationsInfo();
		relationInfo.setUid(input.getUid());
		relationInfo.setRelationLevel1(ConstantInfo.RELATION_LEVEL_1_AGREE);
		relationInfo.setRelationLevel2(ConstantInfo.RELATION_LEVEL_2_AGREE);
		int relationSuccessCount = t01UserRelationsInfoAccess.selectRelationSuccessCount(relationInfo);
		if(relationSuccessCount > ConstantInfo.RELATION_SUCCESS_COUNT) {
			throw new BusinessException("一般ユーザーの招待成功回数の上限(3回)を超えた場合、VIP解禁回数の上限にアップグレード。");
		}
		
		// 友達リクエスト对象の詳細情報
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
