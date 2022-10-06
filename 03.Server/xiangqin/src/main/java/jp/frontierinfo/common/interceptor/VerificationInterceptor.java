package jp.frontierinfo.common.interceptor;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alibaba.fastjson.JSONObject;

import jp.frontierinfo.api.abstractcls.AbstractInput;
import jp.frontierinfo.common.exception.BusinessException;

/**
 * API Token验证用拦截器
 * 
 * @author wusongsong
 *
 */
@Aspect
@Component()
public class VerificationInterceptor {

	public Logger logger = LoggerFactory.getLogger(VerificationInterceptor.class);
	
	private List<String> notVerificationList;
	
	public VerificationInterceptor() {
		notVerificationList = new ArrayList<>();
		notVerificationList.add("/api/user/login");
		notVerificationList.add("/api/user/get_verification_code");
		notVerificationList.add("/api/user/code_verify");
	}

	@Pointcut("execution (* jp.frontierinfo.api.controller.*.*(..))")
	public void verificationPoint() {
		
	}

	@Around("verificationPoint()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		try {
			before(proceedingJoinPoint);
			result = proceedingJoinPoint.proceed();
		} catch (BusinessException be) {
			createResponse(proceedingJoinPoint, be);
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return result;
	}

	public void before(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Field methodInvocationField = proceedingJoinPoint.getClass().getDeclaredField("methodInvocation");
		methodInvocationField.setAccessible(true);
		MethodInvocation methodInvocation = (MethodInvocation)methodInvocationField.get(proceedingJoinPoint);
		String mappingValue = null;
		try {
			PostMapping anno = methodInvocation.getMethod().getAnnotation(PostMapping.class);
			mappingValue = anno.value()[0];
		} catch (Exception e) {
			GetMapping anno = methodInvocation.getMethod().getAnnotation(GetMapping.class);
			mappingValue = anno.value()[0];
		}
		
		if(notVerificationList.contains(mappingValue)) {
			logger.debug("token验证对象外"+mappingValue);
			return;
		}
		
		Object[] args = proceedingJoinPoint.getArgs();
		for(Object arg : args) {
			if(arg instanceof AbstractInput) {
				Field token = arg.getClass().getDeclaredField("token");
				token.setAccessible(true);
				logger.debug("token:"+token.get(arg));
//				TokenUtils.verifyLogin(token.get(arg).toString());
			}
		}
	}
	
	private HttpServletResponse createResponse(ProceedingJoinPoint proceedingJoinPoint, BusinessException be) {
		HttpServletResponse response = null;
		for(Object arg : proceedingJoinPoint.getArgs()) {
			if(arg instanceof HttpServletResponse) {
				response = (HttpServletResponse)arg;
				// 验证失败
				response.setCharacterEncoding("UTF-8");
				response.setContentType("application/json; charset=UTF-8");
				response.setStatus(HttpServletResponse.SC_OK);
				
				PrintWriter writer = null;
				Object obj = new Object();
				
				JSONObject josnObject = new JSONObject();
				josnObject.put("code", "0");
				josnObject.put("message", be.getMessage());
				josnObject.put("data", obj);
				
				try {
					writer = response.getWriter();
					writer.print(josnObject);
					writer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return response;
		
	}
}
