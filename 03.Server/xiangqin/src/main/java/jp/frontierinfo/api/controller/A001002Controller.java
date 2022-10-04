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
import jp.frontierinfo.api.indto.A001002E001Input;
import jp.frontierinfo.api.indto.A001002E002Input;
import jp.frontierinfo.api.indto.A001002E003Input;
import jp.frontierinfo.api.outdto.A001002E001Output;
import jp.frontierinfo.api.outdto.A001002E002Output;
import jp.frontierinfo.api.outdto.A001002E003Output;
import jp.frontierinfo.api.service.A001002E001Service;
import jp.frontierinfo.api.service.A001002E002Service;
import jp.frontierinfo.api.service.A001002E003Service;
import jp.frontierinfo.common.exception.BusinessException;

/**
 * 用户个人信息操作系API
 * @author wusongsong
 *
 */
@RestController
public class A001002Controller extends AbstractController{
	
	public Logger logger = LoggerFactory.getLogger(A001002Controller.class);
	
	@Autowired
	private A001002E001Service A001002E001Service;
	
	@Autowired
	private A001002E002Service A001002E002Service;
	
	@Autowired
	private A001002E003Service A001002E003Service;
	
	@Autowired
	private A001002E003Service A001002E004Service;

	
	/**
	 * 设置个人信息
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/info")
	public A001002E001Output e001(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001002E001Input input) {
		logger.debug(input.toString());
		A001002E001Output output = new A001002E001Output();
		try {
			output = A001002E001Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 获取个人信息
	 * @param input
	 * @return
	 */
	@GetMapping("/api/user/get_info")
	public A001002E002Output e002(HttpServletRequest request, HttpServletResponse response,
			A001002E002Input input) {
		logger.debug(input.toString());
		A001002E002Output output = new A001002E002Output();
		try {
			output = A001002E002Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 设置条件
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/set_condition")
	public A001002E003Output e003(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001002E003Input input) {
		logger.debug(input.toString());
		A001002E003Output output = new A001002E003Output();
		try {
			output = A001002E003Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}

	/**
	 * 上传图片
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/images")
	public A001002E003Output e004(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001002E003Input input) {
		logger.debug(input.toString());
		A001002E003Output output = new A001002E003Output();
		try {
			output = A001002E003Service.execute(input);
		} catch (BusinessException e) {
			output.setCode("0");
			output.setMessage(e.getMessage());
		}
		return output;
	}
}
