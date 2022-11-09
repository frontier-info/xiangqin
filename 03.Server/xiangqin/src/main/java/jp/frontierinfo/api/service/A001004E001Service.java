package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001004E001Input;
import jp.frontierinfo.api.outdto.A001004E001Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001004E001Service extends AbstractServiceImpl<A001004E001Input, A001004E001Output>{

	@Override
	public A001004E001Output execute(A001004E001Input input) throws BusinessException {
		A001004E001Output output = new A001004E001Output();
		
		// 返回当前用户邀约过的所有对象,
		// 对象信息为:uid,uname,relation_status,头像图片
		
		return output;
	}

}
