package com.xiaobai.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaobai.dubbo.service.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * className: DubboConsumerMain
 * description:
 * author: xiaopangio
 * date: 2022/9/14 11:15
 * version: 1.0
 */
@SpringBootApplication
public class DubboConsumerMain {
    @DubboReference(url = "dubbo://localhost:20880/com.xiaobai.dubbo.service.IHelloService")
    private IHelloService helloService;
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerMain.class, args);
    }
    @Bean
    public ApplicationRunner runner(){
        return args -> System.out.println(helloService.sayHello("xiaobai"));
    }
}
