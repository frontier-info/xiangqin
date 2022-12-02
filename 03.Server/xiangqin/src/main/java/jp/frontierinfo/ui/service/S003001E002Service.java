package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S003001E002Input;
import jp.frontierinfo.ui.output.S003001E002Output;

@Service
public class S003001E002Service extends AbstractServiceImpl<S003001E002Input, S003001E002Output>{

	@Override
	public S003001E002Output execute(S003001E002Input input) throws BusinessException {
		
		S003001E002Output output = new S003001E002Output();
		
		// 获取邀约对象详细信息
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
