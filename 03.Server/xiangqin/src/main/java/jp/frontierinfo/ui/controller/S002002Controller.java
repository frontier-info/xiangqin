package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.common.utils.FileUtils;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S002002Form;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.input.S002002E001Input;
import jp.frontierinfo.ui.output.S002002E001Output;
import jp.frontierinfo.ui.service.S002002E001Service;

@Controller
@RequestMapping("/ui")
public class S002002Controller {
	
	@Autowired
	private S002002E001Service s002002E001Service;
	
	/**
	 * 跳转到确认页面
	 */
	@PrintLog("用户信息设定页面的提交按钮点击")
	@RequestMapping(value="/s002002", params="b", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S002002Form form, S001001E001Input input) {
		FileUtils.upfilesToSession(form.getUimages(), request);
		
		return "s0020021";
	}
	
	/**
	 * 确认页面的提交按钮
	 */
	@PrintLog("用户信息设定页面的确认提交按钮点击")
	@RequestMapping(value="/s002002", params="d", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			@Validated S002002Form form, BindingResult result, 
			S002002E001Input input, Model model) {
        if(result.hasErrors()) {
        	return "s002002";
        } 
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		S002002E001Output output = new S002002E001Output();
		try {
			input.setUimages(FileUtils.upfiles(request));
			output = s002002E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002002";
		}
		return "s002001";
	}
	
}
