package jp.frontierinfo.ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import jp.frontierinfo.ui.form.S002003Form;
import jp.frontierinfo.ui.input.S002003E001Input;
import jp.frontierinfo.ui.output.S002003E001Output;
import jp.frontierinfo.ui.service.S002003E001Service;
@Controller
@RequestMapping("/ui") 
@SessionAttributes(value="s002003Form") 
public class S002003Controller extends AbstractController {

	@Autowired
	private S002003E001Service s002003E001Service;
	
	/**
	 * 検索条件を保存
	 */
	@PrintLog("ユーザー検索条件設定画面の検索条件保存ボタンクリック")
	@RequestMapping(value="/s002003", params="saveSearchCondition", method=RequestMethod.POST)
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s002003Form") S002003Form form, 
			S002003E001Input input, 
			Model model) {
		
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
        
        // ユーザーが設定された検索条件の数
        int count = normalUserSearchCheck(input);
        
        // 検索条件が未設定時の画面メッセージ
        if(count == 0) {
			model.addAttribute("message", "検索条件を追加してください。");
        	return "s002003";
        }

        // 一般ユーザーの検索条件設定件数チェック
		if(ConstantInfo.USER_RANK_NORMAL.equals(userLoginInfo.getUserRankCode()) && 
				count > 1) {
			model.addAttribute("message", "一般ユーザーは、検索条件を 1 つしか設定できません。");
        	return "s002003";
		}
		S002003E001Output output = new S002003E001Output();
		try {
			output = s002003E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002003";
		}
		model.addAttribute("message", "ユーザー検索条件が設定されました。");
		return "forward:/ui/s002001/e000";
	}
	
	private int normalUserSearchCheck(S002003E001Input input) {
		// 条件設定数
		int count = 0;
		if(input.getAgeFrom() != null || input.getAgeTo() != null) {
			count++;
		}
		if(!StringUtils.isEmpty(input.getBirthPlace())) {
			count++;
		}
		if(!StringUtils.isEmpty(input.getAddress())) {
			count++;
		}
		if(!StringUtils.isEmpty(input.getProfession())) {
			count++;
		}
		if(input.getUheightFrom() != null || input.getUheightTo() != null) {
			count++;
		}
		if(input.getUweightFrom() != null || input.getUweightTo() != null) {
			count++;
		}
		return count;
	}
}
