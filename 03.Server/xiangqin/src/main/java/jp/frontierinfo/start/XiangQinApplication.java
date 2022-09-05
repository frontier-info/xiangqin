package jp.frontierinfo.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages="jp.frontierinfo")
@MapperScan("jp.frontierinfo.db")
public class XiangQinApplication extends SpringBootServletInitializer {
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(XiangQinApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(XiangQinApplication.class, args);
    }

}
