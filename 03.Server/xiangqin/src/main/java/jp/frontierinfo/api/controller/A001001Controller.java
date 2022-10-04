package jp.frontierinfo.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.indto.A001001E002Input;
import jp.frontierinfo.api.indto.A001001E003Input;
import jp.frontierinfo.api.indto.A001001E004Input;
import jp.frontierinfo.api.indto.A001001E005Input;
import jp.frontierinfo.api.outdto.A001001E001Output;
import jp.frontierinfo.api.outdto.A001001E002Output;
import jp.frontierinfo.api.outdto.A001001E003Output;
import jp.frontierinfo.api.outdto.A001001E004Output;
import jp.frontierinfo.api.outdto.A001001E005Output;
import jp.frontierinfo.api.service.A001001E001Service;
import jp.frontierinfo.api.service.A001001E002Service;
import jp.frontierinfo.api.service.A001001E003Service;
import jp.frontierinfo.api.service.A001001E004Service;
import jp.frontierinfo.api.service.A001001E005Service;
import jp.frontierinfo.common.exception.BusinessException;

/**
 * 用户登录系API
 * @author wusongsong
 *
 */
@RestController
public class A001001Controller extends AbstractController{
	
	public Logger logger = LoggerFactory.getLogger(A001001Controller.class);
	
	@Autowired
	private A001001E001Service a001001E001Service;
	
	@Autowired
	private A001001E002Service a001001E002Service;
	
	@Autowired
	private A001001E003Service a001001E003Service;
	
	@Autowired
	private A001001E004Service a001001E004Service;
	
	@Autowired
	private A001001E005Service a001001E005Service;

	
	/**
	 * 登录验证
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/login")
	public A001001E001Output e001(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E001Input input) {
		logger.debug(input.toString());
		A001001E001Output output = new A001001E001Output();
		try {
			output = a001001E001Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 获取验证码
	 * @param input
	 * @return
	 */
	@GetMapping("/api/user/get_verification_code")
	public A001001E002Output e002(HttpServletRequest request, HttpServletResponse response,
			A001001E002Input input) {
		logger.debug(input.toString());
		A001001E002Output output = new A001001E002Output();
		try {
			output = a001001E002Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 验证码验证
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/code_verify")
	public A001001E003Output e003(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E003Input input) {
		logger.debug(input.toString());
		A001001E003Output output = new A001001E003Output();
		try {
			output = a001001E003Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 设置密码
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/set_password")
	public A001001E004Output e004(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E004Input input) {
		logger.debug(input.toString());
		A001001E004Output output = new A001001E004Output();
		try {
			output = a001001E004Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 退出登录
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/login_out")
	public A001001E005Output e005(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E005Input input) {
		logger.debug(input.toString());
		A001001E005Output output = new A001001E005Output();
		try {
			output = a001001E005Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}
}
