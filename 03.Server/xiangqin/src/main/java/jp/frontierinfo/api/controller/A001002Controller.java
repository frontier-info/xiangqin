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
import jp.frontierinfo.api.indto.A001002E001Input;
import jp.frontierinfo.api.indto.A001002E002Input;
import jp.frontierinfo.api.indto.A001002E003Input;
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
	private A001002E001Service a001002E001Service;
	
	@Autowired
	private A001002E002Service a001002E002Service;
	
	@Autowired
	private A001002E003Service a001002E003Service;
	
	@Autowired
	private A001002E003Service a001002E004Service;

	
	/**
	 * 设置个人信息
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/info")
	public AbstractOutput e001(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001002E001Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001002E001Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 获取个人信息
	 * @param input
	 * @return
	 */
	@GetMapping("/api/user/get_info")
	public AbstractOutput e002(HttpServletRequest request, HttpServletResponse response,
			A001002E002Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001002E002Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 设置条件
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/set_condition")
	public AbstractOutput e003(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001002E003Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001002E003Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 上传图片
	 * @param input
	 * @return
	 */
	@PostMapping("/api/user/images")
	public AbstractOutput e004(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001002E003Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001002E004Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
