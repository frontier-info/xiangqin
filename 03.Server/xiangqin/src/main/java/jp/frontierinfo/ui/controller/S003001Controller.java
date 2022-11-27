package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S003001Form;
import jp.frontierinfo.ui.input.S003001E001Input;
import jp.frontierinfo.ui.input.S003001E002Input;
import jp.frontierinfo.ui.output.S003001E001Output;
import jp.frontierinfo.ui.output.S003001E002Output;
import jp.frontierinfo.ui.service.S003001E001Service;
import jp.frontierinfo.ui.service.S003001E002Service;

@Controller
@RequestMapping("/ui")  
public class S003001Controller {
	
	@Autowired
	private S003001E001Service s003001E001Service;
	
	@Autowired
	private S003001E002Service s003001E002Service;

	/**
	 * 我打过招呼的人按钮
	 */
	@RequestMapping(value="/s003001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response,
			S003001Form form, BindingResult result,
			S003001E001Input input, Model model) {
		System.out.println("我打过招呼的人");
		S003001E001Output output = new S003001E001Output();
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		try {
			output = s003001E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s003001Form", form);

		return "s003001";
	}
	
	/**
	 * 我打过招呼的人详细信息
	 */
	@PrintLog("我打过招呼的人详细信息")
	@RequestMapping(value="/s003001/e002", method= {RequestMethod.GET})
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s003001Form") S003001Form form, BindingResult result, 
			S003001E002Input input, Model model) {
		
		S003001E002Output output = new S003001E002Output();
		T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		try {
			output = s003001E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s003001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s003001Form", form);

		return "s003002";

	}
}