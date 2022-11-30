package jp.frontierinfo.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.UserSimpleInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S002001Input;
import jp.frontierinfo.ui.output.S002001Output;


@Service
public class S002001Service extends AbstractServiceImpl<S002001Input, S002001Output>{

	

	@Override
	public S002001Output execute(S002001Input input) throws BusinessException {
		
		S002001Output output = new S002001Output();

		T01UserSearchInfo searchInfo = t01UserSearchInfoAccess.selectByPrimaryKey(input.getUid());
		
		// 用户检索条件未设定时,处理结束
		if(searchInfo == null) {
			return output;
		}
		
		List<UserSimpleInfo> userSimpleInfoLi = t01UserBasicInfoAccess.selectRecommendList(searchInfo);
		output.setUserSimpleInfoLi(userSimpleInfoLi);
		
		// 符合条件的异性信息不满30名时,从数据库随机补位至30名
		List<String> exceptList = new ArrayList<>();
		for(UserSimpleInfo userSimpleInfo : userSimpleInfoLi) {
			exceptList.add(userSimpleInfo.getUid());
		}
		List<UserSimpleInfo> randomUserSimpleInfoLi = t01UserBasicInfoAccess.selectRandomList(exceptList,3);
		output.setRandomUserSimpleInfoLi(randomUserSimpleInfoLi);
		
	    return output;

    }

}