package jp.frontierinfo.ui.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S002003E001Input;
import jp.frontierinfo.ui.output.S002003E001Output;

@Service
public class S002003E001Service extends AbstractServiceImpl<S002003E001Input, S002003E001Output>{

	@Override
	public S002003E001Output execute(S002003E001Input input) throws BusinessException {
		S002003E001Output output = new S002003E001Output();
		
		// ユーザー基本情報を取得
		T01UserBasicInfo userBasicInfo = t01UserBasicInfoAccess.selectByPrimaryKey(input.getUid());
		
		T01UserSearchInfo info = t01UserSearchInfoAccess.selectByPrimaryKey(input.getUid());
		boolean existFlg = true;
		if(info == null) {
			existFlg = false;
			info = new T01UserSearchInfo();
		}
		info.setUid(input.getUid());
		info.setSex(ConstantInfo.MALE.equals(userBasicInfo.getSex())?"女":"男");
		info.setAgeFrom(input.getAgeFrom());
		info.setAgeTo(input.getAgeTo());
		info.setBirthPlace(input.getBirthPlace());
		info.setAddress(input.getAddress());
		info.setProfession(input.getProfession());
		info.setUheightFrom(input.getUheightFrom());
		info.setUheightTo(input.getUheightTo());
		info.setUweightFrom(input.getUweightFrom());
		info.setUweightTo(input.getUweightTo());
		if(existFlg) {
			t01UserSearchInfoAccess.updateByPrimaryKey(info);
		} else {
			t01UserSearchInfoAccess.insert(info);
		}
		
		return output;
	}

}
