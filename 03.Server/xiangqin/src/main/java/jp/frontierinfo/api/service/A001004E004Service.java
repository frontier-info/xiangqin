package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001004E004Input;
import jp.frontierinfo.api.outdto.A001004E004Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001004E004Service extends AbstractServiceImpl<A001004E004Input, A001004E004Output>{

	@Override
	public A001004E004Output execute(A001004E004Input input) throws BusinessException {
		A001004E004Output output = new A001004E004Output();
		
		// 回复邀约
		
		return output;
	}

}
