package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.form.S001002Form;
import jp.frontierinfo.ui.input.S001002E001Input;
import jp.frontierinfo.ui.input.S001002E002Input;
import jp.frontierinfo.ui.output.S001002E001Output;
import jp.frontierinfo.ui.output.S001002E002Output;
import jp.frontierinfo.ui.service.S001002E001Service;
//import jp.frontierinfo.ui.output.S001001E001Output;
//import jp.frontierinfo.ui.service.S001001E001Service;
import jp.frontierinfo.ui.service.S001002E002Service;

@Controller
@RequestMapping("/ui")  
public class S001002Controller extends AbstractController {
	
	@Autowired
	private S001002E001Service s001002E001Service;
	
	@Autowired
	private S001002E002Service s001002E002Service;
	
	/**
	 * 認証コードを送信ボタン
	 */
	@PrintLog("サインアップ画面の認証コードを送信ボタンクリック")
	@RequestMapping(value="/s001002", params="getVerificationCode",method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S001002Form form, BindingResult formResult, 
			@Validated S001002E001Input input, BindingResult inputResult,
			Model model) {
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001002";
        } 
		S001002E001Output output = new S001002E001Output();
		try {
			output = s001002E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001002";
		}
		
		// メールアドレスと認証コードをsessionに保持
		HttpSession session = request.getSession();
		model.addAttribute("message", "测试用："+output.getVerificationCode());
		session.setAttribute(ConstantInfo.REGISTER_SMS_CODE, output.getVerificationCode());
		session.setAttribute(ConstantInfo.REGISTER_EMAIL, input.getEmail());
//		model.addAttribute("message", "認証コードが送信されました、認証コードを入力してください");

		return "s001002";
	}
	
	/**
	 * サインアップボタン
	 */
	@PrintLog("サインアップ画面のサインアップボタンクリック")
	@RequestMapping(value="/s001002", params="register", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S001002Form form, BindingResult formResult, 
			@Validated S001002E002Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001002";
        } 	
		
		HttpSession session = request.getSession();

		if(!input.getEmail().equals(session.getAttribute(ConstantInfo.REGISTER_EMAIL).toString())) {
			model.addAttribute("message", "前後に入力されたメールアドレスが間違っています、確認してください");
			return "s001002";
		}

		if(!input.getSmsCode().equals(session.getAttribute(ConstantInfo.REGISTER_SMS_CODE).toString())) {
			model.addAttribute("message", "認証コードが一致しません、再度入力してください");
			return "s001002";
		}
		
		if(!input.getPassword().equals(input.getRepassword())) {
			model.addAttribute("message", "入力された２つのパスワードが一致しません。確認してください");
			return "s001002";
		}

		S001002E002Output output = new S001002E002Output();
		try {
			output = s001002E002Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001002";
		}
		model.addAttribute("message", "サインアップされました、ログインしてください");
		model.addAttribute("s001001Form", new S001001Form());
		return "s001001";
	}
}
