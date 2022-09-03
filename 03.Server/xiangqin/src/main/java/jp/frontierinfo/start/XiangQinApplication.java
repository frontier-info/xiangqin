package jp.frontierinfo.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("jp.frontierinfo")
@MapperScan("jp.frontierinfo.db")
public class XiangQinApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiangQinApplication.class, args);
    }

}
