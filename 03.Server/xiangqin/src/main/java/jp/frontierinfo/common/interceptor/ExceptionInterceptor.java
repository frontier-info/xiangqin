package jp.frontierinfo.common.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 全局异常处理
 * @author wusongsong
 *
 */
@Aspect
@Component
public class ExceptionInterceptor {
	
    private Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

    @Pointcut("execution (* jp.frontierinfo.ui.controller.*.*(..))")
    public void exceptionPointCut(){
    }

	@Around("exceptionPointCut()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			logger.error(e.getMessage());
		} catch (Throwable t) {
			logger.error(t.getMessage());
		}
		return result;
	}

}
