package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S009020E005Input;
import jp.frontierinfo.ui.output.S009020E005Output;

@Service
public class S009020E005Service extends AbstractServiceImpl<S009020E005Input, S009020E005Output>{

	/**
	 * ユーザー审查结果
	 */
	@Override
	public S009020E005Output execute(S009020E005Input input) throws BusinessException {
		
		S009020E005Output output = new S009020E005Output();
		
		// ユーザーIDでユーザー情報取得
		T01UserLoginInfo info = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		info.setUserStatusCode(input.getUserStatusCode());
		info.setUserCensorResult(input.getUserCensorResult());
		
		// ユーザー审查结果を更新
		t01UserLoginInfoAccess.updateByPrimaryKey(info);	
		
		output.setUid(info.getUid());
		
		return output;
	}

}
