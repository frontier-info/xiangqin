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
	 * 下一步按钮
	 */
	@RequestMapping(value="/s001004", params="mobile", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@Validated S001004Form form, BindingResult result, 
			S001004E001Input input, Model model) {

		HttpSession session = request.getSession();
		session.setAttribute("mobile", input.getMobile());
		session.getAttribute("mobile");
		
		System.out.println("验证手机号存在与否");
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
		
		return "s001005";
	}
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
