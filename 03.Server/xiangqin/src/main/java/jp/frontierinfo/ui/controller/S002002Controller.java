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

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S002002Form;
import jp.frontierinfo.ui.input.S002002E001Input;
import jp.frontierinfo.ui.service.S002002E001Service;

@Controller
@RequestMapping("/ui")
public class S002002Controller extends AbstractController {
	
	@Autowired
	private S002002E001Service s002002E001Service;
	
	/**
	 * 用户信息设定页面的提交按钮点击
	 */
	@PrintLog("用户信息设定页面的提交按钮点击")
	@RequestMapping(value="/s002002", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S002002Form form, BindingResult formResult, 
			@Validated S002002E001Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s002002";
        } 
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
        input.setRealpath(request.getServletContext().getRealPath(ConstantInfo.FILE_SAVE_PATH + userLoginInfo.getUid()));
        input.setFileSavePath(ConstantInfo.FILE_SAVE_PATH);
		try {
			s002002E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002002";
		}
		model.addAttribute("message", "用户信息设定成功");
		
		return "s002001";
	}
	
}
