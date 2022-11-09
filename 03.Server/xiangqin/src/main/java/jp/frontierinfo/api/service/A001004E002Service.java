package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001004E002Input;
import jp.frontierinfo.api.outdto.A001004E002Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001004E002Service extends AbstractServiceImpl<A001004E002Input, A001004E002Output>{

	@Override
	public A001004E002Output execute(A001004E002Input input) throws BusinessException {
		A001004E002Output output = new A001004E002Output();
		
		// 返回被邀约对象的基本信息
		
		return output;
	}

}
