package jp.frontierinfo.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import jp.frontierinfo.common.constant.ConstantInfo;

/**
 * 用户登录状态校验用拦截器
 * 
 * @author wusongsong
 *
 */
public class NoLoginInterceptor implements HandlerInterceptor{

	public Logger logger = LoggerFactory.getLogger(NoLoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 判断当前用户是否登录
		if(request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO) == null) {
			request.setAttribute("message", "登录过期,请重新登录");
			logger.debug("URL:"+request.getRequestURL());
			request.getRequestDispatcher("/ui/s001001").forward(request, response);
			return false;
		}
		return true;
	}

}
