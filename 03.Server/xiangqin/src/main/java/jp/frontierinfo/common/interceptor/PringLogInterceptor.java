package jp.frontierinfo.common.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jp.frontierinfo.common.annotation.PrintLog;
import jp.frontierinfo.common.constant.ConstantInfo;
import jp.frontierinfo.db.entity.T01UserLoginInfo;

/**
 * 控制器方法执行时的日志输出
 * @author wusongsong
 *
 */
@Aspect
@Component
public class PringLogInterceptor {
	
    private Logger logger = LoggerFactory.getLogger(PringLogInterceptor.class);

    @Pointcut("@annotation(jp.frontierinfo.common.annotation.PrintLog)")
    public void ControllerPointCut(){
        // 以注解处为切入点
    }
    
    @Before("ControllerPointCut()")
    public void doBefore(JoinPoint joinPoint){
    	// Controller前置日志输出
        String value = getPringLogAnnoValue(joinPoint);
        logger.info("★★★★★  ["+value+"]处理开始  ★★★★★");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 获取url,请求方法，ip地址，类名以及方法名
        logger.debug("★★★★★  url:[{}],method:[{}],ip:[{}]  ★★★★★", request.getRequestURI(),request.getMethod(),request.getRemoteAddr());
        
        // 获取操作用户的ID
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        if(userLoginInfo != null) {
        	logger.debug("★★★★★  当前操作用户:["+userLoginInfo.getUid()+"]  ★★★★★");
        }

    }
    
    @AfterReturning(pointcut = "ControllerPointCut()")
    public void printLog(JoinPoint joinPoint){
    	// Controller后置日志输出
        String value = getPringLogAnnoValue(joinPoint);
        logger.info("★★★★★  ["+value+"]处理结束  ★★★★★");
    }
    
    private String getPringLogAnnoValue(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        PrintLog printLog = method.getAnnotation(PrintLog.class);
    	return printLog.value();
    }

}
