package jp.frontierinfo.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001002E001Input;
import jp.frontierinfo.api.outdto.A001002E001Output;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;

@Service
public class A001002E001Service extends AbstractServiceImpl<A001002E001Input, A001002E001Output>{
	
	public Logger logger = LoggerFactory.getLogger(A001002E001Service.class);

	@Override
	public A001002E001Output execute(A001002E001Input input) throws BusinessException {
		A001002E001Output output = new A001002E001Output();
		
		T01UserBasicInfo basicInfo = new T01UserBasicInfo();
		BeanUtils.copyProperties(input, basicInfo);
//		basicInfo.setUimages(StringUtils.join(input.getUimages()));
//		basicInfo.setIdentificationPhoto(StringUtils.join(input.getIdentificationPhoto()));
		
		int result = t01UserBasicInfoAccess.insert(basicInfo);
		
		logger.debug("设置个人信息>数据更新件数:"+result);
		
		return output;
	}

}
