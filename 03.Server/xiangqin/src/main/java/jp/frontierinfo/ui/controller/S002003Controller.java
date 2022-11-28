package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.druid.util.StringUtils;

import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S002003Form;
import jp.frontierinfo.ui.input.S002003E001Input;
import jp.frontierinfo.ui.output.S002003E001Output;
import jp.frontierinfo.ui.service.S002003E001Service;
@Controller
@RequestMapping("/ui") 
@SessionAttributes(value="s002003Form") 
public class S002003Controller {

	@Autowired
	private S002003E001Service s002003E001Service;
	
	/**
	 * 保存搜索条件
	 */
	@PrintLog("用户择偶要求设定页面的保存搜索条件按钮点击")
	@RequestMapping(value="/s002003", params="saveSearchCondition", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s002003Form") S002003Form form, BindingResult result, 
			@Validated S002003E001Input input, Model model) {
        if(result.hasErrors()) {
        	return "s002003";
        }
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());

        // 普通用户检查是否设定了两个以上条件
		if(ConstantInfo.USER_RANK_NORMAL.equals(userLoginInfo.getUserRankCode()) && 
				normalUserSearchCheck(input) > 1) {
			model.addAttribute("message", "普通用户只能设定一个择偶条件.");
			model.addAttribute("s002003Form", form);
        	return "s002003";
		}
		S002003E001Output output = new S002003E001Output();
		try {
			output = s002003E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002003";
		}
		model.addAttribute("message", "用户择偶要求设定成功");
		return "forward:/ui/s002001/e000";
	}
	
	private int normalUserSearchCheck(S002003E001Input input) {
		// 条件设定个数
		int count = 0;
		if(input.getAgeFrom() != null || input.getAgeTo() != null) {
			count++;
		}
		if(!StringUtils.isEmpty(input.getBirthPlace())) {
			count++;
		}
		if(!StringUtils.isEmpty(input.getAddress())) {
			count++;
		}
		if(!StringUtils.isEmpty(input.getProfession())) {
			count++;
		}
		if(input.getUheightFrom() != null || input.getUheightTo() != null) {
			count++;
		}
		if(input.getUweightFrom() != null || input.getUweightTo() != null) {
			count++;
		}
		return count;
	}
}
