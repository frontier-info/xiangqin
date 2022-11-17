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

import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.ui.form.S009020Form;
import jp.frontierinfo.ui.input.S009020E000Input;
import jp.frontierinfo.ui.input.S009020E001Input;
import jp.frontierinfo.ui.input.S009020E002Input;
import jp.frontierinfo.ui.input.S009020E003Input;
import jp.frontierinfo.ui.output.S009020E000Output;
import jp.frontierinfo.ui.output.S009020E001Output;
import jp.frontierinfo.ui.output.S009020E002Output;
import jp.frontierinfo.ui.output.S009020E003Output;
import jp.frontierinfo.ui.service.S009020E000Service;
import jp.frontierinfo.ui.service.S009020E001Service;
import jp.frontierinfo.ui.service.S009020E002Service;
import jp.frontierinfo.ui.service.S009020E003Service;

@Controller
@RequestMapping("/ui")
@SessionAttributes(value="s009020Form")
public class S009020Controller {
	
	@Autowired
	private S009020E000Service s009020E000Service;
	
	@Autowired
	private S009020E001Service s009020E001Service;
	
	@Autowired
	private S009020E002Service s009020E002Service;
	
	@Autowired
	private S009020E003Service s009020E003Service;
	
	@ModelAttribute("s009020Form")
	public S009020Form getS009020Form() {
		return new S009020Form();
	}

	/**
	 * 页面初期表示
	 */
	@RequestMapping(value="/s009020/e000", method= {RequestMethod.POST,RequestMethod.GET})
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s009020Form") S009020Form s009020Form, BindingResult result, 
			S009020E000Input input, Model model) {
		
		System.out.println("后台管理(高级)页面初期表示");
		S009020E000Output output = new S009020E000Output();
		try {
			output = s009020E000Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009020";
		}

		BeanUtils.copyProperties(output, s009020Form);
		model.addAttribute("s009020Form", s009020Form);

		return "s009020";

	}
	/**
	 * 用户信息检索
	 */
	@RequestMapping(value="/s009020", params="search", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s009020Form") S009020Form s009020Form, BindingResult result, 
			S009020E001Input input, Model model) {
		System.out.println("用户信息检索");
		S009020E001Output output = new S009020E001Output();
		try {
			output = s009020E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009020";
		}
		
		if(output.getUserFullInfoLi().size() == 0) {
			model.addAttribute("message", "没有符合条件的用户信息,请调整检索条件");
		}

		BeanUtils.copyProperties(output, s009020Form);
		model.addAttribute("s009020Form", s009020Form);

		return "s009020";
	}
	/**
	 * 用户信息详细
	 */
	@RequestMapping(value="/s009020/e002", method=RequestMethod.GET)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E002Input input, Model model) {
		System.out.println("用户信息详细");
		S009020E002Output output = new S009020E002Output();
		try {
			output = s009020E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009020";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009020Form", form);

		return "s009021";
	}
	/**
	 * 后台添加用户
	 */
	@RequestMapping(value="/s009020", params="addUser", method=RequestMethod.POST)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E003Input input, Model model) {
		System.out.println("后台添加用户");
		S009020E003Output output = new S009020E003Output();
		try {
			output = s009020E003Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009020";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009020Form", form);
		
		model.addAttribute("message", "用户添加成功.用户ID:"+output.getUid());

		return "s009020";
	}
	
}
