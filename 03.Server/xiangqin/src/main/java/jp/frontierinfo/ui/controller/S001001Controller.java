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
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.form.S001004Form;
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
	 * 登录页面
	 */
	@RequestMapping(value="/s001001", method=RequestMethod.GET)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		System.out.println("网站首页");
		S001001Form from = new S001001Form();
		from.setMobile("123");
		from.setPassword("123");
		model.addAttribute("s001001Form", from);
		return "s001001";
	}
	
	/**
	 * 网站首页
	 */
	@RequestMapping(value="/s002001", method=RequestMethod.GET)
	public String e010(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		System.out.println("网站首页");
		return "s002001";
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

        T01UserLoginInfo userLoginInfo = output.getUserLoginInfo();
		request.getSession().setAttribute("userLoginInfo", userLoginInfo);
		
		// 登录后检查用户级别
		if("08".equals(userLoginInfo.getUserRankCode())) {
			// 08:普通管理员->跳转后台管理(普通)页面
			return "forward:/ui/s009010/e000";
		} else if("09".equals(userLoginInfo.getUserRankCode())) {
			// 09:普通管理员->跳转后台管理(高级)页面
			return "forward:/ui/s009020/e000";
		} else {
			// 01,02:用户->跳转后台管理(普通)页面
			// 普通用户检查用户状态,若未提交审核,则提示用户填写个人信息并提交审核
			// 若审核中时,提示用户个人信息正在审核,请等候审核结束后方可使用
			// 若审核通过时,检索条件设定按钮显示未活性
			// 若审核失败时,提示用户审核失败理由
			return "forward:/ui/s002001/e000";
		}
		
		
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
			S001001Form form, S001001E001Input input, Model model) {
		System.out.println("忘记密码");
		
		model.addAttribute("s001004Form", new S001004Form());
		
		return "s001004";
	}
}
