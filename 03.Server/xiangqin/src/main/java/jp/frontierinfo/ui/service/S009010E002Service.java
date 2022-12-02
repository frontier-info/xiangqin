package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S009010E002Input;
import jp.frontierinfo.ui.output.S009010E002Output;

@Service
public class S009010E002Service extends AbstractServiceImpl<S009010E002Input, S009010E002Output>{

	@Override
	public S009010E002Output execute(S009010E002Input input) throws BusinessException {
		
		S009010E002Output output = new S009010E002Output();
		
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUidForBackstage(input.getUid());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
