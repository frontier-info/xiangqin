package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.ui.input.S003001E001Input;
import jp.frontierinfo.ui.output.S003001E001Output;

@Service
public class S003001E001Service extends AbstractServiceImpl<S003001E001Input, S003001E001Output>{

	@Override
	public S003001E001Output execute(S003001E001Input input) throws BusinessException {
		
		S003001E001Output output = new S003001E001Output();
		
		List<UserSimpleInfo> userSimpleInfoLi = t01UserRelationsInfoAccess.selectSendRelation(input.getUid());
		output.setUserSimpleInfoLi(userSimpleInfoLi);
		
		return output;
	}

}
