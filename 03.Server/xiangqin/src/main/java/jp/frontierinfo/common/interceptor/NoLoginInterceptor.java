package jp.frontierinfo.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import jp.frontierinfo.common.constant.ConstantInfo;

/**
 * ユーザーログイン状態確認のインターセプター
 * 
 * @author wusongsong
 *
 */
public class NoLoginInterceptor implements HandlerInterceptor{

	public Logger logger = LoggerFactory.getLogger(NoLoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// ユーザーがログインしているかどうかを確認
		if(request.getSession().getAttribute(ConstantInfo.USER_LOGIN_INFO) == null) {
			request.setAttribute("message", "ログイン期間が過ぎましたため、再ログインしてください。");
			logger.debug("URL:"+request.getRequestURL());
			request.getRequestDispatcher("/ui/s001001").forward(request, response);
			return false;
		}
		return true;
	}

}
