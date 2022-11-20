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
import jp.frontierinfo.ui.form.S003001Form;

@Controller
@RequestMapping("/ui")  
public class S003001Controller {
	
//	@Autowired
//	private S003001E001Service s003001E001Service;

	/**
	 * 我打过招呼的人按钮
	 */
	@RequestMapping(value="/s003001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response,
			S003001Form form, BindingResult result) {
		System.out.println("用户信息设定");
//		S003001E001Output output = new S003001E001Output();
//		try {
//			output = s002001E001Service.execute(input);
//		} catch (BusinessException e) {
//			model.addAttribute("message", e.getMessage());
//        	return "s001001";
//		}
//
//		BeanUtils.copyProperties(output, form);
//		model.addAttribute("s002002Form", form);

		return "s003001";
	}
}