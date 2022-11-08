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
import jp.frontierinfo.api.indto.A001003E001Input;
import jp.frontierinfo.api.indto.A001003E002Input;
import jp.frontierinfo.api.indto.A001003E003Input;
import jp.frontierinfo.api.indto.A001003E004Input;
import jp.frontierinfo.api.indto.A001003E005Input;
import jp.frontierinfo.api.service.A001003E001Service;
import jp.frontierinfo.api.service.A001003E002Service;
import jp.frontierinfo.api.service.A001003E003Service;
import jp.frontierinfo.api.service.A001003E004Service;
import jp.frontierinfo.api.service.A001003E005Service;
import jp.frontierinfo.common.exception.BusinessException;

/**
 * 用户邀约操作系API
 * @author wusongsong
 *
 */
@RestController
public class A001003Controller extends AbstractController{
	
	public Logger logger = LoggerFactory.getLogger(A001003Controller.class);
	
	@Autowired
	private A001003E001Service a001003E001Service;
	
	@Autowired
	private A001003E002Service a001003E002Service;
	
	@Autowired
	private A001003E003Service a001003E003Service;
	
	@Autowired
	private A001003E004Service a001003E004Service;
	
	@Autowired
	private A001003E005Service a001003E005Service;

	
	/**
	 * 获取推荐列表
	 * @param input
	 * @return
	 */
	@GetMapping("/api/home/recommend")
	public AbstractOutput e001(HttpServletRequest request, HttpServletResponse response,
			A001003E001Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001003E001Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 发起邀约
	 * @param input
	 * @return
	 */
	@PostMapping("/api/home/send_invite")
	public AbstractOutput e002(HttpServletRequest request, HttpServletResponse response,
			A001003E002Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001003E002Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 获取邀约对象列表
	 * @param input
	 * @return
	 */
	@GetMapping("/api/home/relation_list")
	public AbstractOutput e003(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001003E003Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001003E003Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 获取邀约对象信息
	 * @param input
	 * @return
	 */
	@GetMapping("/api/home/relation_info")
	public AbstractOutput e004(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001003E004Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001003E004Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 同意交换联系方式
	 * @param input
	 * @return
	 */
	@PostMapping("/api/home/make_friend")
	public AbstractOutput e005(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001003E005Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001003E005Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
