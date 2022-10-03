package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001002E004Input;
import jp.frontierinfo.api.outdto.A001002E004Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001002E004Service extends AbstractServiceImpl<A001002E004Input, A001002E004Output>{

	@Override
	public A001002E004Output execute(A001002E004Input input) throws BusinessException {
		A001002E004Output output = new A001002E004Output();
		return output;
	}

}
