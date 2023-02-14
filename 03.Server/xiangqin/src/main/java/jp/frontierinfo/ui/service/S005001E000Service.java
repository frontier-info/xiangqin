package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S005001E000Input;
import jp.frontierinfo.ui.output.S005001E000Output;

@Service
public class S005001E000Service extends AbstractServiceImpl<S005001E000Input, S005001E000Output>{

	@Override
	public S005001E000Output execute(S005001E000Input input) throws BusinessException {
		
		S005001E000Output output = new S005001E000Output();
		
		// このユーザーはすでにリクエストされています チェック TODO
		
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUid(input.getUid(), input.getRelationId());
		output.setUserFullInfo(userFullInfo);
		
		return output;
	}

}
