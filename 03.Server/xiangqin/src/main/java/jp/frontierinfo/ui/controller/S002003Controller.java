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
import jp.frontierinfo.ui.form.S002003Form;
import jp.frontierinfo.ui.input.S002003E001Input;
import jp.frontierinfo.ui.output.S002003E001Output;
import jp.frontierinfo.ui.service.S002003E001Service;
@Controller
@RequestMapping("/ui") 
public class S002003Controller {

	@Autowired
	private S002003E001Service s002003E001Service;

	@Autowired
	private MessageSource messageSource;
	
	/**
	 * 信息检索首页
	 */
	@RequestMapping(value="/s002003", method=RequestMethod.POST)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		System.out.println("检索信息保存");
		return "s002003";
	}
	
	/**
	 * 保存搜索条件
	 */
	@RequestMapping(value="/s002003", params="saveSearchCondition", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@Validated S002003Form form, BindingResult result, 
			S002003E001Input input, Model model) {
		System.out.println("保存搜索条件");
        if(result.hasErrors()) {
        	return "s002003";
        }
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute("userLoginInfo");
        input.setUid(userLoginInfo.getUid());
		S002003E001Output output = new S002003E001Output();
		try {
			output = s002003E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002003";
		}
		return "s002001";
	}
	
	
	/**
	 *重新检索按钮
	 */
	//@RequestMapping(value="/s002003", params="null", method=RequestMethod.POST)
	//public String e003(HttpServletRequest request, HttpServletResponse response, 
//			S002003Form form, S002003E001Input input) {
//		System.out.println("重新检索");
//		
//		return "s002003";
//	}
}
