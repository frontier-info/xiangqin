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
import jp.frontierinfo.ui.form.S001003Form;
import jp.frontierinfo.ui.input.S001003E001Input;
import jp.frontierinfo.ui.input.S001003E002Input;
import jp.frontierinfo.ui.output.S001003E001Output;
import jp.frontierinfo.ui.service.S001003E001Service;
import jp.frontierinfo.ui.service.S001003E002Service;

@Controller
@RequestMapping("/ui")  
public class S001003Controller extends AbstractController {
	
	@Autowired
	private S001003E001Service s001003E001Service;
	
	@Autowired
	private S001003E002Service s001003E002Service;
	
	/**
	 * 認証コードを送信ボタン
	 */
	@PrintLog("パスワード変更画面の認証コードを送信ボタンクリック")
	@RequestMapping(value="/s001003", params="getVerificationCode", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			S001003Form form, BindingResult formResult, 
			@Validated S001003E001Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001003";
        } 
		S001003E001Output output = new S001003E001Output();
		try {
			output = s001003E001Service.execute(input);
			
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001003";
		}
		
		// メールアドレスと認証コードをsessionに保持
		HttpSession session = request.getSession();
		session.setAttribute(ConstantInfo.REGISTER_SMS_CODE, output.getVerificationCode());
		session.setAttribute(ConstantInfo.REGISTER_EMAIL, input.getEmail());
		
		model.addAttribute("message", "認証コードが送信されました、認証コードを入力してください"); 
		
		return "s001003";
	}

	/**
	 * パスワード変更ボタン
	 */
	@PrintLog("パスワード変更画面のパスワード変更ボタンクリック")
	@RequestMapping(value="/s001003", params="changePassword", method=RequestMethod.POST)
	public String e002(HttpServletRequest request, HttpServletResponse response, 
			S001003Form form, BindingResult formResult, 
			@Validated S001003E002Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001003";
        } 	
		
		HttpSession session = request.getSession();

		if(!input.getEmail().equals(session.getAttribute(ConstantInfo.REGISTER_EMAIL).toString())) {
			model.addAttribute("message", "前後に入力されたメールアドレスが間違っています、確認してください");
			return "s001003";
		}

		if(!input.getSmsCode().equals(session.getAttribute(ConstantInfo.REGISTER_SMS_CODE).toString())) {
			model.addAttribute("message", "認証コードが一致しません、再度入力してください");
			return "s001003";
		}
		
		if(!input.getPassword().equals(input.getRepassword())) {
			model.addAttribute("message", "入力された２つのパスワードが一致しません。確認してください");
			return "s001003";
		}
		
		try {
			s001003E002Service.execute(input);
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		model.addAttribute("message", "パスワード変更されました、ログインしてください");
		model.addAttribute("s001001Form", new S001001Form());
		return "s001001";
	}
}
