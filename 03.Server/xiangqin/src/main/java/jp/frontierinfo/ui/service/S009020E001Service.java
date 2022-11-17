package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.BackstageSerachInfo;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S009020E001Input;
import jp.frontierinfo.ui.output.S009020E001Output;

@Service
public class S009020E001Service extends AbstractServiceImpl<S009020E001Input, S009020E001Output>{

	@Override
	public S009020E001Output execute(S009020E001Input input) throws BusinessException {
		
		S009020E001Output output = new S009020E001Output();
		
		// 获取用户设定的检索条件
		BackstageSerachInfo searchInfo = new BackstageSerachInfo();
		BeanUtils.copyProperties(input, searchInfo);
		List<UserFullInfo> userFullInfoLi = t01UserBasicInfoAccess.selectUserFullInfoLi(searchInfo);
		output.setUserFullInfoLi(userFullInfoLi);
		
		return output;
	}

}
