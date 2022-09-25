package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
//import jp.frontierinfo.common.utils.TokenUtils;
import jp.frontierinfo.ui.input.S001006E001Input;
import jp.frontierinfo.ui.output.S001006E001Output;

@Service
public class S001006E001Service extends AbstractServiceImpl<S001006E001Input, S001006E001Output>{

	@Override
	public S001006E001Output execute(S001006E001Input input) throws BusinessException {
		
		S001006E001Output output = new S001006E001Output();
		
		int userUpdate = t01UserLoginInfoAccess.updateBymobile(input.getMobile());
		
		if(userUpdate != 0) { 
			System.out.println("数据已经更新");
		}
		output.setMobile(input.getMobile());
		return output;
	}

}
