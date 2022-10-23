package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.TokenUtils;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.input.S001002E001Input;
import jp.frontierinfo.ui.output.S001001E001Output;
import jp.frontierinfo.ui.output.S001002E001Output;

@Service
public class S001002E001Service extends AbstractServiceImpl<S001002E001Input, S001002E001Output>{

	@Override
	public S001002E001Output execute(S001002E001Input input) throws BusinessException {
		S001002E001Output output = new S001002E001Output();
		int count = t01UserLoginInfoAccess.userExistByPhone(input.getMobile());
		if(count == 0) {
			// 用户不存在
			throw new BusinessException("用户不存在");
		}
		T01UserLoginInfo userLoginInfo = t01UserLoginInfoAccess.loginVerifyWithPhone(input.getMobile(), input.getPassword());
		if(userLoginInfo != null) {
			// 用户手机号和密码验证成功
			output.setUid(userLoginInfo.getUid());
			output.setToken(TokenUtils.tokenForLogin(input.getMobile()));
		} else {
			// 用户手机号或密码错误
			throw new BusinessException("用户手机号或密码错误");
		}
		return output;
	}




}
