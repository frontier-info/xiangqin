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
			// ユーザー不存在
			throw new BusinessException("ユーザー不存在");
		}

		// 認証コードを生成し、メール送信を実施
		verificationCode = String.valueOf((int)((Math.random() * 9 + 1) * Math.pow(10, 5)));
		
//		MailUtils.sendMail(input.getEmail(), verificationCode);
		
		logger.debug("ユーザー認証コード(パスワード変更用):"+verificationCode);
		
		output.setMobile(input.getEmail());
		output.setVerificationCode(verificationCode);
		
		return output;
	}
	
}
