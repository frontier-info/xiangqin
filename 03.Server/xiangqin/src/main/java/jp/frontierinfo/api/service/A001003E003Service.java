package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001003E003Input;
import jp.frontierinfo.api.outdto.A001003E003Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001003E003Service extends AbstractServiceImpl<A001003E003Input, A001003E003Output>{

	@Override
	public A001003E003Output execute(A001003E003Input input) throws BusinessException {
		A001003E003Output output = new A001003E003Output();
		
		return output;
	}

}
