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
		
		// 性别のラジオボタン
		output.setSexLi(ConstantInfo.sexLi);
		
		// 出生地プルダウンリスト情報
		List<String> birthPlaceLi = m01PulldownInfoAccess.selectPulldownLi("01");
		output.setBirthPlaceLi(birthPlaceLi);
		output.setRequireBirthPlaceLi(birthPlaceLi);
		
		// 居住地プルダウンリスト情報
		List<String> addressLi = m01PulldownInfoAccess.selectPulldownLi("02");
		output.setAddressLi(addressLi);
		output.setRequireAddressLi(addressLi);
		
		// 職業プルダウンリスト情報
		List<String> professionLi = m01PulldownInfoAccess.selectPulldownLi("03");
		output.setProfessionLi(professionLi);
		output.setRequireProfessionLi(professionLi);
		
		// ユーザーが前に設定された基本情報
		T01UserBasicInfo userBasicInfo = t01UserBasicInfoAccess.selectByPrimaryKey(input.getUid());
		BeanUtils.copyProperties(userBasicInfo, output);
		
		// ユーザーが前に設定された邮箱信息
		T01UserLoginInfo loginInfo = t01UserLoginInfoAccess.selectByPrimaryKey(input.getUid());
		output.setEmail(loginInfo.getEmail());
		
		return output;
	}

}
