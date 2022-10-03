package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001001E005Input;
import jp.frontierinfo.api.outdto.A001001E005Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001001E005Service extends AbstractServiceImpl<A001001E005Input, A001001E005Output>{

	@Override
	public A001001E005Output execute(A001001E005Input input) throws BusinessException {
		A001001E005Output output = new A001001E005Output();
		return output;
	}

}
