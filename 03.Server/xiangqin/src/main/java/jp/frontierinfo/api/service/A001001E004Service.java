package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001001E004Input;
import jp.frontierinfo.api.outdto.A001001E004Output;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;

@Service
public class A001001E004Service extends AbstractServiceImpl<A001001E004Input, A001001E004Output>{

	@Override
	public A001001E004Output execute(A001001E004Input input) throws BusinessException {
		A001001E004Output output = new A001001E004Output();
		// 通过uid获取用户信息
		T01UserLoginInfo userLoginInfo = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		// 变更密码执行
		userLoginInfo.setPassword(input.getNewPassword());
		int updRes = t01UserLoginInfoAccess.updateByPrimaryKey(userLoginInfo);
		return output;
	}

}
