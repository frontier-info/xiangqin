package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001003E004Input;
import jp.frontierinfo.api.outdto.A001003E004Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001003E004Service extends AbstractServiceImpl<A001003E004Input, A001003E004Output>{

	@Override
	public A001003E004Output execute(A001003E004Input input) throws BusinessException {
		A001003E004Output output = new A001003E004Output();
		
		return output;
	}

}
