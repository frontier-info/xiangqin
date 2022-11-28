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
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.form.S002001Form;
import jp.frontierinfo.ui.form.S002002Form;
import jp.frontierinfo.ui.form.S002003Form;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.input.S002001E001Input;
import jp.frontierinfo.ui.input.S002001E002Input;
import jp.frontierinfo.ui.input.S002001Input;
import jp.frontierinfo.ui.output.S002001E001Output;
import jp.frontierinfo.ui.output.S002001E002Output;
import jp.frontierinfo.ui.output.S002001Output;
import jp.frontierinfo.ui.service.S002001E001Service;
import jp.frontierinfo.ui.service.S002001E002Service;
import jp.frontierinfo.ui.service.S002001Service;

@Controller
@RequestMapping("/ui")  
@SessionAttributes(value= {"s002003Form"}) 
public class S002001Controller {
	
	@Autowired
	private S002001E001Service s002001E001Service;
	
	@Autowired
	private S002001Service s002001Service;
	
	@Autowired
	private S002001E002Service s002001E002Service;
	
	@ModelAttribute("s002003Form")
	public S002003Form getS002003Form() {
		return new S002003Form();
	}
	
	/**
	 * 首页按钮
	 */
	@PrintLog("首页按钮点击")
	@RequestMapping(value="/s002001", method=RequestMethod.GET)
	public String e010(HttpServletRequest request, HttpServletResponse response, 
			Model model) {
		return "s002001";
	}

	/**
	 * 登录后跳转用户主页
	 */
	@PrintLog("登录后跳转用户主页")
	@RequestMapping(value="/s002001/e000", method=RequestMethod.POST)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			S002001Form form, BindingResult result, 
			S002001Input input, Model model) {

		//用户信息备选人员信息跳转
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
        
		S002001Output output = new S002001Output();
		try {
			output = s002001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}
		// 检索0件时
		if(output.getUserSimpleInfoLi().size() == 0) {
			model.addAttribute("message", "未查询到符合当前择偶条件的异性信息,请变更择偶条件.");
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s002001Form", form);
	
		
	return "s002001";
	}
	/**
	 * 用户信息设定按钮
	 */
	@PrintLog("用户主页的用户信息设定按钮点击")
	@RequestMapping(value="/s002001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S002002Form form, BindingResult result, 
			S002001E001Input input, Model model) {
		S002001E001Output output = new S002001E001Output();
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
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
	 * 择偶要求设定按钮
	 */
	@PrintLog("用户主页的择偶要求设定按钮点击")
	@RequestMapping(value="/s002001/e002", method=RequestMethod.GET)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute() S002003Form form, S002001E002Input input, Model model) {
		S002001E002Output output = new S002001E002Output();
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		try {
			output = s002001E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}
		
		if(ConstantInfo.USER_RANK_NORMAL.equals(userLoginInfo.getUserRankCode())) {
			// 普通用户在页面提示择偶条件一条的限制
			model.addAttribute("message", "普通用户只能设定一个择偶条件.");
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s002003Form", form);
		
		return "s002003";
	}
	
	/**
	 * 退出登录按钮
	 */
	@PrintLog("用户主页的退出登录按钮点击")
	@RequestMapping(value="/s002001/e003", method=RequestMethod.GET)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		
		return "s001001";
	}
	
	
	/**
	 * 向我打招呼的人按钮
	 */
	@RequestMapping(value="/s002001", params="d", method=RequestMethod.POST)
	public String e004(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input,Model model) {
		System.out.println("向我打招呼的人002001");
		//s004001Controller.e001(request, response,form, null, input, model);
		return "forward:/ui/s004001";
	}
}
