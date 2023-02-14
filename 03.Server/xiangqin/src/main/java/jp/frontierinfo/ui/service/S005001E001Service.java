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
		
		// 業務チェック
		int exist = t01UserRelationsInfoAccess.selectExist(input.getUid(), input.getRelationId());
		if(exist > 0) {
			throw new BusinessException("このユーザーはすでにリクエストされています。");
		}
		
		// 一般ユーザーの友達リクエスト10回の回数チェック
		int relationCount = t01UserRelationsInfoAccess.selectRelationCount(input.getUid());
		if(relationCount > ConstantInfo.RELATION_COUNT) {
			throw new BusinessException("一般ユーザーの挨拶回数の上限（10回）を超えた場合、VIP解禁回数の上限にアップグレード。");
		}
		
		T01UserRelationsInfo userRelationsInfo = new T01UserRelationsInfo();
		userRelationsInfo.setUid(input.getUid());
		userRelationsInfo.setRelationId(input.getRelationId());
		userRelationsInfo.setRelationLevel1(ConstantInfo.RELATION_LEVEL_1_REQUEST);
		t01UserRelationsInfoAccess.insert(userRelationsInfo);
		
		// 更新後のユーザー情報を取得
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
