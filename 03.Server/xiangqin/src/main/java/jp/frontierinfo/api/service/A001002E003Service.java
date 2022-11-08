package jp.frontierinfo.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001002E003Input;
import jp.frontierinfo.api.outdto.A001002E003Output;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserSearchInfo;

@Service
public class A001002E003Service extends AbstractServiceImpl<A001002E003Input, A001002E003Output>{

	@Override
	public A001002E003Output execute(A001002E003Input input) throws BusinessException {
		A001002E003Output output = new A001002E003Output();
		
		// 查询当前用户是否已设置检索条件
		int count = t01UserSearchInfoAccess.selectExist(input.getUid());
		
		if(count > 0) {
			// 已设置检索条件时执行更新操作
			T01UserSearchInfo searchInfo = new T01UserSearchInfo();
			BeanUtils.copyProperties(input, searchInfo);
			t01UserSearchInfoAccess.updateByPrimaryKey(searchInfo);
		} else {
			// 未设置检索条件时执行插入操作
			T01UserSearchInfo searchInfo = new T01UserSearchInfo();
			BeanUtils.copyProperties(input, searchInfo);
			t01UserSearchInfoAccess.insert(searchInfo);
		}
		
		
		
		return output;
	}

}
