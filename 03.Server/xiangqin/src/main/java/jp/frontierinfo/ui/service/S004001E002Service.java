package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S004001E002Input;
import jp.frontierinfo.ui.output.S004001E002Output;

@Service
public class S004001E002Service extends AbstractServiceImpl<S004001E002Input, S004001E002Output>{

	@Override
	public S004001E002Output execute(S004001E002Input input) throws BusinessException {
		
		S004001E002Output output = new S004001E002Output();
		
		// 友達リクエスト対象の詳細情報
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByRelationId(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
