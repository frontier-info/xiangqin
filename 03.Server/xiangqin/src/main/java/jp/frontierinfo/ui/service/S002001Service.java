package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S002001Input;
import jp.frontierinfo.ui.output.S002001Output;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.bean.UserSimpleInfo;


@Service
public class S002001Service extends AbstractServiceImpl<S002001Input, S002001Output>{

	

	@Override
	public S002001Output execute(S002001Input output) throws BusinessException {
		
		T01UserBasicInfo UserSimpleInfo = new T01UserBasicInfo();



		T01UserSearchInfo searchInfo = t01UserSearchInfoAccess.selectByPrimaryKey(output.getUid());
		List<UserSimpleInfo> userSimpleInfoLi = t01UserBasicInfoAccess.selectRecommendList(searchInfo);
	
		//output.t01UserSearchInfoAccess(userSearchInfo);
		
		S002001Output Output = new S002001Output();
		Output.setUserSimpleInfoLi(userSimpleInfoLi);
		
		
	
		//output.setUserFullInfoLi(userFullInfoLi);
		
	    return Output;

    }

}