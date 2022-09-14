package com.xiaobai.dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className: DubboProviderMain
 * description:
 * author: xiaopangio
 * date: 2022/9/14 11:02
 * version: 1.0
 */
@SpringBootApplication
@DubboComponentScan
public class DubboProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderMain.class, args);
    }
}
