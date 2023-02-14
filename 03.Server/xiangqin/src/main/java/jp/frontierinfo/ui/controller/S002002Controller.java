package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.druid.util.StringUtils;

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
@SessionAttributes(value="s002002Form") 
public class S002002Controller extends AbstractController {
	
	@Autowired
	private S002002E001Service s002002E001Service;
	
	/**
	 * ユーザー情報設定画面の登録ボタンクリック
	 */
	@PrintLog("ユーザー情報設定画面の登録ボタンクリック")
	@RequestMapping(value="/s002002", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s002002Form") S002002Form form, BindingResult formResult, 
			@Validated S002002E001Input input, BindingResult inputResult, 
			Model model) {
		
        if(inputResult.hasErrors()) {
        	errorCopy(formResult, inputResult);
        	return "s002002";
        }
        if(inputcheck(form, input, model)) {
        	return "s002002";
        }
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
        input.setRealpath(ConstantInfo.FILE_SAVE_PATH + ConstantInfo.FILE_SAVE_UID_PATH +userLoginInfo.getUid());
        input.setFileSavePath(ConstantInfo.FILE_STATIC_PATH + ConstantInfo.FILE_SAVE_UID_PATH +userLoginInfo.getUid());
		try {
			s002002E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002002";
		}
		// ユーザーが初めて基本情報設定する時、審査結果を提示
		if(ConstantInfo.USER_CENSOR_STATUS_00.equals(userLoginInfo.getUserStatusCode())) {
			model.addAttribute("message", "ユーザー情報設定成功、審査結果を後で確認してください。");
			return "s002001";
		}
		model.addAttribute("message", "ユーザー情報が正常に設定されました");
		
		return "forward:/ui/s002001/e000";
	}
	
	private boolean inputcheck(S002002Form form, S002002E001Input input, Model model) {
		if(StringUtils.isEmpty(form.getAvatarImg()) && input.getAvatarImgFile().isEmpty()) {
			model.addAttribute("message", "プロフィール写真を選択してください");
			return true;
		}
		if(input.getAvatarImgFile().getSize() > ConstantInfo.AVATAR_IMG_SIZE) {
			model.addAttribute("message", "プロフィール写真サイズは 100KB を超えることはできません");
			return true;
		}
		if(StringUtils.isEmpty(form.getUimages1()) && input.getUimages1File().isEmpty()) {
			model.addAttribute("message", "写真1を選択してください");
			return true;
		}
		if(input.getUimages1File().getSize() > ConstantInfo.USER_IMG_SIZE) {
			model.addAttribute("message", "写真1のサイズは3MBを超えることはできません");
			return true;
		}
		if(StringUtils.isEmpty(form.getUimages2()) && input.getUimages2File().isEmpty()) {
			model.addAttribute("message", "写真2を選択してください");
			return true;
		}
		if(input.getUimages2File().getSize() > ConstantInfo.USER_IMG_SIZE) {
			model.addAttribute("message", "写真2のサイズは3MBを超えることはできません");
			return true;
		}
		if(StringUtils.isEmpty(form.getUimages3()) && input.getUimages3File().isEmpty()) {
			model.addAttribute("message", "写真3を選択してください");
			return true;
		}
		if(input.getUimages3File().getSize() > ConstantInfo.USER_IMG_SIZE) {
			model.addAttribute("message", "写真3のサイズは3MBを超えることはできません");
			return true;
		}
		if(StringUtils.isEmpty(form.getIdentificationImg()) && input.getIdentificationImgFile().isEmpty()) {
			model.addAttribute("message", "身分証明書の写真を選択してください");
			return true;
		}
		if(input.getIdentificationImgFile().getSize() > ConstantInfo.USER_IMG_SIZE) {
			model.addAttribute("message", "認証写真のサイズは3MBを超えることはできません");
			return true;
		}
		return false;
	}
}
