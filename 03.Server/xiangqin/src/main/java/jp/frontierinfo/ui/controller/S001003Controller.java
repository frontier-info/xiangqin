package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001003Form;
import jp.frontierinfo.ui.input.S001003E001Input;
import jp.frontierinfo.ui.input.S001003E002Input;
import jp.frontierinfo.ui.output.S001003E001Output;
import jp.frontierinfo.ui.service.S001003E001Service;
import jp.frontierinfo.ui.service.S001003E002Service;

@Controller
@RequestMapping("/ui")  
public class S001003Controller extends AbstractController {
	
	@Autowired
	private S001003E001Service s001003E001Service;
	
	@Autowired
	private S001003E002Service s001003E002Service;
	
	/**
	 * 发送验证码按钮、发送验证码同时检测手机号是否存在
	 */
	@PrintLog("忘记密码页面的获取验证码按钮点击")
	@RequestMapping(value="/s001003", params="sendCheck", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S001003Form form, BindingResult formResult, 
			@Validated S001003E001Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001003";
        } 
		S001003E001Output output = new S001003E001Output();
		try {
			output = s001003E001Service.execute(input);
			
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001003";
		}
		
		// 将手机号和验证码存入session
		HttpSession session = request.getSession();
		session.setAttribute(ConstantInfo.REGISTER_SMS_CODE, output.getVerificationCode());
		session.setAttribute(ConstantInfo.REGISTER_MOBEL, input.getMobile());
		
		model.addAttribute("message", "验证码发送成功，请输入验证码"); 
		
		return "s001003";
	}

	/**
	 * 重置密码按钮
	 */
	@PrintLog("忘记密码页面的重置密码按钮点击")
	@RequestMapping(value="/s001003", params="repassword", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001003Form form, BindingResult result, 
			S001003E002Input input, Model model) {
		
		HttpSession session = request.getSession();

		if(!input.getMobile().equals(session.getAttribute(ConstantInfo.REGISTER_MOBEL).toString())) {
			model.addAttribute("message", "手机号前后不一致请确认");
			return "s001003";
		}

		if(!input.getRegisterSmsCode().equals(session.getAttribute(ConstantInfo.REGISTER_SMS_CODE).toString())) {
			model.addAttribute("message", "验证码不一致请重新输入验证码");
			return "s001003";
		}
		
		if(!input.getPassword().equals(input.getRepassword())) {
			model.addAttribute("message", "两次密码输入不一致,请确认");
			return "s001003";
		}
		
		try {
			s001003E002Service.execute(input);
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		model.addAttribute("message", "用户密码更新完成，请重新登录");
		return "s001001";
	}
}
