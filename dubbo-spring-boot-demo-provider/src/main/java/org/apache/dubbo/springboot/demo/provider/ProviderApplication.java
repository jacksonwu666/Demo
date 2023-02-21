package org.apache.dubbo.springboot.demo.provider;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @description: dubbo 生产者 启动类rR
 * @author: WuXiang
 * @create: 2023-02-21 11:30
 **/
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
