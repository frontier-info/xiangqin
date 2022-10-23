package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
//import jp.frontierinfo.common.utils.TokenUtils;
//import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S001004E001Input;
import jp.frontierinfo.ui.output.S001004E001Output;

@Service
public class S001004E001Service extends AbstractServiceImpl<S001004E001Input, S001004E001Output>{

	@Override
	public S001004E001Output execute(S001004E001Input input) throws BusinessException {
		
		//
		S001004E001Output output = new S001004E001Output();
		int count = t01UserLoginInfoAccess.userExistByPhone(input.getMobile());
		
		if(count == 0) {
			// 用户不存在
			throw new BusinessException("用户不存在");
		}
		output.setMobile(input.getMobile());
		return output;
	}
	
	public S001004E001Output execute1(S001004E001Input input) throws BusinessException {
		

		int userUpdate = t01UserLoginInfoAccess.updatePasswordBymobile(input.getPassword(), input.getMobile());
		S001004E001Output output = new S001004E001Output();
		
		if(userUpdate != 0) { 
			System.out.println("数据已经更新");
		}
		
		return output;
	}

		
}
