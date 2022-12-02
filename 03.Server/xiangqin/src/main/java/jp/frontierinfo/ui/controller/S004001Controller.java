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
import jp.frontierinfo.ui.form.S004001Form;
import jp.frontierinfo.ui.input.S004001E001Input;
import jp.frontierinfo.ui.input.S004001E002Input;
import jp.frontierinfo.ui.input.S004001E003Input;
import jp.frontierinfo.ui.output.S004001E001Output;
import jp.frontierinfo.ui.output.S004001E002Output;
import jp.frontierinfo.ui.output.S004001E003Output;
import jp.frontierinfo.ui.service.S004001E001Service;
import jp.frontierinfo.ui.service.S004001E002Service;
import jp.frontierinfo.ui.service.S004001E003Service;

@Controller
@RequestMapping("/ui")  
@SessionAttributes(value="s004001Form") 
public class S004001Controller {
	
	@Autowired
	private S004001E001Service s004001E001Service;
	
	@Autowired
	private S004001E002Service s004001E002Service;
	
	@Autowired
	private S004001E003Service s004001E003Service;
	
	@ModelAttribute("s004001Form")
	public S004001Form getS004001Form() {
		return new S004001Form();
	}
	
	
	
	/**
	 * 向我打过招呼的人按钮
	 */
	@RequestMapping(value="/s004001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("s004001Form") S004001Form form, BindingResult result,
			S004001E001Input input, Model model) {
		System.out.println("向我打过招呼的人");
		S004001E001Output output = new S004001E001Output();
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		try {
			output = s004001E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s004001Form", form);

		return "s004001";
	}
	
	/**
	 * 向我打过招呼的人详细信息
	 */
	@PrintLog("向我打过招呼的人详细信息")
	@RequestMapping(value="/s004001/e002", method= {RequestMethod.GET})
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s004001Form") S004001Form form, BindingResult result, 
			S004001E002Input input, Model model) {
		
		S004001E002Output output = new S004001E002Output();
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		try {
			output = s004001E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s004001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s004001Form", form);

		return "s004002";
	}
	
	/**
	 * 同意交换个人照片操作
	 */
	@PrintLog("同意交换个人照片操作")
	@RequestMapping(value="/s004001/e003", params="relationLevel1Agree",  method= {RequestMethod.POST})
	public String e003RelationLevel1Agree(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s004001Form") S004001Form form, BindingResult result, 
			S004001E003Input input, Model model) {
		
		S004001E003Output output = new S004001E003Output();

        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		input.setRelationLevel1("同意");
		try {
			output = s004001E003Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s004001";
		}
		model.addAttribute("message", "操作成功");

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s004001Form", form);
		
		return "s004002";
	}
	
	/**
	 * 同意交换联系方式操作
	 */
	@PrintLog("同意交换联系方式操作")
	@RequestMapping(value="/s004001/e003", params="relationLevel2Agree",  method= {RequestMethod.POST})
	public String e003RelationLevel2Agree(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s004001Form") S004001Form form, BindingResult result, 
			S004001E003Input input, Model model) {
		
		S004001E003Output output = new S004001E003Output();
		
		T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
		input.setUid(userLoginInfo.getUid());
		input.setRelationLevel2("同意");
		try {
			output = s004001E003Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
			return "s004001";
		}
		model.addAttribute("message", "操作成功");
		
		BeanUtils.copyProperties(output, form);
		model.addAttribute("s004001Form", form);
		
		return "s004002";
	}
	
	/**
	 * 拒绝操作
	 */
	@PrintLog("拒绝操作")
	@RequestMapping(value="/s004001/e003", params="reject",  method= {RequestMethod.POST})
	public String e003Reject(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s004001Form") S004001Form form, BindingResult result, 
			S004001E003Input input, Model model) {
		
		S004001E003Output output = new S004001E003Output();

        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
		// 拒绝时交友阶段1和2都更新为拒绝
        input.setUid(userLoginInfo.getUid());
		input.setRelationLevel1("拒绝");
		input.setRelationLevel2("拒绝");
		try {
			output = s004001E003Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s004001";
		}
		model.addAttribute("message", "操作成功");

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s004001Form", form);
		
		return "s004002";
	}
}