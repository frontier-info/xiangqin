package jp.frontierinfo.ui.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S001002E002Input;
import jp.frontierinfo.ui.output.S001002E002Output;

@Service
public class S001002E002Service extends AbstractServiceImpl<S001002E002Input, S001002E002Output>{

    @Override
	public S001002E002Output execute(S001002E002Input input) throws BusinessException {
		S001002E002Output output = new S001002E002Output();
		T01UserLoginInfo info = new T01UserLoginInfo();
		info.setUid(s01SequenceAccess.getUid());
		info.setMobile(input.getMobile());
		info.setPassword(input.getPassword());
		info.setUserStatusCode("00");
		info.setUserRankCode("01");
		info.setCreateTime(new Date());
		info.setDeleteFlg(false);
		
		int count = t01UserLoginInfoAccess.insert(info);		
		return output;
	}

}
