package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.outdto.A001001E001Output;
import jp.frontierinfo.db.entity.T01UserLoginInfo;

@Service
public class A001001E001Service extends AbstractServiceImpl<A001001E001Input, A001001E001Output>{

	@Override
	public A001001E001Output execute(A001001E001Input input) {
		A001001E001Output output = new A001001E001Output();
		T01UserLoginInfo login = new T01UserLoginInfo();
		login.setUid("9");
		t01UserLoginInfoAccess.insert(login);
		return output;
	}

}
