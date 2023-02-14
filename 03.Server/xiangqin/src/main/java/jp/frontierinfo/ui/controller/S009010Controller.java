package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S009010Form;
import jp.frontierinfo.ui.input.S009010E000Input;
import jp.frontierinfo.ui.input.S009010E001Input;
import jp.frontierinfo.ui.input.S009010E002Input;
import jp.frontierinfo.ui.output.S009010E000Output;
import jp.frontierinfo.ui.output.S009010E001Output;
import jp.frontierinfo.ui.output.S009010E002Output;
import jp.frontierinfo.ui.service.S009010E000Service;
import jp.frontierinfo.ui.service.S009010E001Service;
import jp.frontierinfo.ui.service.S009010E002Service;

@Controller
@RequestMapping("/ui") 
@SessionAttributes(value="s009010Form") 
public class S009010Controller {
	
	@Autowired
	private S009010E000Service s009010E000Service;
	
	@Autowired
	private S009010E001Service s009010E001Service;
	
	@Autowired
	private S009010E002Service s009010E002Service;
	
	@ModelAttribute("s009010Form")
	public S009010Form getS009010Form() {
		return new S009010Form();
	}

	/**
	 * 画面初期表示
	 */
	@PrintLog("ユーザー管理(一般)画面初期表示")
	@RequestMapping(value="/s009010/e000", method= {RequestMethod.POST,RequestMethod.GET})
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s009010Form") S009010Form form, BindingResult result, 
			S009010E000Input input, Model model) {
		
		S009010E000Output output = new S009010E000Output();
		try {
			output = s009010E000Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009010";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009010Form", form);

		return "s009010";

	}
	/**
	 * ユーザー情報検索
	 */
	@PrintLog("ユーザー管理(一般)画面のユーザー情報検索")
	@RequestMapping(value="/s009010", params="search", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s009010Form") S009010Form form, BindingResult result, 
			S009010E001Input input, Model model) {
		S009010E001Output output = new S009010E001Output();
		try {
			output = s009010E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009010";
		}
		
		if(output.getUserFullInfoLi().size() == 0) {
			model.addAttribute("message", "条件に合うユーザー情報がありません。検索条件を変更してください。");
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009010Form", form);

		return "s009010";
	}
	/**
	 * ユーザー情報詳細
	 */
	@PrintLog("ユーザー管理(一般)画面のユーザー情報詳細")
	@RequestMapping(value="/s009010/e002", method=RequestMethod.GET)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S009010Form form, BindingResult result, 
			S009010E002Input input, Model model) {
		S009010E002Output output = new S009010E002Output();
		try {
			output = s009010E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009010";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009010Form", form);

		return "s009011";
	}
	
}
