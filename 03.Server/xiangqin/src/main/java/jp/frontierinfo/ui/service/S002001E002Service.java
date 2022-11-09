package jp.frontierinfo.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.input.S002001E002Input;
import jp.frontierinfo.ui.output.S002001E002Output;

@Service
public class S002001E002Service extends AbstractServiceImpl<S002001E002Input, S002001E002Output>{

	@Override
	public S002001E002Output execute(S002001E002Input input) throws BusinessException {
		
		S002001E002Output output = new S002001E002Output();
		
		// 获取籍贯下拉列表数据
		List<String> birthPlaceLi = m01PulldownInfoAccess.selectPulldownLi("01");
		output.setBirthPlaceLi(birthPlaceLi);
		
		// 获取现住址下拉列表数据
		List<String> addressLi = m01PulldownInfoAccess.selectPulldownLi("02");
		output.setAddressLi(addressLi);
		
		// 获取职业下拉列表数据
		List<String> professionLi = m01PulldownInfoAccess.selectPulldownLi("03");
		output.setProfessionLi(professionLi);
		
		return output;
	}

}
