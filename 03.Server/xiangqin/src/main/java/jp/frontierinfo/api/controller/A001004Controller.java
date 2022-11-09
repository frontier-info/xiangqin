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
import jp.frontierinfo.api.indto.A001004E001Input;
import jp.frontierinfo.api.indto.A001004E002Input;
import jp.frontierinfo.api.indto.A001004E003Input;
import jp.frontierinfo.api.indto.A001004E004Input;
import jp.frontierinfo.api.service.A001004E001Service;
import jp.frontierinfo.api.service.A001004E002Service;
import jp.frontierinfo.api.service.A001004E003Service;
import jp.frontierinfo.api.service.A001004E004Service;
import jp.frontierinfo.common.exception.BusinessException;

/**
 * 用户邀约操作系API
 * @author wusongsong
 *
 */
@RestController
public class A001004Controller extends AbstractController{
	
	public Logger logger = LoggerFactory.getLogger(A001004Controller.class);
	
	@Autowired
	private A001004E001Service a001004E001Service;
	
	@Autowired
	private A001004E002Service a001004E002Service;
	
	@Autowired
	private A001004E003Service a001004E003Service;
	
	@Autowired
	private A001004E004Service a001004E004Service;

	/**
	 * 获取邀约对象列表
	 * @param input
	 * @return
	 */
	@GetMapping("/api/home/relation_list")
	public AbstractOutput e001(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001004E001Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001004E001Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 获取被邀约对象列表
	 * @param input
	 * @return
	 */
	@GetMapping("/api/home/be_related_list")
	public AbstractOutput e002(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001004E002Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001004E002Service.execute(input));
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
	public AbstractOutput e003(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001004E003Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001004E003Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 回复邀约操作
	 * @param input
	 * @return
	 */
	@PostMapping("/api/home/reply")
	public AbstractOutput e004(HttpServletRequest request, HttpServletResponse response,
			@RequestBody A001004E004Input input) {
		logger.debug(input.toString());
		AbstractOutput result = new AbstractOutput();
		try {
			result.setData(a001004E004Service.execute(input));
		} catch (BusinessException e) {
			result.setCode("0");
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
