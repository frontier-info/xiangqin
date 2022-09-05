package jp.frontierinfo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.indto.A001001E002Input;
import jp.frontierinfo.api.indto.A001001E003Input;
import jp.frontierinfo.api.outdto.A001001E001Output;
import jp.frontierinfo.api.outdto.A001001E002Output;
import jp.frontierinfo.api.outdto.A001001E003Output;
import jp.frontierinfo.api.service.A001001E001Service;
import jp.frontierinfo.api.service.A001001E002Service;
import jp.frontierinfo.api.service.A001001E003Service;
import jp.frontierinfo.common.exception.BusinessException;

@RestController
public class A001001Controller extends AbstractController{
	
	@Autowired
	private A001001E001Service a001001E001Service;
	
	@Autowired
	private A001001E002Service a001001E002Service;
	
	@Autowired
	private A001001E003Service a001001E003Service;

	
	/**
	 * 登录验证
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/login")
	public A001001E001Output e001(@RequestBody A001001E001Input input) {
		System.out.println("用户名手机号"+input.getAccount());
		System.out.println("用户密码"+input.getPassword());
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
	public A001001E002Output e002(A001001E002Input input) {
		System.out.println("用户名手机号"+input.getMobile());
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
	public A001001E003Output e003(@RequestBody A001001E003Input input) {
		System.out.println("用户名手机号"+input.getMobile());
		System.out.println("用户验证码"+input.getVerificationCode());
		A001001E003Output output = new A001001E003Output();
		try {
			output = a001001E003Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}
}
