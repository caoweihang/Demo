package com.baizhi;

//import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
