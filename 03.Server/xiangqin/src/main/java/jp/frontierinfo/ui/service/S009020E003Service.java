package jp.frontierinfo.ui.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S009020E003Input;
import jp.frontierinfo.ui.output.S009020E003Output;

@Service
public class S009020E003Service extends AbstractServiceImpl<S009020E003Input, S009020E003Output>{

	@Override
	public S009020E003Output execute(S009020E003Input input) throws BusinessException {
		
		S009020E003Output output = new S009020E003Output();
		
		T01UserLoginInfo info = new T01UserLoginInfo();
		info.setUid(s01SequenceAccess.getUid());
		info.setMobile(input.getMobile());
		info.setEmail(input.getEmail());
		info.setPassword(input.getPassword());
		info.setUserStatusCode("00");
		info.setUserRankCode(input.getUserRankCode());
		info.setCreateTime(new Date());
		info.setDeleteFlg(false);
		
		t01UserLoginInfoAccess.insert(info);	
		
		output.setUid(info.getUid());
		
		return output;
	}

}
