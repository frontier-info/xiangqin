package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.outdto.A001001E001Output;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.TokenUtils;
import jp.frontierinfo.db.entity.T01UserLoginInfo;

@Service
public class A001001E001Service extends AbstractServiceImpl<A001001E001Input, A001001E001Output>{

	@Override
	public A001001E001Output execute(A001001E001Input input) throws BusinessException {
		A001001E001Output output = new A001001E001Output();
		int count = t01UserLoginInfoAccess.userExistByPhone(input.getAccount());
		if(count == 0) {
			// 用户不存在
			throw new BusinessException("用户不存在");
		}
		T01UserLoginInfo userLoginInfo = t01UserLoginInfoAccess.loginVerifyWithPhone(input.getAccount(), input.getPassword());
		if(userLoginInfo != null) {
			// 用户手机号和密码验证成功
			output.setUid(userLoginInfo.getUid());
			output.setToken(TokenUtils.tokenForLogin(input.getAccount()));
		} else {
			// 用户手机号或密码错误
			throw new BusinessException("用户手机号或密码错误");
		}
		return output;
	}

}
