package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.output.S001001E001Output;
import jp.frontierinfo.ui.service.S001001E001Service;

@Controller
@RequestMapping("/ui")  
public class S001001Controller {
	
	@Autowired
	private S001001E001Service s001001E001Service;
	
	@Autowired
	private MessageSource messageSource;
	
	/**
	 * 网站首页
	 */
	@RequestMapping(value="/s001001", method=RequestMethod.GET)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		System.out.println("网站首页");
		return "s001001";
	}
	
	/**
	 * 登录按钮
	 */
	@RequestMapping(value="/s001001", params="login", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001001Form form, BindingResult result, 
			S001001E001Input input, Model model) {
		System.out.println("登录");
        if(result.hasErrors()) {
        	return "s001001";
        } 
		S001001E001Output output = new S001001E001Output();
		try {
			output = s001001E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}
		return "s002001";
	}
	
	/**
	 * 注册按钮
	 */
	@RequestMapping(value="/s001001", params="register", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		System.out.println("注册");
		
		return "s001002";
	}
	
	/**
	 * 忘记密码按钮
	 */
	@RequestMapping(value="/s001001", params="repassword", method=RequestMethod.POST)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		System.out.println("忘记密码");
		
		return "s001004";
	}
}
