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
 * Controllerメソッド実行時のログ出力
 * @author wusongsong
 *
 */
@Aspect
@Component
public class PringLogInterceptor {
	
    private Logger logger = LoggerFactory.getLogger(PringLogInterceptor.class);

    @Pointcut("@annotation(jp.frontierinfo.common.annotation.PrintLog)")
    public void ControllerPointCut(){
        // PrintLogアノテーションからカット
    }
    
    @Before("ControllerPointCut()")
    public void doBefore(JoinPoint joinPoint){
    	// Controller実行前のログ出力
        String value = getPringLogAnnoValue(joinPoint);
        logger.info("★★★★★  ["+value+"]处理开始  ★★★★★");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url、アクセスメソッド、ipアドレス
        logger.debug("★★★★★  url:[{}],method:[{}],ip:[{}]  ★★★★★", request.getRequestURI(),request.getMethod(),request.getRemoteAddr());
        
        // 获取操作ユーザーのID
        T01UserLoginInfo userLoginInfo = (T01UserLoginInfo) request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO);
        if(userLoginInfo != null) {
        	logger.debug("★★★★★  ユーザー情報:["+userLoginInfo.getUid()+"]  ★★★★★");
        }

    }
    
    @AfterReturning(pointcut = "ControllerPointCut()")
    public void printLog(JoinPoint joinPoint){
    	// Controller実行後のログ出力
        String value = getPringLogAnnoValue(joinPoint);
        logger.info("★★★★★  ["+value+"]处理終了  ★★★★★");
    }
    
    private String getPringLogAnnoValue(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        PrintLog printLog = method.getAnnotation(PrintLog.class);
    	return printLog.value();
    }

}
