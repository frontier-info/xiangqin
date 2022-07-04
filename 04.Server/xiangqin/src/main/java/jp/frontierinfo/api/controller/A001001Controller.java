package jp.frontierinfo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.api.abstractcls.ResponseResult;
import jp.frontierinfo.api.indto.A001001E001Input;
import jp.frontierinfo.api.outdto.A001001E001Output;
import jp.frontierinfo.api.service.A001001Service;

@RestController
public class A001001Controller extends AbstractController{
	
	@Autowired
	private A001001Service a001001E001Service;

	@PostMapping("/api/user/login")
	public ResponseResult e001(@RequestBody A001001E001Input input) {
		System.out.println("用户名手机号"+input.getAccount());
		System.out.println("用户密码"+input.getPassword());
		ResponseResult result = new ResponseResult();
		A001001E001Output output = a001001E001Service.execute(input);
		result.setCode("200");
		result.setMessage("success");
		result.setData(output);
		return result;
	}
}
