package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.MailUtils;
//import jp.frontierinfo.common.utils.TokenUtils;
//import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S001003E001Input;
import jp.frontierinfo.ui.output.S001003E001Output;

@Service
public class S001003E001Service extends AbstractServiceImpl<S001003E001Input, S001003E001Output>{

	@Override
	public S001003E001Output execute(S001003E001Input input) throws BusinessException {
		
		S001003E001Output output = new S001003E001Output();
		String verificationCode;	
				
		int count = t01UserLoginInfoAccess.userExistByEmail(input.getEmail());	
		if(count == 0) {
			// 用户不存在
			throw new BusinessException("用户不存在");
		}
		
		System.out.println("邮箱不存在，发送验证码进行中");

		//生成6位数的验证码 TODO 添加发送邮件功能
		verificationCode = String.valueOf((int)((Math.random() * 9 + 1) * Math.pow(10, 5)));
		
		MailUtils.sendMail(input.getEmail(), verificationCode);
		
		logger.debug("用户验证码(密码变更用):"+verificationCode);
		
		output.setMobile(input.getEmail());
		output.setVerificationCode(verificationCode);
		
		return output;
	}
	
}
