package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.service.S002001E001Service;

@Controller
@RequestMapping("/ui")  
public class S002001Controller {
	
	@Autowired
	private S002001E001Service s002001E001Service;
	
//	@Autowired
//	private MessageSource messageSource;
	
	/**
	 * 用户信息设定按钮
	 */
	@RequestMapping(value="/s002001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001001Form form, BindingResult result, 
			S001001E001Input input, Model model) {
		System.out.println("用户信息设定");

		return "s002002";
	}
	
	/**
	 * 检索条件设定按钮
	 */
	@RequestMapping(value="/s002001/e002", method=RequestMethod.GET)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		System.out.println("检索条件设定");
		
		return "s002003";
	}
	
	/**
	 * 退出登录按钮
	 */
	@RequestMapping(value="/s002001/e003", method=RequestMethod.GET)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		System.out.println("退出登录");
		
		return "e003";
	}
}
