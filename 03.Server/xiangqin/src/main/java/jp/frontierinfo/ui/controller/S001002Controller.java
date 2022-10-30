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

import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001002Form;
import jp.frontierinfo.ui.input.S001002E001Input;
import jp.frontierinfo.ui.output.S001002E001Output;
//import jp.frontierinfo.ui.output.S001001E001Output;
//import jp.frontierinfo.ui.service.S001001E001Service;
import jp.frontierinfo.ui.service.S001002E001Service;

@Controller
@RequestMapping("/ui")  
public class S001002Controller {
	
	@Autowired
	private S001002E001Service s001002E001Service;
	
	@Autowired
	private MessageSource messageSource;
	
	/**
	 * 获取验证码按钮
	 */
	@RequestMapping(value="/s001002", params="getVerificationCode",method=RequestMethod.POST)
	public String e001(HttpServletRequest request, S001002Form form, Model model) {
		
		
		HttpSession session = request.getSession();
		//往session里面存值
		String registerSmsCode = "4321";
		session.setAttribute("check", registerSmsCode);
		System.out.println("生成验证码:"+registerSmsCode);
		model.addAttribute("message", "验证码发送成功，请输入验证码");

		return "s001002";
	}
	
	/**
	 * 注册按钮
	 */
	@RequestMapping(value="/s001002", params="register", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001002Form form, BindingResult result, 
			S001002E001Input input, Model model) {
		
		System.out.println("验证码对比是否正确");		
		
		HttpSession session = request.getSession();
		//从session里面取值		

		if(!form.getRegisterSmsCode().equals(session.getAttribute("check").toString())) {
			model.addAttribute("message", "验证码不一致请重新输入验证码");
			return "s002001";
		}

		S001002E001Output output = new S001002E001Output();
		try {
			output = s001002E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002001";
		}
		return "s002001";
	}
}
