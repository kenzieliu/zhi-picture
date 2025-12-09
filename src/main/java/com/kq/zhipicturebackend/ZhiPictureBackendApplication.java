package com.kq.zhipicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.kq.zhipicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class ZhiPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiPictureBackendApplication.class, args);
    }

}
