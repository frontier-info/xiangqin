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
//import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001006Form;
import jp.frontierinfo.ui.input.S001006E001Input;
import jp.frontierinfo.ui.output.S001006E001Output;
import jp.frontierinfo.ui.service.S001006E001Service;

@Controller
@RequestMapping("/ui")  
public class S001006Controller {
	
	
	@Autowired
	private S001006E001Service s001006E001Service;
	/**
	 * 重置密码按钮
	 */
	@RequestMapping(value="/s001006", params="repassword", method=RequestMethod.POST)
	public String e001(HttpServletRequest request,HttpServletResponse response,
			@Validated S001006Form form,Model model,S001006E001Input input) {
		
		
		HttpSession session = request.getSession();
		String mobile =session.getAttribute("mobile").toString();
		input.setMobile(mobile);
		
		S001006E001Output output = new S001006E001Output();
	
		System.out.println("重置密码进行中");
		
		try {
			output = s001006E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001006";
		}
		model.addAttribute("message", "密码设置成功，请重新登录");
		return "s001007";
	}
	
	
}
