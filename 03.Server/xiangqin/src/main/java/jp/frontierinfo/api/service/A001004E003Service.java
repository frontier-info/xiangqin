package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001004E003Input;
import jp.frontierinfo.api.outdto.A001004E003Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001004E003Service extends AbstractServiceImpl<A001004E003Input, A001004E003Output>{

	@Override
	public A001004E003Output execute(A001004E003Input input) throws BusinessException {
		A001004E003Output output = new A001004E003Output();
		
		// 返回relationId用户的详细信息
		// isRelation为同意时附带返回邀约对象联系方式
		
		return output;
	}

}
