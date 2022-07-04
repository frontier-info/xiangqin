package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractService;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.outdto.A001001E001Output;

@Service
public class A001001Service extends AbstractService{

	public A001001E001Output execute(A001001E001Input input) {
		A001001E001Output output = new A001001E001Output();

		return output;
	}

}
