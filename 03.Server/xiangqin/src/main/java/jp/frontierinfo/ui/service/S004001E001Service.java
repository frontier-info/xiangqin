package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.ui.input.S004001E001Input;
//import jp.frontierinfo.common.utils.TokenUtils;
//import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.output.S004001E001Output;

@Service
public class S004001E001Service extends AbstractServiceImpl<S004001E001Input, S004001E001Output>{

	@Override
	public S004001E001Output execute(S004001E001Input input) throws BusinessException {
		
		S004001E001Output output = new S004001E001Output();	
		
		List<UserSimpleInfo> userSimpleInfoLi = t01UserRelationsInfoAccess.selectReceiveRelation(input.getUid());
		output.setUserSimpleInfoLi(userSimpleInfoLi);

		return output;
	}
	
	
}
