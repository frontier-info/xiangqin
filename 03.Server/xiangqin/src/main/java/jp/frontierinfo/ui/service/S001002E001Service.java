package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.DateUtils;
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
		T01UserLoginInfo info = new T01UserLoginInfo();
		info.setUid(s01SequenceAccess.getUid());
		info.setMobile(input.getMobile());
		info.setEmail(input.getEmail());
		info.setPassword(input.getPassword());
		
		int count = t01UserLoginInfoAccess.insert(info);		
		return output;
	}

}
