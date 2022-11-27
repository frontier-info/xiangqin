package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S001001E001Input;
//import jp.frontierinfo.common.utils.TokenUtils;
//import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.output.S004001E001Output;

@Service
public class S004001E001Service extends AbstractServiceImpl<S001001E001Input, S004001E001Output>{

	@Override
	public S004001E001Output execute(S001001E001Input input) throws BusinessException {
		
		S004001E001Output output = new S004001E001Output();	
				
		T01UserLoginInfo loginInfo = t01UserLoginInfoAccess.loginVerifyWithPhone(input.getMobile(),input.getPassword());	
		/*
		 * if(count == 0) { // 用户不存在 throw new BusinessException("用户不存在"); }
		 */
		T01UserBasicInfo basicInfo = t01UserBasicInfoAccess.selectByPrimaryKey(loginInfo.getUid());
		
		output.setUid(basicInfo.getUid());
		output.setUname(basicInfo.getUname());
		output.setSex(basicInfo.getSex());
		output.setIntroduce(basicInfo.getIntroduce());

		return output;
	}
	
	
}
