package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.DateUtils;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.ui.input.S002001Input;
import jp.frontierinfo.ui.output.S002001Output;


@Service
public class S002001Service extends AbstractServiceImpl<S002001Input, S002001Output>{

	@Override
	public S002001Output execute(S002001Input input) throws BusinessException {
		
		T01UserBasicInfo basicInfo = new T01UserBasicInfo();
		basicInfo.setUname(input.getUname());
		basicInfo.setSex(input.getSex());
		basicInfo.setIntroduce(input.getIntroduce());
		basicInfo.setIdentificationPhoto(input.getIdentificationPhoto());
		
		int count = t01UserBasicInfoAccess.insert(basicInfo);
				
		return new S002001Output();
	}

}
