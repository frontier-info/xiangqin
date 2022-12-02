package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.PullDownBean;
import jp.frontierinfo.db.bean.UserFullInfo;
import jp.frontierinfo.ui.input.S009020E002Input;
import jp.frontierinfo.ui.output.S009020E002Output;

@Service
public class S009020E002Service extends AbstractServiceImpl<S009020E002Input, S009020E002Output>{

	@Override
	public S009020E002Output execute(S009020E002Input input) throws BusinessException {
		
		S009020E002Output output = new S009020E002Output();
		
		UserFullInfo userFullInfo = t01UserBasicInfoAccess.selectUserFullInfoByUidForBackstage(input.getUid());
		output.setUserFullInfo(userFullInfo);
		
		// 获取用户状态下拉列表数据
		List<PullDownBean> userStatusLi = m01CodeMasterInfoAccess.selectCodeMasterData("01");
		output.setUserStatusLi(userStatusLi);
		
		// 获取用户级别下拉列表数据
		List<PullDownBean> userRankLi = m01CodeMasterInfoAccess.selectCodeMasterData("02");
		output.setUserRankLi(userRankLi);
		
		return output;
	}

}
