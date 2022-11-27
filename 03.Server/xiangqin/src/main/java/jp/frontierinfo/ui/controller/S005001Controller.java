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
import jp.frontierinfo.ui.form.S005001Form;
import jp.frontierinfo.ui.form.S009010Form;
import jp.frontierinfo.ui.input.S005001E000Input;
import jp.frontierinfo.ui.input.S005001E001Input;
import jp.frontierinfo.ui.output.S005001E000Output;
import jp.frontierinfo.ui.output.S005001E001Output;
import jp.frontierinfo.ui.service.S005001E000Service;
import jp.frontierinfo.ui.service.S005001E001Service;

@Controller
@RequestMapping("/ui") 
@SessionAttributes(value="s005001Form") 
public class S005001Controller {
	
	@Autowired
	private S005001E000Service s005001E000Service;
	
	@Autowired
	private S005001E001Service s005001E001Service;
	
	@ModelAttribute("s005001Form")
	public S005001Form getS005001Form() {
		return new S005001Form();
	}
	
	/**
	 * 页面初期表示
	 */
	@PrintLog("打招呼页面初期表示")
	@RequestMapping(value="/s005001/e000", method= {RequestMethod.GET})
	public String e000(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s005001Form") S005001Form form, BindingResult result, 
			S005001E000Input input, Model model) {
		
		S005001E000Output output = new S005001E000Output();
		try {
			output = s005001E000Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s002001";
		}

		BeanUtils.copyProperties(output, form);
		model.addAttribute("s005001Form", form);

		return "s005001";

	}
	
	/**
	 * 打招呼处理
	 */
	@PrintLog("打招呼处理")
	@RequestMapping(value="/s005001/e001", method= {RequestMethod.POST})
	public String e001(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("s005001Form") S005001Form form, BindingResult result, 
			S005001E001Input input, Model model) {
		
		S005001E001Output output = new S005001E001Output();
		T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        input.setUid(userLoginInfo.getUid());
		try {
			output = s005001E001Service.execute(input);
		} catch (BusinessException e) {
			model.addAttribute("message", e.getMessage());
        	return "s005001";
		}

		model.addAttribute("message", "打招呼成功!");
		model.addAttribute("s005001Form", form);

		return "s005001";

	}
	
}
