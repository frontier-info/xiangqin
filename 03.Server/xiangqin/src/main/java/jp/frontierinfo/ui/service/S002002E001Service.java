package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.DateUtils;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.ui.input.S002002E001Input;
import jp.frontierinfo.ui.output.S002002E001Output;

@Service
public class S002002E001Service extends AbstractServiceImpl<S002002E001Input, S002002E001Output>{

	@Override
	public S002002E001Output execute(S002002E001Input input) throws BusinessException {
		
		T01UserBasicInfo basicInfo = new T01UserBasicInfo();
		basicInfo.setUname(input.getUname());
		basicInfo.setUid(input.getUid());
    	basicInfo.setSex(input.getSex());
		basicInfo.setBirthDate(DateUtils.stringToDate(input.getBirthDate()));
		basicInfo.setBirthPlace(input.getBirthPlace());
		basicInfo.setAddress(input.getAddress());
		basicInfo.setProfession(input.getProfession());
		basicInfo.setInterest(input.getInterest());
		basicInfo.setUheight(input.getUheight());
		basicInfo.setUheight(input.getUheight());
		basicInfo.setIntroduce(input.getIntroduce());
		basicInfo.setUweight(input.getUweight());
		basicInfo.setIntroduce(input.getIntroduce());
		basicInfo.setUimages(input.getUimagesPath());
		basicInfo.setIdentificationPhoto(input.getIdentificationPhoto());
		
		int count = t01UserBasicInfoAccess.insert(basicInfo);
				
		return new S002002E001Output();
	}

}
