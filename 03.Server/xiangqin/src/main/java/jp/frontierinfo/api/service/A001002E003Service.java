package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001002E003Input;
import jp.frontierinfo.api.outdto.A001002E003Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001002E003Service extends AbstractServiceImpl<A001002E003Input, A001002E003Output>{

	@Override
	public A001002E003Output execute(A001002E003Input input) throws BusinessException {
		A001002E003Output output = new A001002E003Output();
		return output;
	}

}
