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
import jp.frontierinfo.api.abstractcls.AbstractOutput;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.indto.A001001E002Input;
import jp.frontierinfo.api.indto.A001001E003Input;
import jp.frontierinfo.api.indto.A001001E004Input;
import jp.frontierinfo.api.indto.A001001E005Input;
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
	public AbstractOutput e001(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E001Input input) {
		logger.debug(input.toString());
		
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001001E001Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 获取验证码
	 * @param input
	 * @return
	 */
	@GetMapping("/api/user/get_verification_code")
	public AbstractOutput e002(HttpServletRequest request, HttpServletResponse response,
			A001001E002Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001001E002Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 验证码验证
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/code_verify")
	public AbstractOutput e003(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E003Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001001E003Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 设置密码
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/set_password")
	public AbstractOutput e004(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E004Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001001E004Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 退出登录
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/login_out")
	public AbstractOutput e005(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001001E005Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001001E005Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
