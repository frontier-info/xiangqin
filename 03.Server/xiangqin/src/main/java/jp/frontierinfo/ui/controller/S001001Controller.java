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
import org.springframework.web.bind.annotation.RequestParam;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.common.exception.BusinessException;
import jp.frontierinfo.db.entity.T01UserLoginInfo;
import jp.frontierinfo.ui.form.S001001Form;
import jp.frontierinfo.ui.form.S001002Form;
import jp.frontierinfo.ui.form.S001003Form;
import jp.frontierinfo.ui.input.S001001E001Input;
import jp.frontierinfo.ui.input.S001001E002Input;
import jp.frontierinfo.ui.output.S001001E001Output;
import jp.frontierinfo.ui.service.S001001E001Service;
import jp.frontierinfo.ui.service.S001001E002Service;

@Controller
@RequestMapping("/ui")  
public class S001001Controller extends AbstractController {
	
	@Autowired
	private S001001E001Service s001001E001Service;
	
	@Autowired
	private S001001E002Service s001001E002Service;
	
	/**
	 * ログイン画面
	 */
	@PrintLog("ログイン画面初期表示")
	@RequestMapping(value="/s001001", method=RequestMethod.GET)
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, Model model) {
		return "s001001";
	}
	
	/**
	 * ログインボタン「メイルアドレス」
	 */
	@PrintLog("メイルログイン画面のログインボタンクリック")
	@RequestMapping(value="/s001001", params="emaillogin", method=RequestMethod.POST)
	public String e001( HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, BindingResult formResult, 
			@Validated S001001E001Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s001001";
        } 
        
		S001001E001Output output = new S001001E001Output();
		
		try {
			output = s001001E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}
        
        T01UserLoginInfo userLoginInfo = output.getUserLoginInfo();
		request.getSession().setAttribute(ConstantInfo.USER_LOGIN_INFO, userLoginInfo);
		
		// ログイン後ユーザーレベルをチェック
		if("08".equals(userLoginInfo.getUserRankCode())) {
			// 08:一般管理員->ユーザー管理(一般)画面に遷移
			return "forward:/ui/s009010/e000";
		} else if("09".equals(userLoginInfo.getUserRankCode())) {
			// 09:上級管理員->ユーザー管理(上級)画面に遷移
			return "forward:/ui/s009020/e000";
		} else {
			// 01,02:ユーザー->ユーザー画面に遷移
			return "forward:/ui/s002001/e000";
		}
	}
	
	
	/**
	 * ログインボタン「電話番号」
	 */
	@PrintLog("電話番号ログイン画面のログインボタンクリック")
	@RequestMapping(value="/s001001", params="mobilelogin", method=RequestMethod.POST)
	public String e002( HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, BindingResult formResult, 
			@Validated S001001E002Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	System.out.println("Hello What problem2");
        	errorCopy(formResult, inputResult);
        	return "s001001";
        } 
        
		S001001E001Output output = new S001001E001Output();
		
		try {
			output = s001001E002Service.execute(input);
			System.out.println("Hello Are you Here?");
			System.out.println(output);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}
        
        T01UserLoginInfo userLoginInfo = output.getUserLoginInfo();
		request.getSession().setAttribute(ConstantInfo.USER_LOGIN_INFO, userLoginInfo);
		
		// ログイン後ユーザーレベルをチェック
		if("08".equals(userLoginInfo.getUserRankCode())) {
			// 08:一般管理員->ユーザー管理(一般)画面に遷移
			return "forward:/ui/s009010/e000";
		} else if("09".equals(userLoginInfo.getUserRankCode())) {
			// 09:上級管理員->ユーザー管理(上級)画面に遷移
			return "forward:/ui/s009020/e000";
		} else {
			// 01,02:ユーザー->ユーザー画面に遷移
			return "forward:/ui/s002001/e000";
		}
	}
	
	
	/**
	 * サインアップボタン
	 */
	@PrintLog("ログイン画面のサインアップボタンクリック")
	@RequestMapping(value="/s001001", params="register", method=RequestMethod.POST)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001002Form form, Model model) {
		
		return "s001002";
	}
	
	/**
	 * パスワード変更ボタン
	 */
	@PrintLog("ログイン画面のパスワード変更ボタンクリック")
	@RequestMapping(value="/s001001", params="repassword", method=RequestMethod.POST)
	public String e004(HttpServletRequest request, HttpServletResponse response, 
			S001003Form form, Model model) {
		
		return "s001003";
	}
}
