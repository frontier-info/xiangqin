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
import jp.frontierinfo.ui.form.S009020Form;
import jp.frontierinfo.ui.input.S009020E000Input;
import jp.frontierinfo.ui.input.S009020E001Input;
import jp.frontierinfo.ui.input.S009020E002Input;
import jp.frontierinfo.ui.input.S009020E003Input;
import jp.frontierinfo.ui.input.S009020E004Input;
import jp.frontierinfo.ui.input.S009020E005Input;
import jp.frontierinfo.ui.input.S009020E006Input;
import jp.frontierinfo.ui.output.S009020E000Output;
import jp.frontierinfo.ui.output.S009020E001Output;
import jp.frontierinfo.ui.output.S009020E002Output;
import jp.frontierinfo.ui.output.S009020E003Output;
import jp.frontierinfo.ui.output.S009020E004Output;
import jp.frontierinfo.ui.output.S009020E005Output;
import jp.frontierinfo.ui.output.S009020E006Output;
import jp.frontierinfo.ui.service.S009020E000Service;
import jp.frontierinfo.ui.service.S009020E001Service;
import jp.frontierinfo.ui.service.S009020E002Service;
import jp.frontierinfo.ui.service.S009020E003Service;
import jp.frontierinfo.ui.service.S009020E004Service;
import jp.frontierinfo.ui.service.S009020E005Service;
import jp.frontierinfo.ui.service.S009020E006Service;

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
	
	@Autowired
	private S009020E004Service s009020E004Service;
	
	@Autowired
	private S009020E005Service s009020E005Service;
	
	@Autowired
	private S009020E006Service s009020E006Service;
	
	@ModelAttribute("s009020Form")
	public S009020Form getS009020Form() {
		return new S009020Form();
	}

	/**
	 * 页面初期表示
	 */
	@PrintLog("后台管理(高级)页面初期表示")
	@RequestMapping(value="/s009020/e000", method= {RequestMethod.POST,RequestMethod.GET})
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s009020Form") S009020Form s009020Form, BindingResult result, 
			S009020E000Input input, Model model) {
		
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
	@PrintLog("后台管理(高级)页面的用户信息检索")
	@RequestMapping(value="/s009020", params="search", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s009020Form") S009020Form s009020Form, BindingResult result, 
			S009020E001Input input, Model model) {
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
	@PrintLog("后台管理(高级)页面的用户信息详细")
	@RequestMapping(value="/s009020/e002", method=RequestMethod.GET)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E002Input input, Model model) {
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
	@PrintLog("后台管理(高级)页面的用户后台添加")
	@RequestMapping(value="/s009020", params="addUser", method=RequestMethod.POST)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E003Input input, Model model) {
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

	/**
	 * 变更用户权限
	 */
	@PrintLog("后台管理(高级)页面的用户用户权限变更")
	@RequestMapping(value="/s009021", params="changeUserRank", method=RequestMethod.POST)
	public String e004(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E004Input input, Model model) {
		S009020E004Output output = new S009020E004Output();
		try {
			output = s009020E004Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009021";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009020Form", form);
		
		model.addAttribute("message", "用户权限变更成功.用户ID:"+output.getUid());

		return "s009021";
	}

	/**
	 * 新用户审查结果
	 */
	@PrintLog("后台管理(高级)页面的用户审查结果更新")
	@RequestMapping(value="/s009021", params="updateUserStatus", method=RequestMethod.POST)
	public String e005(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E005Input input, Model model) {
		S009020E005Output output = new S009020E005Output();
		try {
			output = s009020E005Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009021";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009020Form", form);
		
		model.addAttribute("message", "用户审查结果更新成功.用户ID:"+output.getUid());

		return "s009021";
	}

	/**
	 * 删除用户
	 */
	@PrintLog("后台管理(高级)页面的用户删除")
	@RequestMapping(value="/s009021", params="deleteUser", method=RequestMethod.POST)
	public String e006(HttpServletRequest request, HttpServletResponse response, 
			S009020Form form, BindingResult result, 
			S009020E006Input input, Model model) {
		S009020E006Output output = new S009020E006Output();
		try {
			output = s009020E006Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s009021";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s009020Form", form);
		
		model.addAttribute("message", "用户删除成功.用户ID:"+output.getUid());

		return "s009021";
	}
	
}
