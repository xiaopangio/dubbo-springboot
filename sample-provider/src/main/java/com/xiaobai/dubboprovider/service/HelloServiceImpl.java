package com.xiaobai.dubboprovider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import com.xiaobai.dubbo.service.IHelloService;

/**
 * className: HelloServiceImpl
 * description:
 * author: xiaopangio
 * date: 2022/9/14 10:57
 * version: 1.0
 */
@DubboService
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
