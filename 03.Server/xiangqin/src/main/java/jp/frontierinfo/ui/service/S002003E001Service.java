package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.DateUtils;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S002003E001Input;
import jp.frontierinfo.ui.output.S002003E001Output;

@Service
public class S002003E001Service extends AbstractServiceImpl<S002003E001Input, S002003E001Output>{

	@Override
	public S002003E001Output execute(S002003E001Input input) throws BusinessException {
		S002003E001Output output = new S002003E001Output();
		T01UserSearchInfo info = new T01UserSearchInfo();
		info.setUid(input.getUid());
		info.setSex(input.getSex() == "女" ? 0 : 1);
		info.setAgeFrom(input.getAgeFrom());
		info.setAgeTo(input.getAgeTo());
		info.setBirthPlace(input.getBirthPlace());
		info.setAddress(input.getAddress());
		info.setProfession(input.getProfession());
		info.setUheightFrom(Short.parseShort(input.getUheightFrom()));
		info.setUheightTo(Short.parseShort(input.getUheightTo()));
		info.setUweightFrom(Short.parseShort(input.getUweightFrom()));
		info.setUweightTo(Short.parseShort(input.getUweightTo()));
		
		int count = t01UserSearchInfoAccess.insert(info);
		if(count == 0) {
			// 用户不存在
			throw new BusinessException("数据库插入失败");
		}
		
		return output;
	}

}
