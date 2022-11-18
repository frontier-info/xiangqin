package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S009020E006Input;
import jp.frontierinfo.ui.output.S009020E006Output;

@Service
public class S009020E006Service extends AbstractServiceImpl<S009020E006Input, S009020E006Output>{

	@Override
	public S009020E006Output execute(S009020E006Input input) throws BusinessException {
		
		S009020E006Output output = new S009020E006Output();
		
		// 通过用户ID获取用户信息
		T01UserLoginInfo info = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		info.setDeleteFlg(true);
		
		// 删除用户
		t01UserLoginInfoAccess.updateByPrimaryKey(info);	
		
		output.setUid(info.getUid());
		
		return output;
	}

}
