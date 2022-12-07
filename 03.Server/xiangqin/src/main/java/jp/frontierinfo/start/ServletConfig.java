package jp.frontierinfo.start;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Globals;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.servlets.DefaultServlet;
import org.apache.catalina.webresources.DirResourceSet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.frontierinfo.common.constant.ConstantInfo;

@Configuration
public class ServletConfig {
		/**
		*配置DownloadServlet，拦截/static/* 和 /download/*的请求，且程序启动后就初始化而不是等第一次访问才初始化
		*
		*/
	@Bean
    public ServletRegistrationBean<Servlet> servletRegistrationBean() {
        ServletRegistrationBean<Servlet> register = new ServletRegistrationBean<>();
        DefaultServlet defaultServlet = new DownloadServlet();
        register.setServlet(defaultServlet);
        register.addUrlMappings("/static/*", "/download/*");
        register.setLoadOnStartup(1);
        return register;
    }

	//继承defaultServlet
    private static class DownloadServlet extends DefaultServlet {

        private static final long serialVersionUID = 1537326382082402617L;

        /*
         *  String amount = "/download";  //从文件path中移除此路径,前置路径 如访问路径是 localhost/download/123.jpg,则真实查找路径是'/123.jpg'（即移除'/download')
         *  String basePath = "d:/files"; //文件存储所在的文件夹绝对路径,末尾不要以‘/’结尾
         *  String internalPath = "/"; // 不知道有什么用，DirResourceSet应该没用到
         *  DefaultServlet使用若干个ResourceSet进行读取资源，默认读取tomcat项目根目录下的文件，我们自己在设置两个，分别处理/static的和/download的请求
         * */
        @Override
        public void init() throws ServletException {
            WebResourceRoot attribute = (WebResourceRoot) getServletContext().getAttribute(Globals.RESOURCES_ATTR);

            attribute.addPreResources(new DirResourceSet(attribute, "/static", ConstantInfo.FILE_SAVE_PATH, "/"));
            attribute.addPreResources(new DirResourceSet(attribute, "/download", ConstantInfo.FILE_SAVE_PATH, "/"));
            super.init();
        }

		//如果是/download开头的请求，则设置ContentType为流，否则servlet会自行推理，如图片就会直接打开而不是下载
        @Override
        public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            if (req.getRequestURI().startsWith("/download")) {
                resp.setContentType("application/octet-stream");
            }
            super.service(req, resp);
        }
    }

}
