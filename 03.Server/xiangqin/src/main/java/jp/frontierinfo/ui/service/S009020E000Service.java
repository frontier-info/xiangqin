package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.bean.PullDownBean;
import jp.frontierinfo.ui.input.S009020E000Input;
import jp.frontierinfo.ui.output.S009020E000Output;

@Service
public class S009020E000Service extends AbstractServiceImpl<S009020E000Input, S009020E000Output>{

	@Override
	public S009020E000Output execute(S009020E000Input input) throws BusinessException {
		
		S009020E000Output output = new S009020E000Output();
		
		// 获取籍贯下拉列表数据
		List<String> birthPlaceLi = m01PulldownInfoAccess.selectPulldownLi("01");
		output.setBirthPlaceLi(birthPlaceLi);
		
		// 获取现住址下拉列表数据
		List<String> addressLi = m01PulldownInfoAccess.selectPulldownLi("02");
		output.setAddressLi(addressLi);
		
		// 获取职业下拉列表数据
		List<String> professionLi = m01PulldownInfoAccess.selectPulldownLi("03");
		output.setProfessionLi(professionLi);
		
		// 获取用户状态下拉列表数据
		List<PullDownBean> userStatusLi = m01CodeMasterInfoAccess.selectCodeMasterData("01");
		output.setUserStatusLi(userStatusLi);
		
		// 获取用户级别下拉列表数据
		List<PullDownBean> userRankLi = m01CodeMasterInfoAccess.selectCodeMasterData("02");
		output.setUserRankLi(userRankLi);
		
		return output;
	}

}
