package com.linshen.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.linshen.dubbo.baseinterface.service.HelloService;
/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/7/10
 * @Description: TODO
 */
@Service(
        version = "${hello.service.version}",
        application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+" !";
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye "+name+" !";
    }
}
