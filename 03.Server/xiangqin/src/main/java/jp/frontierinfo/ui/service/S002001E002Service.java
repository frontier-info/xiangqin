package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S002001E002Input;
import jp.frontierinfo.ui.output.S002001E002Output;

@Service
public class S002001E002Service extends AbstractServiceImpl<S002001E002Input, S002001E002Output>{

	@Override
	public S002001E002Output execute(S002001E002Input input) throws BusinessException {
		
		S002001E002Output output = new S002001E002Output();
		
		// 出生地プルダウンリスト情報
		List<String> birthPlaceLi = m01PulldownInfoAccess.selectPulldownLi("01");
		output.setBirthPlaceLi(birthPlaceLi);
		
		// 居住地プルダウンリスト情報
		List<String> addressLi = m01PulldownInfoAccess.selectPulldownLi("02");
		output.setAddressLi(addressLi);
		
		// 職業プルダウンリスト情報
		List<String> professionLi = m01PulldownInfoAccess.selectPulldownLi("03");
		output.setProfessionLi(professionLi);
		
		// ユーザーが前に設定された検索条件
		T01UserSearchInfo userSearchInfo = t01UserSearchInfoAccess.selectByPrimaryKey(input.getUid());
		if(userSearchInfo != null) {
			BeanUtils.copyProperties(userSearchInfo, output);
		}
		
		return output;
	}

}
