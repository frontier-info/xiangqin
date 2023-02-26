package jp.frontierinfo.ui.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.SHA256Util;
import jp.frontierinfo.common.utils.TokenUtils;
import jp.frontierinfo.db.entity.T01UserBasicInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.db.entity.T01UserSearchInfo;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.output.S001001E001Output;

@Service
public class S001001E001Service extends AbstractServiceImpl<S001001E001Input, S001001E001Output>{

	
	@Override
	public S001001E001Output execute(S001001E001Input input) throws BusinessException {
		S001001E001Output output = new S001001E001Output();
		T01UserLoginInfo userLoginInfo = null;
		if(ConstantInfo.EMAIL.equals(input.getLoginType())) {
			
			int count = t01UserLoginInfoAccess.userExistByEmail(input.getMobileOrEmail());
			if(count == 0) {
				// ユーザーが存在しない
				throw new BusinessException("ユーザーが存在しない");
			}
			userLoginInfo = t01UserLoginInfoAccess.loginVerifyWithEmail(input.getMobileOrEmail(), SHA256Util.getSHA256(input.getPassword()));
			if(userLoginInfo != null) {
				// ユーザーのメールアドレスとパスワードが認証成功
				output.setUserLoginInfo(userLoginInfo);
				output.setToken(TokenUtils.tokenForLogin(input.getMobileOrEmail()));
			} else {
				// ユーザーのメールアドレスとパスワードが一致しない
				throw new BusinessException("メールアドレスとパスワードが一致しない");
			}
		} else {
			int count = t01UserLoginInfoAccess.userExistByMobile(input.getMobileOrEmail());
			if(count == 0) {
				// ユーザーが存在しない
				throw new BusinessException("ユーザーが存在しない");
			}
			userLoginInfo = t01UserLoginInfoAccess.loginVerifyWithMobile(input.getMobileOrEmail(), SHA256Util.getSHA256(input.getPassword()));
			if(userLoginInfo != null) {
				// ユーザーの電話番号とパスワードが認証成功
				output.setUserLoginInfo(userLoginInfo);
				output.setToken(TokenUtils.tokenForLogin(input.getMobileOrEmail()));
			} else {
				// ユーザーのメールアドレスとパスワードが一致しない
				throw new BusinessException("電話番号とパスワードが一致しない");
			}
			
		}
		
		// ユーザー基本情報を取得
		T01UserBasicInfo userBasicInfo = t01UserBasicInfoAccess.selectByPrimaryKey(userLoginInfo.getUid());
		output.setUserBasicInfo(userBasicInfo);
		
		// ユーザーの検索条件を取得
		T01UserSearchInfo userSearchInfo = t01UserSearchInfoAccess.selectByPrimaryKey(userLoginInfo.getUid());
		output.setUserSearchInfo(userSearchInfo);
		
		// ユーザーの最終ログイン日時を更新
		userLoginInfo.setLastLoginTime(new Date());
		t01UserLoginInfoAccess.updateByPrimaryKeySelective(userLoginInfo);
		
		return output;
	}

	public int delete(String input) throws BusinessException {

		int updRes = t01UserLoginInfoAccess.updateDeleteFlg(input);
		return updRes;
	}

}
