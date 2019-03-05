package com.dubbo.demo.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.dubbo.demo.server.mapper")  //必须加这个，不加报错，如果不加，也可以在每个mapper上添加@Mapper注释
@EnableScheduling  //定时任务注解
public class ServerApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServerApp.class);
    }
}
