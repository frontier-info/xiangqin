package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S002001Input;
import jp.frontierinfo.ui.output.S002001Output;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;


@Service
public class S002001Service extends AbstractServiceImpl<S002001Input, S002001Output>{

	
//	public List<UserSimpleInfo> selectRecommendList(T01UserSearchInfo searchInfo){
//		return t01UserBasicInfoDao.selectRecommendList(searchInfo);
//	}
	@Override
	public S002001Output execute(S002001Input iutput) throws BusinessException {
		
		T01UserBasicInfo UserSimpleInfo = new T01UserBasicInfo();
		
//		UserSimpleInfo.setUname(output.getUname());
//		UserSimpleInfo.setSex(output.getSex());
//		UserSimpleInfo.setIntroduce(output.getIntroduce());
//		UserSimpleInfo.setIdentificationPhoto(output.getIdentificationPhoto());
		
		T01UserSearchInfoAccess t01UserSearchInfoAccess.selectByPrimaryKey(uid);
		return t01UserSearchInfoAccess uid;
		
		
		t01UserBasicInfoAccess.selectRecommendList(searchInfo);
	    return t01UserBasicInfoAccess;
	}

}
