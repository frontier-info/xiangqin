package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S009020E002Input;
import jp.frontierinfo.ui.output.S009020E002Output;

@Service
public class S009020E002Service extends AbstractServiceImpl<S009020E002Input, S009020E002Output>{

	@Override
	public S009020E002Output execute(S009020E002Input input) throws BusinessException {
		
		S009020E002Output output = new S009020E002Output();
		
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
