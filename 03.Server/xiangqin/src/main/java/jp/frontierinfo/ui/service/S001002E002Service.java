package jp.frontierinfo.ui.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.SHA256Util;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S001002E002Input;
import jp.frontierinfo.ui.output.S001002E002Output;

@Service
public class S001002E002Service extends AbstractServiceImpl<S001002E002Input, S001002E002Output>{

    @Override
	public S001002E002Output execute(S001002E002Input input) throws BusinessException {
		S001002E002Output output = new S001002E002Output();
		String uid = s01SequenceAccess.getUid();
		T01UserLoginInfo info = new T01UserLoginInfo();
		info.setUid(uid);
		info.setEmail(input.getEmail());
		info.setPassword(SHA256Util.getSHA256(input.getPassword()));
		info.setUserStatusCode("00");
		info.setUserRankCode("01");
		info.setCreateTime(new Date());
		info.setDeleteFlg(false);
		T01UserBasicInfo basicInfo = new T01UserBasicInfo();
		basicInfo.setUid(uid);
		T01UserSearchInfo searchInfo = new T01UserSearchInfo();
		searchInfo.setUid(uid);
		// ユーザーログイン情報
		t01UserLoginInfoAccess.insert(info);		
		// ユーザー基本情報に空レコードを挿入
		t01UserBasicInfoAccess.insert(basicInfo);		
		return output;
	}

}
