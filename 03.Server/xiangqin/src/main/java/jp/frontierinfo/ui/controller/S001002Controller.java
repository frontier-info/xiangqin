package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.form.S001002Form;
import jp.frontierinfo.ui.input.S001002E001Input;
import jp.frontierinfo.ui.input.S001002E002Input;
import jp.frontierinfo.ui.output.S001002E001Output;
import jp.frontierinfo.ui.output.S001002E002Output;
import jp.frontierinfo.ui.service.S001002E001Service;
//import jp.frontierinfo.ui.output.S001001E001Output;
//import jp.frontierinfo.ui.service.S001001E001Service;
import jp.frontierinfo.ui.service.S001002E002Service;

@Controller
@RequestMapping("/ui")  
public class S001002Controller extends AbstractController {
	
	@Autowired
	private S001002E001Service s001002E001Service;
	
	@Autowired
	private S001002E002Service s001002E002Service;
	
	@Autowired
	private MessageSource messageSource;
	
	/**
	 * 获取验证码按钮
	 */
	@RequestMapping(value="/s001002", params="getVerificationCode",method=RequestMethod.POST)
	public String e001(HttpServletRequest request, S001002Form form, 
			S001002E001Input input, Model model) {
		S001002E001Output output = new S001002E001Output();
		try {
			output = s001002E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001002";
		}
		
		HttpSession session = request.getSession();
		// 将验证码存入session
		session.setAttribute("VerificationCodeForRegister", output.getVerificationCode());
		model.addAttribute("message", "验证码发送成功，请输入验证码");

		return "s001002";
	}
	
	/**
	 * 注册按钮
	 */
	@RequestMapping(value="/s001002", params="register", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S001002Form form, BindingResult formResult, 
			@Validated S001002E002Input input, BindingResult inputResult, 
			Model model) {
		
		System.out.println("注册执行");	
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001002";
        } 	
		
		// 将验证码从从session里面取出		
		HttpSession session = request.getSession();

		if(!input.getRegisterSmsCode().equals(session.getAttribute("VerificationCodeForRegister").toString())) {
			model.addAttribute("message", "验证码不一致请重新输入验证码");
			return "s001002";
		}
		
		if(!input.getPassword().equals(input.getRepassword())) {
			model.addAttribute("message", "两次密码输入不一致,请确认");
			return "s001002";
		}

		S001002E002Output output = new S001002E002Output();
		try {
			output = s001002E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001002";
		}
		model.addAttribute("message", "注册成功,请登录");
		model.addAttribute("s001001Form", new S001001Form());
		return "s001001";
	}
}
