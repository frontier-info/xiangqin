package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.input.S002001E001Input;
import jp.frontierinfo.ui.output.S002001E001Output;

@Service
public class S002001E001Service extends AbstractServiceImpl<S002001E001Input, S002001E001Output>{

	@Override
	public S002001E001Output execute(S002001E001Input input) throws BusinessException {
		
		S002001E001Output output = new S002001E001Output();
		
		// 设置性别单选按钮数据
		output.setSexLi(ConstantInfo.sexLi);
		
		// 获取籍贯下拉列表数据
		List<String> birthPlaceLi = m01PulldownInfoAccess.selectPulldownLi("01");
		output.setBirthPlaceLi(birthPlaceLi);
		output.setRequireBirthPlaceLi(birthPlaceLi);
		
		// 获取现住址下拉列表数据
		List<String> addressLi = m01PulldownInfoAccess.selectPulldownLi("02");
		output.setAddressLi(addressLi);
		output.setRequireAddressLi(addressLi);
		
		// 获取职业下拉列表数据
		List<String> professionLi = m01PulldownInfoAccess.selectPulldownLi("03");
		output.setProfessionLi(professionLi);
		output.setRequireProfessionLi(professionLi);
		
		// 获取用户之前设定的个人信息
		T01UserBasicInfo userBasicInfo = t01UserBasicInfoAccess.selectByPrimaryKey(input.getUid());
		BeanUtils.copyProperties(userBasicInfo, output);
		
		// 获取用户之前设定的邮箱信息
		T01UserLoginInfo loginInfo = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		output.setEmail(loginInfo.getEmail());
		
		return output;
	}

}
