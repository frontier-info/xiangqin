package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001001E003Input;
import jp.frontierinfo.api.outdto.A001001E003Output;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.TokenUtils;

@Service
public class A001001E003Service extends AbstractServiceImpl<A001001E003Input, A001001E003Output>{

	@Override
	public A001001E003Output execute(A001001E003Input input) throws BusinessException {
		A001001E003Output output = new A001001E003Output();
		
		// 验证用户输入的6位手机验证码
		TokenUtils.verifyVerificationCode(input.getVerificationCodeToken(),
				input.getMobile(),
				input.getVerificationCode());
		
		return output;
	}

}
