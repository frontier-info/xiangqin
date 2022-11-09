package jp.frontierinfo.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.frontierinfo.api.abstractcls.AbstractController;
import jp.frontierinfo.api.abstractcls.AbstractOutput;
import jp.frontierinfo.api.indto.A001003E001Input;
import jp.frontierinfo.api.indto.A001003E002Input;
import jp.frontierinfo.api.service.A001003E001Service;
import jp.frontierinfo.api.service.A001003E002Service;
import jp.frontierinfo.common.exception.BusinessException;

/**
 * 首页系API
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
}
