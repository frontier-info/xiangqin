package jp.frontierinfo.ui.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.ui.input.S002002E001Input;
import jp.frontierinfo.ui.output.S002002E001Output;

@Service
public class S002002E001Service extends AbstractServiceImpl<S002002E001Input, S002002E001Output>{

	@Override
	public S002002E001Output execute(S002002E001Input input) throws BusinessException {
		
		T01UserBasicInfo basicInfo = new T01UserBasicInfo();
		basicInfo.setUname(input.getUname());
		int count = t01UserBasicInfoAccess.insert(basicInfo);
		
		basicInfo.setUid(input.getUid());
		int countId = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setSex(input.getSex());
		int countSex = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setBirthDate(input.getBirthDate());
		int countBirthDate = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setBirthPlace(input.getBirthPlace());
		int countBirthPlace = t01UserBasicInfoAccess.insert(basicInfo);
		
		basicInfo.setAddress(input.getAddress());
		int countddress = t01UserBasicInfoAccess.insert(basicInfo);
		
		basicInfo.setProfession(input.getProfession());
		int countProfession = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setInterest(input.getInterest());
		int countInterest = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setUheight(input.getUheight());
		int countUheight = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setIntroduce(input.getIntroduce());
		int countIntroduce = t01UserBasicInfoAccess.insert(basicInfo);
		
		basicInfo.setUweight(input.getUweight());
		int countUweight = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setIntroduce(input.getIntroduce());
		int countetIntroduce = t01UserBasicInfoAccess.insert(basicInfo);
		
		basicInfo.setUimages(input.getUimages());
		int countUimages = t01UserBasicInfoAccess.insert(basicInfo);
		
		
		basicInfo.setIdentificationPhoto(input.getIdentificationPhoto());
		int countIdentificationPhoto= t01UserBasicInfoAccess.insert(basicInfo);
		
	
		
		
		return new S002002E001Output();
	}

}
