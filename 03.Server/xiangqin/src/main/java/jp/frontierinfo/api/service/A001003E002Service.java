package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001003E002Input;
import jp.frontierinfo.api.outdto.A001003E002Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001003E002Service extends AbstractServiceImpl<A001003E002Input, A001003E002Output>{

	@Override
	public A001003E002Output execute(A001003E002Input input) throws BusinessException {
		A001003E002Output output = new A001003E002Output();
		
		// 查询当前用户已向该指定异性发送过邀约信息
		
		// 已发送过时返回错误信息
		
		// 未发送过时插入邀约信息
		
		return output;
	}

}
