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

import jp.frontierinfo.ui.form.S001004Form;
//import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001005Form;
import jp.frontierinfo.ui.input.S001005E001Input;
//import jp.frontierinfo.ui.output.S001005E001Output;
//import jp.frontierinfo.ui.service.S001005E001Service;

@Controller
@RequestMapping("/ui")  
public class S001008Controller {
	
	/**
	 * 发送验证码按钮
	 */
	@RequestMapping(value="/s001008",  method=RequestMethod.POST)
	public String e001() {
		
//		System.out.println("发送验证码进行中");
//		
//		HttpSession session = request.getSession();
//		//往session里面存值
//		session.setAttribute("check", 654321);
//		model.addAttribute("message", "验证码发送成功，请输入验证码");

		return "s001001";
	}
//	
//	/**
//	 * 确定按钮
//	 */
//	@RequestMapping(value="/s001006", params="sure", method=RequestMethod.POST)
//	public String e002(HttpServletRequest request, HttpServletResponse response, 
//			@Validated S001005Form form, BindingResult result, 
//			S001005E001Input input, Model model) {
//		
//		System.out.println("验证码对比是否正确");
//		
//		HttpSession session = request.getSession();
//		//从session里面取值
//		
//		if(!form.getCheck().equals(session.getAttribute("check").toString())) {
//			model.addAttribute("message", "验证码不一致请重新输入验证码");
//			return "s001006";
//		}
//
//		return "s001007";
//	}
//	
//	/**
//	 * 注册按钮
//	 */
//	@RequestMapping(value="/s001001", params="register", method=RequestMethod.POST)
//	public String e002(HttpServletRequest request, HttpServletResponse response, 
//			S001004Form form, S001004E001Input input) {
//		System.out.println("注册");
//		
//		return "s001002";
//	}
//	
//	/**
//	 * 忘记密码按钮
//	 */
//	@RequestMapping(value="/s001001", params="repassword", method=RequestMethod.POST)
//	public String e003(HttpServletRequest request, HttpServletResponse response, 
//			S001004Form form, S001004E001Input input) {
//		System.out.println("忘记密码");
//		
//		return "s001004";
//	}
}
