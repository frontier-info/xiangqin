package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001002E001Input;
import jp.frontierinfo.api.outdto.A001002E001Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001002E001Service extends AbstractServiceImpl<A001002E001Input, A001002E001Output>{

	@Override
	public A001002E001Output execute(A001002E001Input input) throws BusinessException {
		A001002E001Output output = new A001002E001Output();
		return output;
	}

}
