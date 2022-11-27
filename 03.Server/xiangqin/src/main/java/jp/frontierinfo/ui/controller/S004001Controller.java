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
public class S004001Controller {
	/**
	 * 向我打过招呼的人按钮
	 */
	@RequestMapping(value="/s004001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response,
			S003001Form form, BindingResult result) {
		System.out.println("用户信息设定");

		return "s004001";
	}
}