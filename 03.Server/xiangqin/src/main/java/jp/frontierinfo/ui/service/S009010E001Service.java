package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S009010E001Input;
import jp.frontierinfo.ui.output.S009010E001Output;

@Service
public class S009010E001Service extends AbstractServiceImpl<S009010E001Input, S009010E001Output>{

	@Override
	public S009010E001Output execute(S009010E001Input input) throws BusinessException {
		
		S009010E001Output output = new S009010E001Output();

		// 設定した検索条件でユーザー情報を检索
		BackstageSerachInfo searchInfo = new BackstageSerachInfo();
		BeanUtils.copyProperties(input, searchInfo);
		List<UserFullInfo> userFullInfoLi = t01UserBasicInfoAccess.selectUserFullInfoLi(searchInfo);
		output.setUserFullInfoLi(userFullInfoLi);
		
		return output;
	}

}
