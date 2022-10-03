package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001002E002Input;
import jp.frontierinfo.api.outdto.A001002E002Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001002E002Service extends AbstractServiceImpl<A001002E002Input, A001002E002Output>{

	@Override
	public A001002E002Output execute(A001002E002Input input) throws BusinessException {
		A001002E002Output output = new A001002E002Output();
		return output;
	}

}
