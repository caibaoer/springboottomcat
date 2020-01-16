package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//可以配置tomcat后，在tomcat启动
@SpringBootApplication
public class SpringboottomcatApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringboottomcatApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
        //return builder.sources(SpringboottomcatApplication.class);
    }
}
