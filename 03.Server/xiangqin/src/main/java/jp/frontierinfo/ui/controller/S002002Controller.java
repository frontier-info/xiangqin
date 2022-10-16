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
public class S002002Controller {
	
//	@Autowired
//	private S001001E001Service s001001E001Service;
//	
//	@Autowired
//	private MessageSource messageSource;
	
	/**
	 * 用户信息设定按钮
	 */
	@RequestMapping(value="/s002002", params="a", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@Validated S002002Form form, BindingResult result, 
			S001001E001Input input, Model model) {
		System.out.println("用户信息设定");

		return "s002002";
	}
	
	/**
	 * 确认并提交个人信息按钮
	 */
	@RequestMapping(value="/s002002", params="b", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S002002Form form, S001001E001Input input) {
		System.out.println("确认并提交个人信息");
		
		return "s0020021";
	}
	

}
