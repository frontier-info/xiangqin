package jp.frontierinfo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.api.abstractcls.ResponseResult;
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

	@PostMapping("/api/user/login")
	public ResponseResult e001(@RequestBody A001001E001Input input) {
		System.out.println("用户名手机号"+input.getAccount());
		System.out.println("用户密码"+input.getPassword());
		ResponseResult result = new ResponseResult();
		A001001E001Output output = a001001E001Service.execute(input);
		result.setCode("1");
		result.setMessage("success");
		result.setData(output);
		return result;
	}

	/**
	 * 获取验证码
	 * @param input
	 * @return
	 */
	@GetMapping("/api/user/get_verification_code")
	public ResponseResult e002(A001001E002Input input) {
		System.out.println("用户名手机号"+input.getMobile());
		ResponseResult result = new ResponseResult();
		A001001E002Output output = a001001E002Service.execute(input);
		result.setCode("1");
		result.setMessage("success");
		result.setData(output);
		return result;
	}

	/**
	 * 验证码验证
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/code_verify")
	public ResponseResult e003(@RequestBody A001001E003Input input) {
		System.out.println("用户名手机号"+input.getMobile());
		System.out.println("用户验证码"+input.getVerificationCode());
		ResponseResult result = new ResponseResult();
		A001001E003Output output = new A001001E003Output();
		try {
			output = a001001E003Service.execute(input);
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
			return result;
		}
		result.setCode("1");
		result.setMessage("success");
		result.setData(output);
		return result;
	}
}
