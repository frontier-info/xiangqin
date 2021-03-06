package jp.frontierinfo.api.service;

import org.springframework.stereotype.Service;

import jp.frontierinfo.api.abstractcls.AbstractServiceImpl;
import jp.frontierinfo.api.indto.A001001E002Input;
import jp.frontierinfo.api.outdto.A001001E002Output;
import jp.frontierinfo.common.utils.TokenUtils;

@Service
public class A001001E002Service extends AbstractServiceImpl<A001001E002Input, A001001E002Output>{
	
	@Override
	public A001001E002Output execute(A001001E002Input input) {
		A001001E002Output output = new A001001E002Output();
		
		// 生成6位验证码
		String verificationCode = String.valueOf((int)(Math.random()*9+1)*100000);
		System.out.println("用户验证码:"+verificationCode);
		
		// TODO
		// 此处接入手机验证码短信发送服务, 向用户发送此处生成的6位验证码
		// hogehoge
		
		// 生成手机短信验证码验证token
		output.setVerificationCode(TokenUtils.tokenForVerificationCode(input.getMobile(), verificationCode));
		return output;
	}

}
