package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.form.S002002Form;
import jp.frontierinfo.ui.form.S002003Form;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.input.S002001E001Input;
import jp.frontierinfo.ui.input.S002001E002Input;
import jp.frontierinfo.ui.output.S002001E001Output;
import jp.frontierinfo.ui.output.S002001E002Output;
import jp.frontierinfo.ui.service.S002001E001Service;
import jp.frontierinfo.ui.service.S002001E002Service;

@Controller
@RequestMapping("/ui")  
public class S002001Controller {
	
	@Autowired
	private S002001E001Service s002001E001Service;
	
	@Autowired
	private S002001E002Service s002001E002Service;
	
//	@Autowired
//	private MessageSource messageSource;
	
	/**
	 * 首页按钮
	 */
	@RequestMapping(value="/s002001", method=RequestMethod.GET)
	public String e010(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		System.out.println("首页按钮");
		return "s002001";
	}

	/**
	 * 登录后跳转用户主页
	 */
	@RequestMapping(value="/s002001/e000", method=RequestMethod.POST)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			S002002Form form, BindingResult result, 
			S002001E001Input input, Model model) {

	return "s002001";
	}
	/**
	 * 用户信息设定按钮
	 */
	@RequestMapping(value="/s002001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S002002Form form, BindingResult result, 
			S002001E001Input input, Model model) {
		System.out.println("用户信息设定");
		S002001E001Output output = new S002001E001Output();
		try {
			output = s002001E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s002002Form", form);

		return "s002002";
	}
	
	/**
	 * 检索条件设定按钮
	 */
	@RequestMapping(value="/s002001/e002", method=RequestMethod.GET)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S002003Form form, S002001E002Input input, Model model) {
		System.out.println("检索条件设定");
		S002001E002Output output = new S002001E002Output();
		try {
			output = s002001E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s002003Form", form);
		
		return "s002003";
	}
	
	/**
	 * 退出登录按钮
	 */
	@RequestMapping(value="/s002001/e003", method=RequestMethod.GET)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		System.out.println("退出登录");
		
		return "s001001";
	}
}
