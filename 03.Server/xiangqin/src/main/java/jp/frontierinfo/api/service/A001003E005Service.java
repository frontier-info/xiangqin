package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001003E005Input;
import jp.frontierinfo.api.outdto.A001003E005Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001003E005Service extends AbstractServiceImpl<A001003E005Input, A001003E005Output>{

	@Override
	public A001003E005Output execute(A001003E005Input input) throws BusinessException {
		A001003E005Output output = new A001003E005Output();
		
		return output;
	}

}
