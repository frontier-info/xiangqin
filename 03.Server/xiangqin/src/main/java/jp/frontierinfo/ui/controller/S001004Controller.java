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

import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001004Form;
import jp.frontierinfo.ui.input.S001004E001Input;
import jp.frontierinfo.ui.output.S001004E001Output;
import jp.frontierinfo.ui.service.S001004E001Service;

@Controller
@RequestMapping("/ui")  
public class S001004Controller {
	
	@Autowired
	private S001004E001Service s001004E001Service;
	
	/**
	 * 发送验证码按钮、发送验证码同时检测手机号是否存在
	 */
	@PrintLog("忘记密码页面的获取验证码按钮点击")
	@RequestMapping(value="/s001004", params="sendCheck", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001004Form form, BindingResult result, 
			S001004E001Input input, Model model) {
		
        if(result.hasErrors()) {
        	return "s001004";
        } 
		S001004E001Output output = new S001004E001Output();
		try {
			output = s001004E001Service.execute(input);
			
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001004";
		}
		
		//在session里面存验证码
		HttpSession session = request.getSession();
		session.setAttribute(ConstantInfo.REGISTER_SMS_CODE, output.getVerificationCode());
		
		model.addAttribute("message", "验证码发送成功，请输入验证码"); 
		
		return "s001004";
	}

	/**
	 * 重置密码按钮
	 */
	@PrintLog("忘记密码页面的重置密码按钮点击")
	@RequestMapping(value="/s001004", params="repassword", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001004Form form, BindingResult result, 
			S001004E001Input input, Model model) {
		
		HttpSession session = request.getSession();
		
		if(!form.getCheck().equals(session.getAttribute(ConstantInfo.REGISTER_SMS_CODE).toString())) {
			
			model.addAttribute("message", "验证码不一致请重新输入验证码");
			return "s001004";	
		}else {
						
			if(input.getPassword().equals(input.getPassword1())) {	
				try {
					s001004E001Service.execute1(input);
				} catch (BusinessException e) {
					e.printStackTrace();
				}
			}else {
				model.addAttribute("message", "密码不一致请重新输入密码");
				return "s001004";
			}			
		}

		model.addAttribute("message", "用户密码更新完成，请重新登录");
		return "s001001";
	}
}
