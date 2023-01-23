package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.input.S001002E001Input;
import jp.frontierinfo.ui.output.S001002E001Output;

@Service
public class S001002E001Service extends AbstractServiceImpl<S001002E001Input, S001002E001Output>{

	@Override
	public S001002E001Output execute(S001002E001Input input) throws BusinessException {
		
		S001002E001Output output = new S001002E001Output();
		String verificationCode;	
				
		int count = t01UserLoginInfoAccess.userExistByEmail(input.getEmail());	
		if(count > 0) {
			// 用户已存在
			throw new BusinessException("用户已存在");
		}

		//生成6位数的验证码 TODO 在此处添加发送邮件
		verificationCode = String.valueOf((int)((Math.random() * 9 + 1) * Math.pow(10, 5)));
		logger.debug("用户验证码(注册用):"+verificationCode);
		output.setVerificationCode(verificationCode);
		
		return output;
	}
	

		
}
