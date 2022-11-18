package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S009020E004Input;
import jp.frontierinfo.ui.output.S009020E004Output;

@Service
public class S009020E004Service extends AbstractServiceImpl<S009020E004Input, S009020E004Output>{

	/**
	 * 变更用户权限
	 */
	@Override
	public S009020E004Output execute(S009020E004Input input) throws BusinessException {
		
		S009020E004Output output = new S009020E004Output();
		
		// 通过用户ID获取用户信息
		T01UserLoginInfo info = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		info.setUserRankCode(input.getUserRankCode());
		
		// 更新用户权限
		t01UserLoginInfoAccess.updateByPrimaryKey(info);	
		
		output.setUid(info.getUid());
		
		return output;
	}

}
