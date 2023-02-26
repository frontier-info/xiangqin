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
import jp.frontierinfo.ui.service.S001001E001Service;
import jp.frontierinfo.ui.service.S002001E001Service;
import jp.frontierinfo.ui.service.S002001E002Service;
import jp.frontierinfo.ui.service.S002001Service;

@Controller
@RequestMapping("/ui")  
@SessionAttributes(value= {"s002002Form", "s002003Form"}) 
public class S002001Controller {
	
	@Autowired
	private S001001E001Service s001001E001Service;
	
	@Autowired
	private S002001E001Service s002001E001Service;
	
	@Autowired
	private S002001Service s002001Service;
	
	@Autowired
	private S002001E002Service s002001E002Service;
	
	@ModelAttribute("s002002Form")
	public S002002Form getS002002Form() {
		return new S002002Form();
	}
	
	@ModelAttribute("s002003Form")
	public S002003Form getS002003Form() {
		return new S002003Form();
	}
	
	/**
	 * ホームページボタン
	 */
	@PrintLog("ホームページボタンクリック")
	@RequestMapping(value="/s002001", method=RequestMethod.GET)
	public String e010(HttpServletRequest request, HttpServletResponse response, 
			Model model) {

		// ユーザーログイン情報を取得
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        
        // ユーザー管理画面(一般)に遷移
        if(ConstantInfo.USER_RANK_NORMAL_MANAGER.equals(userLoginInfo.getUserRankCode())) {
        	return "forward:/ui/s009010/e000";
        }
        
        // ユーザー管理画面(上級)に遷移
        if(ConstantInfo.USER_RANK_HIGH_MANAGER.equals(userLoginInfo.getUserRankCode())) {
        	return "forward:/ui/s009020/e000";
        }
        
        // ユーザーホームページ画面に遷移
		return "forward:/ui/s002001/e000";
	}

	/**
	 * ユーザーホームページ画面
	 */
	@PrintLog("ユーザーホームページ画面")
	@RequestMapping(value="/s002001/e000", method= {RequestMethod.POST, RequestMethod.GET})
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			S002001Form form, BindingResult result, 
			S002001Input input, Model model) {

		// ユーザーログイン情報を取得
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
        
		// ユーザー状態チェック
        if(ConstantInfo.USER_CENSOR_STATUS_00.equals(userLoginInfo.getUserStatusCode())) {
			model.addAttribute("message", "基本情報を入力し、審査を待ってからご利用ください。");
			return "s002001";
        }
		// ユーザー状態チェック
        if(ConstantInfo.USER_CENSOR_STATUS_01.equals(userLoginInfo.getUserStatusCode())) {
        	model.addAttribute("message", "入力した基本情報は審査中です。後でログインして確認してください");
        	return "s002001";
        }
		// ユーザー状態チェック
        if(ConstantInfo.USER_CENSOR_STATUS_03.equals(userLoginInfo.getUserStatusCode())) {
        	model.addAttribute("message", "次の理由により、審査に失敗しました:"+userLoginInfo.getUserCensorResult());
        	return "s002001";
        }
        // 審査結果がOKの場合のみ、検索条件設定ボタンが活性になる
        
        // 検索条件に一致する異性情報を取得
		S002001Output output = new S002001Output();
		try {
			output = s002001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s001001";
		}
		
		// ユーザーの検索条件が未設定時、画面メッセージを出力
		if(output.getUserSimpleInfoLi() == null) {
			model.addAttribute("message", "検索条件を設定してから異性情報を表示する");
			return "s002001";
		}
		
		// 检索結果0件時
		if(output.getUserSimpleInfoLi().size() == 0) {
			model.addAttribute("message", "検索条件に一致する異性の情報がありません。検索条件を変更してください。");
			return "s002001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s002001Form", form);
		
	return "s002001";
	}
	/**
	 * ユーザー情報設定ボタン
	 */
	@PrintLog("ユーザー主页のユーザー情報設定ボタンクリック")
	@RequestMapping(value="/s002001/e001", method=RequestMethod.GET)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute() S002002Form form, BindingResult result, 
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
	 * 検索条件設定ボタン
	 */
	@PrintLog("ユーザー主页の検索条件設定ボタンクリック")
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
			// 一般ユーザーは画面上に下記メッセージを表示する
			model.addAttribute("message", "一般ユーザーは、検索条件を 1 つしか設定できません。");
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s002003Form", form);
		
		return "s002003";
	}
	
	/**
	 * ログアウトボタン
	 */
	@PrintLog("ユーザーホームページ画面のログアウトボタンクリック")
	@RequestMapping(value="/s002001/e003", method=RequestMethod.GET)
	public String e003(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input) {
		// ログアウト時セッションをクリア
		request.getSession().invalidate();
		
		return "s001001";
	}
	
	/**
	 * アカウント削除
	 */
	@PrintLog("ユーザーホームページ画面のアカウント削除")
	@RequestMapping(value="/s002001/e004", method=RequestMethod.GET)
	public String e004(HttpServletRequest request, HttpServletResponse response, 
			S001001Form form, S001001E001Input input  ) {
		
	     T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);


		// ログイン後ユーザーレベルをチェック
		if("02".equals(userLoginInfo.getUserRankCode()) || "09".equals(userLoginInfo.getUserRankCode())) {
		
			   try{
					int updRes = s001001E001Service.delete(userLoginInfo.getUid());
					
				} catch (BusinessException e) {
		        	return "s001001";
				}
		}
		else {
			return "s002001";
		}


		return "s001001";
		
	}
	

	
}
