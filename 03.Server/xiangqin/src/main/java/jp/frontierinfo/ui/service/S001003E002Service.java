package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.SHA256Util;
import jp.frontierinfo.ui.input.S001003E002Input;
import jp.frontierinfo.ui.output.S001003E002Output;

@Service
public class S001003E002Service extends AbstractServiceImpl<S001003E002Input, S001003E002Output>{
	
	@Override
	public S001003E002Output execute(S001003E002Input input) throws BusinessException {
		

		int userUpdate = t01UserLoginInfoAccess.updatePasswordByEmail(SHA256Util.getSHA256(input.getPassword()), input.getEmail());
		S001003E002Output output = new S001003E002Output();
		
		return output;
	}

		
}
