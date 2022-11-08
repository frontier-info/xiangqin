package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001003E001Input;
import jp.frontierinfo.api.outdto.A001003E001Output;
import jp.frontierinfo.common.exception.BusinessException;

@Service
public class A001003E001Service extends AbstractServiceImpl<A001003E001Input, A001003E001Output>{

	@Override
	public A001003E001Output execute(A001003E001Input input) throws BusinessException {
		A001003E001Output output = new A001003E001Output();
		
		// 查询当前用户是否设置过检索条件
		
		// 未设置检索条件时,返回错误信息提示用户设置检索条件
		
		// 已设置检索条件时,按照设定的检索条件检索30名异性信息
		
		return output;
	}

}
