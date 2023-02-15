package jp.frontierinfo.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jp.frontierinfo.common.interceptor.NoLoginInterceptor;

@Configuration
public class FIWebConfigurer implements WebMvcConfigurer {

	public Logger logger = LoggerFactory.getLogger(FIWebConfigurer.class);
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	logger.debug("ログイン済チェックインターセプター:NoLoginInterceptor");
        registry.addInterceptor(new NoLoginInterceptor())
                .addPathPatterns("/ui/**") // リソース以外のアクセスをすべて遮断
                .excludePathPatterns("/ui/s001001", 
                		"/ui/s002001/e003", 
                		"/ui/s001002", 
                		"/ui/s001003", 
                		"/resources/js/**",
                		"/resources/css/**",
                		"/resources/image/**"); 
    }
}
