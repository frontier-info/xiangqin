package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.input.S002001E001Input;
import jp.frontierinfo.ui.output.S002001E001Output;

@Service
public class S002001E001Service extends AbstractServiceImpl<S002001E001Input, S002001E001Output>{

	@Override
	public S002001E001Output execute(S002001E001Input input) throws BusinessException {
		
				
		return new S002001E001Output();
	}

}
